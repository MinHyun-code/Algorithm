import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		/*
		 * 모듈러 연산의 성질
		 * 1) (A+B) mod M = ((A mod M) + (B mod M)) mod M
		 * 2) (A*B) mod M = ((A mod M) * (B mod M)) mod M
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();

		long[] arr = new long[num];
		long sum = 0;
		long r = 1;
		int prime = 1234567891;
		
		for(int i=0; i<num; i++) {
			
			if(i>0) {
				r = r*31%prime;
			}
			arr[i] = (str.charAt(i)-96)*r%prime;
		}
		
		for(int i=0; i<num; i++) {
			sum += arr[i];
		}

		System.out.println(sum%prime);
	} 
}