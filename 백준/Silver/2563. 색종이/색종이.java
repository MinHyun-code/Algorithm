import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		boolean[][] white = new boolean[101][101];
		
		int total = 0;
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());

			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			for(int j=num1; j<num1+10; j++) {
				for(int z=num2; z<num2+10; z++) {
					if(white[j][z] == false) {
						white[j][z] = true;
						total++;
					}
				}
			}
		}
		
		System.out.println(total);
	}
}