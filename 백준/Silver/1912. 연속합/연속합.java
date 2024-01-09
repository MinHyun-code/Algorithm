import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr;	// 배열
	static Integer[] dp;	// 메모이제이션 할 dp
	static int max = 0;		// 최댓값 변수
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		arr = new int[T];
		dp = new Integer[T];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<T; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		max = arr[0];
		
		// dp의 마지막 index는 T-1이므로 T-1부터 Top-Down 탐색
		recur(T-1);
		
		System.out.println(max);
	}
	
	
	static int recur(int N) {

		// 탐색하지 않은 인덱스
		if(dp[N] == null) {
			dp[N] = Math.max(recur(N-1)+arr[N], arr[N]);
			
			// 해당 dp[N]과 max 중 큰 값으로 max 갱신
			max = Math.max(dp[N], max);
		}
		
		return dp[N];
	}
} 