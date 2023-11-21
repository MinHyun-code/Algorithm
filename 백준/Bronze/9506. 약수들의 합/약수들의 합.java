import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			int N = Integer.parseInt(br.readLine());
			
			int sum = 0;
			
			if(N == -1) {
				break;
			}
			
			for(int i=1; i<N; i++) {
				if(N % i == 0) {
					list.add(i);
					sum += i;
				}
			}
			if(sum == N) {
				for(int i=0; i<list.size(); i++) {
					
					if(i == 0) {
						sb.append(N + " = " + list.get(i));
					} else {
						sb.append(" + " + list.get(i));
					}
				}	
			} else {
				sb.append(N + " is NOT perfect.");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}