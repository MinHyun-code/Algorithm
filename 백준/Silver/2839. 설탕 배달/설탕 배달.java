import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		int num = Integer.parseInt(br.readLine());

		int temp = num;
		
		boolean result = false;
		
		// 5kg
		int a = 0;
		// 3kg
		int b = 0;
		

		if(num/5 >= 0) {
			a = num/5;
			
			num = num % 5;
		}
		
		if(num/3 >= 0) {
			b = num/3;
			
			num = num % 3;
		}
		
		if(num == 0) {
			System.out.println(a+b);
		} else {
			while(num <= temp) {
				if(num % 3 == 0) {
					b += num/3;
					result = true;
					break;
				}
				num += 5;
				a--;
			}
			if(result == true) {
				System.out.println(a+b);
			} else {
				System.out.println(-1);
			}
		}
	}
}