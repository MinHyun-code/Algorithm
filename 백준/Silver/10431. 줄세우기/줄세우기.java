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
		
		int P = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=P; i++) {
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[21];
			
			for(int k=1; k<=20; k++) {
				arr[k] = 100000000;
			}
			
			int cnt = 0;
			int testNum = Integer.parseInt(st.nextToken());
			
			arr[1] = Integer.parseInt(st.nextToken());
			
			for(int j=2; j<=20; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				
				for(int z=1; z<=j; z++) {
					if(arr[j] < arr[z]) {
						cnt += j-z;
						Arrays.sort(arr);
						break;
					}
				}
			}
			
			sb.append(testNum).append(" ").append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}
}