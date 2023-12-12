import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static Integer[] dp;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[21];
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			
			String method = st.nextToken();
			
			int M;
			
			if(method.equals("add")) {
				M = Integer.parseInt(st.nextToken());
				arr[M] = true;
			}
			
			else if(method.equals("check")) {
				M = Integer.parseInt(st.nextToken());
				if(arr[M]) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			}
			
			else if(method.equals("remove")) {
				M = Integer.parseInt(st.nextToken());
				arr[M] = false;
			}
			
			else if(method.equals("toggle")) {
				M = Integer.parseInt(st.nextToken());
				arr[M] = !arr[M];
			}
			
			else if(method.equals("all")) {
				for(int i=0; i<arr.length; i++) {
					arr[i] = true;
				}
			}
			
			else if(method.equals("empty")) {
				for(int i=1; i<arr.length; i++) {
					arr[i] = false;
				}
			}
		}
		
		System.out.println(sb);
	}
}