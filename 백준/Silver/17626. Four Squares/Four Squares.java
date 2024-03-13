import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{

		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++) {
			int min = Integer.MAX_VALUE;
			
			for(int j=1; j*j<=i; j++) {
				min = Math.min(min, dp[i-j*j]);
			}
			dp[i] = min+1;
		}
		
		System.out.println(dp[n]);
	}
}