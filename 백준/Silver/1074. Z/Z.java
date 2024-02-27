import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N, R, C;
	static int ans = 0;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		func(0, 0, (int) Math.pow(2, N));
	}
	
	public static void func(int r, int c, int size) {
		
		if(size == 1) {
			System.out.println(ans);
			return;
		}
		
		int newSize = size / 2;
		if(R < r + newSize && C < c + newSize ) {
			func(r, c, newSize);
		}
		if(R < r + newSize && c + newSize <= C) {
			ans += (size*size) / 4;
			func(r, c+newSize, newSize);
		}
		if(r + newSize <= R && C < c + newSize ) {
			ans += ((size*size) / 4) * 2;
			func(r+newSize, c, newSize);
		}
		if(r + newSize <= R && c + newSize <= C ) {
			ans += ((size*size) / 4) * 3;
			func(r+newSize, c+newSize, newSize);
		}
	}
}