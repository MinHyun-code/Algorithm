import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		// 순위 배열
		int[] rank = new int[N+1];
		// 매달 배열
//		int[] arr = new int[N+1];
//		
//		for(int i=1; i<=N; i++) {
//			st = new StringTokenizer(br.readLine());
//			
//			int country = Integer.parseInt(st.nextToken());
//			String gold = st.nextToken();
//			String silver = st.nextToken();
//			String bronze = st.nextToken();
//			
//			arr[country] = Integer.parseInt(gold+silver+bronze);
//		}
//		
//		for(int i=1; i<=N; i++) {
//			// 순위는 1로 초기화
//			rank[i] = 1;
//			
//			for(int j=1; j<=N; j++) {
//				if(arr[i] < arr[j]) {
//					rank[i] = rank[i]+1;
//				}
//			}
//		}
		
		// 매달 배열
		int[] g = new int[N+1];
		int[] s = new int[N+1];
		int[] b = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int country = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silver = Integer.parseInt(st.nextToken());
			int bronze = Integer.parseInt(st.nextToken());

			g[country] = gold;
			s[country] = silver;
			b[country] = bronze;
		}
		
		for(int i=1; i<=N; i++) {
			// 순위는 1로 초기화
			rank[i] = 1;
			
			for(int j=1; j<=N; j++) {
				if(g[i] < g[j]) {
					rank[i] = rank[i]+1;
				}
				else if(g[i] == g[j]) {
					if(s[i] < s[j]) {
						rank[i] = rank[i]+1;
					}
					else if(s[i] == s[j]) {
						if(b[i] < b[j]) {
							rank[i] = rank[i]+1;
						}
					}
				}
			}
		}

//		System.out.println(Arrays.toString(rank));
		System.out.println(rank[K]);
	}
}