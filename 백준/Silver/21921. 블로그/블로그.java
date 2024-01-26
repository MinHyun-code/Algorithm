import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 지난 일수
		int X = Integer.parseInt(st.nextToken());	// 기간
		
		int[] arr = new int[N];						// 방문 수
		int[] sum = new int[N];						// 방문 누적
		
		st = new StringTokenizer(br.readLine());
		
		int sumTemp = 0;
		
		int max = 0;
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i != 0) { 
				if(i-X >= 0) {
					sumTemp -= arr[i-X];
				}
			}
			
			sumTemp += arr[i];
			
			sum[i] = sumTemp;
			
			if(sum[i] > max) {
				max = sum[i];
				cnt = 1;
			}
			else if(sum[i] == max) {
				cnt++;
			}
		}
		
		if(max == 0) {
			sb.append("SAD");
		}
		else {
			sb.append(max).append("\n");
			sb.append(cnt);
		}
		
		System.out.println(sb);
	}
}