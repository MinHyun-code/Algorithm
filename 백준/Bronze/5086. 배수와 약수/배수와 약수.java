import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int A;
		int B;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			if(A == 0 && B == 0) {
				break;
			} else {
				if(A%B == 0) {
					sb.append("multiple").append("\n");
				} else if(B%A == 0) {
					sb.append("factor").append("\n");
				} else {
					sb.append("neither").append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}