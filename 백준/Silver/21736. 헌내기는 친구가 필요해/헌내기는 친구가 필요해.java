import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
	static String[][] arr;
	static boolean[][] visited;
	static int n,m;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());

		// 지도의 크기
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new String[n][m];
		visited = new boolean[n][m];
		
		// 처음 위치
		int x = 0;
		int y = 0;
		
		for(int i=0; i<n; i++) {
			
			String str = br.readLine();
			
			for(int j=0; j<m; j++) {
				arr[i][j] = str.substring(j, j+1);
				// 처음 위치 설정
				if(arr[i][j].equals("I")) {
					x = i;
					y = j;
				} 
				// 갈 수 없는 곳
				else if(arr[i][j].equals("X")) {
					visited[i][j] = true;
				}
			}
		}
		
		doSearch(x, y);
		
		if(cnt == 0) {
			System.out.println("TT");
		} else {
			System.out.println(cnt);
		}
	}
	
	public static void doSearch(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		
		queue.add(new int[] {x,y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int temp[] = queue.poll();
			
			for(int i=0; i<4; i++) {
				int a = temp[0] + dx[i];
				int b = temp[1] + dy[i];
				
				if(a >= 0 && b >= 0 && a < n && b < m) {
					if(!visited[a][b] && (arr[a][b].equals("O") || arr[a][b].equals("P"))) {
						visited[a][b] = true;
						
						queue.add(new int[] {a, b});
						
						if(arr[a][b].equals("P")) {
							cnt++;
						}
					}
				}
			}
		}
	}
	
}