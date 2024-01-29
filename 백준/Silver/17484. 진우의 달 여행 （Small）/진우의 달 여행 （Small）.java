import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int N;
	static int M;
	static int[][] arr;
	static int[] dx, dy;
	static int answer = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dx = new int[] {1, 1, 1};
		dy = new int[] {-1, 0, 1};
		
		for(int i=0; i<M; i++) {
			int ans = 0;
			ans += arr[0][i];
			
			dfs(0, i, ans, 3);
		}
		System.out.println(answer);
	}
	
	private static void dfs(int x, int y, int ans, int dir) {
		if(x == N-1) {
			if(ans < answer) answer = ans;
			return;
		}
		
		for(int i=0; i<3; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if((dir != i) && isIn(nx, ny)) {
				dfs(nx, ny, ans + arr[nx][ny], i);
			}
		}
	}
	
	private static boolean isIn(int x, int y) {
		return x >= 0 && x < N && y >= 0 && y < M;
	}
}