import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int min = 1000;
		
		if(w-x < x) {
			if(min>w-x) {
				min = w-x;
			}
		} else {
			if(min>x) {
				min = x;
			}
		}
		
		if(h-y < y) {
			if(min>h-y) {
				min = h-y;
			}
		} else {
			if(min>y) {
				min = y;
			}
		}
		System.out.println(min);
	}
}