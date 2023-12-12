import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		// 컴퓨터 수
		int N = Integer.parseInt(br.readLine());
		// 연결 수
		int M = Integer.parseInt(br.readLine());
		
		int cnt = -1;
		
		int[][] arr = new int[N+1][N+1];
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());

			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			arr[num1][num2] = 1;
			arr[num2][num1] = 1;
		}
		
		for(int k=1; k<=N; k++) {
	 		for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					if(arr[i][k] == 1 && arr[k][j] == 1) {
						arr[i][j] = 1;
					}
				}
			}
		}
		
		for(int i=0; i<=N; i++) {
			if(arr[1][i] == 1) {
				cnt++;
			}
		}
		
		if(cnt < 0) {
			cnt = 0;
		}
		
		System.out.println(cnt);
	}
}