import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int T, M, N, K;
	static int[][] arr;
	static boolean[][] visited;
	static int[] arrA, arrB;
	static int[] x = {-1,0,0,1};
	static int[] y = {0,-1,1,0};
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스 수
		T = Integer.parseInt(br.readLine());

		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			
			// 가로 길이
			M = Integer.parseInt(st.nextToken());
			// 세로 길이
			N = Integer.parseInt(st.nextToken());
			// 배추의 개수
			K = Integer.parseInt(st.nextToken());
			
			arr = new int[M][N];
			visited = new boolean[M][N];
			
			arrA = new int[K];
			arrB = new int[K];
			
			for(int i=0; i<K; i++) {
				st = new StringTokenizer(br.readLine());
				
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				arrA[i] = A;
				arrB[i] = B;
				
				arr[A][B] = 1;
			}
			
			sb.append(DFS() + "\n");
		}
		
		System.out.println(sb);
	}
	
	public static int DFS() {
		
		int count = 0;
		
		Queue<int[]> queue = new LinkedList<int[]>();
		
		for(int i=0; i<K; i++) {
			// 방문하지 않은 노드
			if(!visited[arrA[i]][arrB[i]]) {
				queue.add(new int[] {arrA[i], arrB[i]});
				count++;
			}
			
			while(!queue.isEmpty()) {
				int[] node = queue.poll();
				
				int tempX = node[0];
				int tempY = node[1];

				// 상하좌우
				for(int j=0; j<4; j++) {
					int realX = tempX + x[j];
					int realY = tempY + y[j];
					
					if(realX >= 0 && realY >= 0 && realX < M && realY < N) {
						if(!visited[realX][realY] && arr[realX][realY] == 1) {
							queue.offer(new int[] {realX, realY});
							visited[realX][realY] = true;
						}
					}
				}
			}
		}
		
		return count;
	}
}