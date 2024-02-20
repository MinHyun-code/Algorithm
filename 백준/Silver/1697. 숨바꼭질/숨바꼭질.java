import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int N, K;
	
	static boolean[] visited = new boolean[100001];
	static int[] arr = new int[100001];
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		int result = BFS(N);

		System.out.println(result);
	}
	
	private static int BFS(int node) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(node);
		
		arr[node] = 1;
		visited[node] = true;
		
		while(!queue.isEmpty()) {

			int n = queue.poll();
			int temp1 = n+1;
			int temp2 = n-1;
			int temp3 = n*2;
			
			if(n == K) {
				return arr[n]-1;
			}
			
			if(temp1 <= 100000 && visited[temp1] == false) {
				queue.add(temp1);
				arr[temp1] = arr[n]+1;
				visited[temp1] = true;
			}
			if(temp2 >= 0 && visited[temp2] == false) {
				arr[temp2] = arr[n]+1;
				queue.add(temp2);
				visited[temp2] = true;
			}
			if(temp3 <= 100000 && visited[temp3] == false) {
				arr[temp3] = arr[n]+1;
				queue.add(temp3);
				visited[temp3] = true;
			}
		}
		return -1;
	}
}