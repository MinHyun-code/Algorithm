import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static Integer[][] arr;
	static boolean[][] visited;
	static int[] moveX = {0, 0, -1, 1};	// 상하좌우 순
	static int[] moveY = {1, -1, 0, 0}; 
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new Integer[N+1][M+1];
		visited = new boolean[N+1][M+1];
		
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			for(int j=1; j<=str.length(); j++) {
				int num = Integer.parseInt(str.substring(j-1, j));
				arr[i][j] = num;
			}
		}
		
		BFS(1, 1);
		
		System.out.println(arr[N][M]);
 	}
	
	public static void BFS(int x, int y) {
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		
		queue.add(new Integer[]{1, 1});
		
		while(!queue.isEmpty()) {
			Integer[] temp = queue.poll();
			// 방문
			visited[temp[0]][temp[1]] = true;

			for(int i=0; i<4; i++) {
				int numX = temp[0] + moveX[i];
				int numY = temp[1] + moveY[i];

				if(numX > 0 && numY > 0 && numX < N+1 && numY < M+1) {
					if(arr[numX][numY] > 0 && visited[numX][numY] == false) {
						queue.add(new Integer[] {numX, numY});
						visited[numX][numY] = true;
						arr[numX][numY] = arr[temp[0]][temp[1]]+1;
					}
				}
			}
		}
	}
} 