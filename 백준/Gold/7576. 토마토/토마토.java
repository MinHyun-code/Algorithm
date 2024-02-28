import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int N, M;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = new int[] {0, 0, -1, 1};	// 상하좌우 셋팅
	static int[] dy = new int[] {1, -1, 0, 0};
	static List<int[]> list = new ArrayList<int[]>();
	
	static int result = 0;
	static int RipeCnt = 0;		// 익은 토마토 갯수
	static int noRipeCnt = 0;	// 안익은 토마토 갯수
	
	public static void main(String[] args) throws IOException{

		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M][N];
		visited = new boolean[M][N];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					list.add(new int[] {i, j});
					RipeCnt++;
				}
				else if(arr[i][j] == 0) {
					noRipeCnt++;
				}
			}
		}
	
		// 안익은 토마토가 없을 경우
		if(noRipeCnt == 0) {
			result = 0;
		} 
		
		// 익은 토마토가 없는 경우
		else if(RipeCnt == 0) {
			result = -1;
		} 
		
		else {
			func();	
		}
		
		System.out.println(result);
	}
	
	public static void func() {
		
		Queue<int[]> queue = new LinkedList<int[]>();
		
		for(int[] temp : list) {
			queue.add(temp);
			visited[temp[0]][temp[1]] = true;
		}
		
		int addCnt = RipeCnt;
		
		while(!queue.isEmpty()) {
			int cnt = 0;
			boolean tf = false;
			for(int i=0; i<addCnt; i++) {
				int[] temp = queue.poll();
				visited[temp[0]][temp[1]] = true;
				
				for(int j=0; j<4; j++) {
					int tempX = temp[0] + dx[j];
					int tempY = temp[1] + dy[j];

					if(tempX >= 0 && tempY >= 0 && tempX < M && tempY < N) {
						if(visited[tempX][tempY] == false) {
							if(arr[tempX][tempY] == 0) {
								arr[tempX][tempY] = 1;
								queue.add(new int[] {tempX, tempY});
								tf = true;
								cnt++;
							}
							visited[tempX][tempY] = true;
						}
					}
				}
			}
				
			if(cnt > 0) {
				addCnt = cnt;
			}
			
			if(tf) {
				result++;
			}
		}

		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j] == 0) {
					result = -1;
					return;
				}
			}
		}
		
	}
}