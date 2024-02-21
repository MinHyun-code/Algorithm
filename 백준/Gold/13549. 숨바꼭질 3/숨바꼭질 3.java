import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
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
		
		System.out.println(BFS(N));
	}
	
	private static int BFS(int index) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(index);
		visited[index] = true;
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			int temp1 = num+1;
			int temp2 = num-1;
			int temp3 = num * 2;
			
			if(num == K) {
				return arr[num];
			}
			
			if(temp3 <= 100000 && visited[temp3] == false) {
				arr[temp3] = arr[num];
				visited[temp3] = true;
				queue.add(temp3);
			}
			
			if(temp2 >= 0 && visited[temp2] == false) {
				arr[temp2] = arr[num]+1;
				visited[temp2] = true;
				queue.add(temp2);
			}
			
			if(temp1 <= 100000 && visited[temp1] == false) {
				arr[temp1] = arr[num]+1;
				visited[temp1] = true;
				queue.add(temp1);
			}
		}
		
		return -1;
	}
}