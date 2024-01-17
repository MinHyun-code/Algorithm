import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static Integer[][] arr;
	static boolean[][] visited;
	static Stack<int[]> stack;		// 1의 위치를 담을 stack
	static int[] moveX = {0, 0, -1, 1};
	static int[] moveY = {1, -1, 0, 0};
	static int cnt = 0;				// 단지의 개수
	static List<Integer> cntList = new ArrayList<Integer>();	// 단지 별 집 개수
	static int tempCnt;				// 집 개수

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		stack = new Stack<int[]>();
		arr = new Integer[N+1][N+1];
		visited = new boolean[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			
			for(int j=1; j<=N; j++) {
				arr[i][j] = Integer.parseInt(str.substring(j-1, j));
				if(arr[i][j] == 1) {
					stack.add(new int[]{i, j});
				}
			}
		}
		
		while(!stack.empty()) {
			int[] search = stack.pop();
			// 방문안했으면
			if(visited[search[0]][search[1]] == false) {
				tempCnt = 1;
				BFS(search[0], search[1]);
				cntList.add(tempCnt);
			}
		}
		
		// 오름차순 정렬
		Collections.sort(cntList);
		
		sb.append(cnt).append("\n");
		
		for(int i=0; i<cntList.size(); i++) {
			sb.append(cntList.get(i)).append("\n");
		}
		
		System.out.println(sb);
 	}
	
	public static void BFS(int x, int y) {
		
		cnt++;
		
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		
		queue.add(new Integer[]{x, y});
		
		while(!queue.isEmpty()) {
			Integer[] temp = queue.poll();
			int tempX = temp[0];
			int tempY = temp[1];
			visited[tempX][tempY] = true;
			
			for(int i=0; i<4; i++) {
				int resultX = tempX + moveX[i];
				int resultY = tempY + moveY[i];
			
				if(resultX > 0 && resultY > 0 && resultX <= N && resultY <= N) {
					if(visited[resultX][resultY] == false && arr[resultX][resultY] == 1) {
						queue.add(new Integer[]{resultX, resultY});
						visited[resultX][resultY] = true;
						tempCnt++;
					}
				}
			}
		}
	}
} 