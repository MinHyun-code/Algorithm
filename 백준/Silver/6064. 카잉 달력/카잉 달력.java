import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int tempY = 0;
			
			if(x > N) {
				tempY = (tempY+x)%N;
				if(tempY == 0) {
					tempY = N;
				}
			}
			else {
				tempY = x;
			}
			
			int count = x;
			
			boolean tf = false;
			
			while(true) {
				
				if(count > M*N) {
					tf=false;
					break;
				}
				
				// x, y에 도달
				if(tempY == y) {
					tf = true;
					break;
				}
				
				if(tempY+M > N) {
					tempY = (tempY+M)%N;
					if(tempY == 0) {
						tempY = N;
					}
				} else {
					tempY += M;
				}
				
				count = count+M;
			}
			
			if(tf) {
				sb.append(count).append("\n");
			}
			else {
				sb.append(-1).append("\n");
			}
			
		}
		
		System.out.println(sb);
	}
}