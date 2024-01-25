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
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];						// 요청 예산 배열
		
		st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		int maxVal = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			if(maxVal < arr[i]) {
				maxVal = arr[i];
			}
		}
		
		int M = Integer.parseInt(br.readLine());	// 총 예산
		
		// 예산이 충분할 경우
		if(sum <= M) {
			sb.append(maxVal);
		}
		// 예산이 초과일 경우
		else {
			int temp = M/N;
			while(true) {
				int tempSum = 0;
				for(int i=0; i<N; i++) {
					if(temp > arr[i]) {
						tempSum += arr[i];
					}
					else {
						tempSum += temp;
					}
				}
				
				if(tempSum > M) {
					sb.append(temp-1);
					break;
				}
				else {
					temp++;
				}
			}
		}
		
		System.out.println(sb);
	}
}