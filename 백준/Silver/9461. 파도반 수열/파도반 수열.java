import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static long[] dp = new long[101];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());

		// 기본 셋팅
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		dp[6] = 3;
		dp[7] = 4;
		dp[8] = 5;
		dp[9] = 7;
		
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
			
			sb.append(DP(N)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static long DP(int N) {
		if(dp[N] > 0) {
			return dp[N];
		}
		
		return dp[N] = DP(N-1) + DP(N-5);
	}
}