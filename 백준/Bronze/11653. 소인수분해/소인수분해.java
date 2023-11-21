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
		
		while(N>1) {
			for(int i=2; i<=N; i++) {
				if(N%i == 0) {
					System.out.println(i);
					N = N/i;
					break;
				}
			}
		}
	}
}