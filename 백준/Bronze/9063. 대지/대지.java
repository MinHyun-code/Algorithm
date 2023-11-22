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
		
//		최소 x
		int minX = 10000;
//		최대 x
		int maxX = -10000;
		
//		최소 y
		int minY = 10000;
		
//		최대 y
		int maxY = -10000;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(minX > x) {
				minX = x;
			}
			
			if(maxX < x) {
				maxX = x;
			}
			
			if(minY > y) {
				minY = y;
			}
			
			if(maxY < y) {
				maxY = y;
			}
		}

		System.out.println((maxX-minX)*(maxY-minY));
	}
}