import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		if(M == 1) {
			M = 2;
		}
		
		int min = 10001;
		int sum = 0;
		
		while(M<=N) {
			
			boolean tf = true;
			
			for(int i=2; i<M; i++) {
				if(M%i == 0) {
					tf = false;
					break;
				}
			}
			
			if(tf == true) {
				if(min > M) {
					min = M;
				}
				sum += M;
			}
			M++;
		}
		if(min == 10001) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}