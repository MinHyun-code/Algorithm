import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;


		String str = bf.readLine();

		while(!str.equals("0 0 0")) {
			st = new StringTokenizer(str);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			
			if(a>=b && a >= c) {
				if(a*a == c*c + b*b) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if(b>=a && b >= c) {
				if(b*b == a*a + c*c) {
					System.out.println("right");
				} else {				
					System.out.println("wrong");
				}
			} else if(c>=a && c>=b) {
				if(c*c == a*a + b*b) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
			
			str = bf.readLine();
		}
	}
}