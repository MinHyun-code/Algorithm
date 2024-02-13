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
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException{
		
		N = Integer.parseInt(br.readLine());
		dp = new Integer[10001][4];
		
		dp[1][1] = 1;
		dp[1][2] = 0;
		dp[1][3] = 0;
		dp[2][1] = 1;
		dp[2][2] = 1;
		dp[2][3] = 0;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;
		dp[4][1] = 1;
		dp[4][2] = 2;
		dp[4][3] = 1;
		
		while(N-->0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > 4) {
				dp[num][1] = func(num, 1);
				dp[num][2] = func(num, 2);
				dp[num][3] = func(num, 3);
			}
			
			int result = dp[num][1] + dp[num][2] + dp[num][3];
			
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static int func(int x, int y) {
		
		if(dp[x][y] != null) {
			return dp[x][y];
		}
		
		if(y == 1) {
			return dp[x][y] = func(x-1, y);
		}
		
		if(y == 2) {
			return dp[x][y] = func(x-2, y-1) + func(x-2, y);
		}
		
		if(y == 3) {
			return dp[x][y] = func(x-3, y-2) + func(x-3, y-1) + func(x-3, y);
		}
		
		return -1;
	}
}