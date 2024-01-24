import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());	// 굴다리 길이
		int M = Integer.parseInt(br.readLine());	// 가로등 개수
		
		int[] mArr = new int[M];					// 가로등 위치
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			mArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int num1 = mArr[0]; 		// 0과 처음 가로등 사이의 거리
		int num2 = N - mArr[M-1]; 	// N과 마지막 가로등 사이의 거리
		int num3 = 0;				// 가로등 사이의 거리 중 최대값
		
		for(int i=1; i<M; i++) {
			int temp = mArr[i]-mArr[i-1];
			
			if(num3 < temp) {
				num3 = temp;
			}
		}
		
		if(num3%2 == 0) {
			num3 = num3/2;
		}
		else {
			num3 = num3/2+1;
		}
		
		sb.append(Math.max(Math.max(num1, num2),num3));
	
		System.out.println(sb);
	}
}