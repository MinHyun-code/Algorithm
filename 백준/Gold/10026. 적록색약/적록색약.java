import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int N;
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	static int count = 0;
	
	public static void main(String[] args) throws IOException{
		
		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j]) {
					case1(i,j, arr[i][j]);
					count++;
				}
			}
		}
		
		sb.append(count).append(" ");
		
		visited = new boolean[N][N];
		count = 0;

		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j]) {
					if(arr[i][j] == 'R') {
						arr[i][j] = 'G';
					}
					case2(i,j, arr[i][j]);
					count++;
				}
			}
		}
		
		sb.append(count);
		System.out.println(sb);
	}
	
	// 적록색약이 없는 경우
	public static void case1(int x, int y, char t) {
		
		if(visited[x][y]) {
			return;
		}

		Queue<int[]> queue = new LinkedList<int[]>();
		
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			
			for(int i=0; i<4; i++) {
				
				int tempX = temp[0] + dx[i];
				int tempY = temp[1] + dy[i];
				
				if(tempX >= 0 && tempY >= 0 && tempX < N && tempY < N) {
					if(visited[tempX][tempY] == false) {

						if(arr[tempX][tempY] == t) {
							queue.add(new int[] {tempX, tempY});
							visited[tempX][tempY] = true;
						}
					}
				}
			}
		}
	}
	
	// 적록색약이 있는 경우
	public static void case2(int x, int y, char t) {
		if(visited[x][y]) {
			return;
		}
		
		Queue<int[]> queue = new LinkedList<int[]>();
		
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			
			for(int i=0; i<4; i++) {
				
				int tempX = temp[0] + dx[i];
				int tempY = temp[1] + dy[i];
				
				if(tempX >= 0 && tempY >= 0 && tempX < N && tempY < N) {
					if(visited[tempX][tempY] == false) {
						if(arr[tempX][tempY] == 'R') {
							arr[tempX][tempY] = 'G';
						}

						if(arr[tempX][tempY] == t) {
							queue.add(new int[] {tempX, tempY});
							visited[tempX][tempY] = true;
						}
					}
				}
			}
		}
	}
}