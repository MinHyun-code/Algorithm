import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a = Integer.parseInt(bf.readLine());
		int count = 0;

		String str = bf.readLine();
		st = new StringTokenizer(str);
		
		for(int i=0; i<a; i++) {
			int num = Integer.parseInt(st.nextToken());
			int count2 = 0;
			
			for(int j=1; j<=num; j++) {
				if(num % j == 0) {
					count2++;
				}
			}
			
			if(count2 == 2) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}