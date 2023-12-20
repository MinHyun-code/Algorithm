import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
	static int[][] arr, result;
	static boolean[][] visited;
	static int n,m;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());

		// 지도의 크기
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m]; // 지도
		result = new int[n][m]; // 거리
		visited = new boolean[n][m]; // 방문 여부
		int x = 0,y = 0;	// 목표 지점
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 2) {
					x = i;
					y = j;
				} 
				// 갈 수 없는 땅
				else if(arr[i][j] == 0) {
					visited[i][j] = true;
				}
			}
		}
		
		search(x, y);

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!visited[i][j]) { // 도달할 수 없는 위치
					result[i][j]=-1;
				}	
				System.out.print(result[i][j]+" ");	
			}
			System.out.println();
		}
	}
	
	// BFS (너비 우선 탐색)
	private static void search(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {x,y});	// 도착지점 queue에 넣기
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int temp[]  = queue.poll();
			
			// (좌 우 하 상)순 탐색
			for(int i=0; i<4; i++) {
				int a = temp[0] + dx[i];
				int b = temp[1] + dy[i];
				
				if(a>=0 && a<n && b>=0 && b<m) {
					// 방문 여부를 조건에 넣은 이유 : 마지막 노드에서 무한 루프 
					if(!visited[a][b] && arr[a][b] == 1) {
						visited[a][b] = true;
						result[a][b] = result[temp[0]][temp[1]]+1; // 이전 노드의 + 1
						queue.add(new int[] {a,b});
					}
				}
			}
			
//			for(int i=0; i<result.length; i++) {
//				System.out.println(Arrays.toString(result[i]));
//			}
//
//			System.out.println("=====================================");
		}
	}
}