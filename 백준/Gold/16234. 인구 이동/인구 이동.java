import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int N, L, R;
	static int[][] A;
	static int count = 0;
	static boolean[][] visited;
	static int[] x = new int[] {0, 0, -1, 1};
	static int[] y = new int[] {1, -1, 0, 0};
	static int sum;
	
	static int sameValue;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		A = new int[N+1][N+1];
		visited = new boolean[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		
		while(true) {
			sameValue = 0;
			visited = new boolean[N+1][N+1];
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
						sum = 0;
						if(!visited[i][j]) {
							BFS(i, j);
						}
				}
			}
			
			if(sameValue == N * N) {
				break;
			}

			count++;
		}
		
		System.out.println(count);
	}
	
	public static void BFS(int pointX, int pointY) {
		
		Queue<int[]> queue = new LinkedList<int[]>();
		List<int[]> list = new ArrayList<int[]>();
		
		// 방문했으면 바로 return
		if(visited[pointX][pointY]) {
			return;
		}
		
		visited[pointX][pointY] = true;
		queue.add(new int[] {pointX, pointY});
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			
			list.add(temp);
			sum += A[temp[0]][temp[1]];
			
			for(int i=0; i<4; i++) {
				int tempX = temp[0] + x[i];
				int tempY = temp[1] + y[i];
				
				if(tempX >= 1 && tempX <= N && tempY >= 1 && tempY <= N && visited[tempX][tempY] == false) {
					
					if(Math.abs(A[temp[0]][temp[1]] - A[tempX][tempY]) >= L && Math.abs(A[temp[0]][temp[1]] - A[tempX][tempY]) <= R) {
						visited[tempX][tempY] = true;
						queue.add(new int[] {tempX, tempY});
					}
				}
			}
		}
		
		if(sum == A[pointX][pointY]) {
			sameValue++;
			return;
		}
		
		int avg = sum / list.size();
		
		for(int i=0; i<list.size(); i++) {
			int[] temp = list.get(i);
			A[temp[0]][temp[1]] = avg;
		}
		
//		System.out.println("sameValue : " + sameValue);
//		
//		for(int i=1; i<=N; i++) {
//			System.out.println(Arrays.toString(A[i]));
//		}
//		System.out.println("===========================");
	}
}