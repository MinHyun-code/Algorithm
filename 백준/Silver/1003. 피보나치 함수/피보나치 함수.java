import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static Integer[][] fibonacci = new Integer[41][2];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		fibonacci[0][0] = 1;
		fibonacci[0][1] = 0;
		fibonacci[1][0] = 0;
		fibonacci[1][1] = 1;
		
		fibonacci(40);
		
		while(N-->0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				sb.append(1).append(" ").append(0).append("\n");
			} else if(num == 1) {
				sb.append(0).append(" ").append(1).append("\n");
			} else if(num == 2) {
				sb.append(1).append(" ").append(1).append("\n");
			} else if(num > 2) {
				sb.append(fibonacci[num][0]).append(" ").append(fibonacci[num][1]).append("\n");
			}
		}

		System.out.println(sb);
	}
	
	static Integer[] fibonacci(int n) {
		if(fibonacci[n][0] == null || fibonacci[n][1] == null) {
	    	fibonacci[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
	    	fibonacci[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
		}
    	return fibonacci[n];
	}
}