import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
				
		int N = Integer.parseInt(br.readLine());
		
		/*
		 * 약수의 개수가 홀수면 열림 (제곱근)
		 * 			짝수면 닫힘
		 */
		
		int cnt = 0;
		
		for(int i=1; i*i<=N; i++) {
			cnt++;
		}
		
		System.out.println(cnt);
	}
}