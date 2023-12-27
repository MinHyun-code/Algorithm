import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] arr;
	static int N, M;
	static boolean[] node;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		// 정점의 개수
		N = Integer.parseInt(st.nextToken());
		// 간선의 개수
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			// 간선 노드
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			arr[u][v] = 1;
			arr[v][u] = 1;
		}
		
		int count = 0;
		
		node = new boolean[N+1];
		for(int i=1; i<=N; i++) {
			
			if(node[i] == false) {
				BFS(i);
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	// 너비우선탐색
	public static void BFS(int value) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(value);
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			
			for(int i=1; i<=N; i++) {
				if(arr[num][i] == 1 && node[i] == false) {
					queue.offer(i);
					node[i] = true;
				}
			}
		}
	}
}