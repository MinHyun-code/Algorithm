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
			long num = Long.parseLong(br.readLine());
			long result = 2;
			if(num > 2) {
				result = prime(num);
			} 
			
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static long prime(long num) {
		
		while(true) {
			boolean prime = true;
			
			for(int i=2; i<Math.sqrt(num)+1; i++) {
				if(num%i == 0) {
					prime = false;
					break;
				}
			}
			
			if(prime) {
				return num;
			}
			
			num++;
		}
	}
}
