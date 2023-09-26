import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(bf.readLine());
		
		int st0 = Integer.parseInt(st.nextToken());
		int st1 = Integer.parseInt(st.nextToken());
		
		int st0_fac = factorial(st0);
		int st01_fac = factorial(st0 - st1);
		int st1_fac = factorial(st1);
		
		StringBuilder sb = new StringBuilder();
		sb.append(st0_fac/(st1_fac*st01_fac));
		System.out.println(sb);
	}
	
	public static int factorial(int num) {

		int result = 1;
		
		for(int i=1; i<=num; i++) {
			result *= i;
		}
		
		return result;
	}
}