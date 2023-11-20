import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		/*
		 * 쿼터: $0.25
		 * 다임: $0.10
		 * 니켈: $0.05
		 * 페니: $0.01
		 */
		
		for(int i=0; i<num; i++) {
			double change = Integer.parseInt(br.readLine()) / 100.0;
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			if(change >= 0.25) {
				a = (int) (change / 0.25);
				change = Math.round((change - (0.25 * a)) * 1000) / 1000.0;
			}
			
			if(change >= 0.1) {
				b = (int) (change / 0.1);
				change = Math.round((change - (0.1 * b)) * 1000) / 1000.0;
			}
			
			if(change >= 0.05) {
				c = (int) (change / 0.05);
				change = Math.round((change - (0.05 * c)) * 1000) / 1000.0;
			}
			
			if(change >= 0.01) {
				d = (int) (change / 0.01);
				change = Math.round((change - (0.01 * d) * 1000)) / 1000.0;
			}
			
			sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append("\n");
		}
		System.out.println(sb);
	}
}