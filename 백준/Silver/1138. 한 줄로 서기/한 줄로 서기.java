import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
																				
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		List<Integer> list = new ArrayList<Integer>();

		for(int i=N; i>=1; i--) {
			list.add(arr[i], i);
		}
		
		for(int i : list) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
}