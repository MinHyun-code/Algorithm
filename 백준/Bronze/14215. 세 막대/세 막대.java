import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		
		/* 	삼각형의 기준
		 * 	: 가장 긴 변 < 나머지 두 변의 합
		 */
		
		// 가장 긴 변의 길이
		int max = 0;
		// 가장 긴 변 
		int maxNum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(max < arr[i]) {
				max = arr[i];
				maxNum = i;
			}
		}
		
		// 나머지 두 변의 합
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i != maxNum) {
				sum += arr[i];
			}
		}
		
		if(sum <= max) {
			max = sum-1;
		}
		
		System.out.println(sum+max);
	}
}