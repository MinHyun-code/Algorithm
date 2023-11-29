import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			// A와 B의 최소 공배수 찾기 = 최대공약수 * (최대공약수로 나눈 A의 몫) * (최대공약수로 나눈 B의 몫)
			// 최대 공약수
			int GCD = getGCD(A, B);
			
			System.out.println(GCD * (A/GCD) * (B/GCD));
			
		}
	}
	
	public static int getGCD(int num1, int num2) {
		
		if(num1 % num2 == 0) {
			return num2;
		}
		
		return getGCD(num2, num1%num2);
	}
}