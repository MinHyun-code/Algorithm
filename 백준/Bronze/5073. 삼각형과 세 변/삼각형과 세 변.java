import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		while(true) {

			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());

			boolean tf = true;
			
			if(A > B) {
				if(A > C) {
					if(A >= B+C) {
						tf = false;
					}
				}
			}
			
			if(B > A) {
				if(B > C) {
					if(B >= A+C) {
						tf = false;
					}
				}
			}
			
			if(C > A) {
				if(C > B) {
					if(C >= B+A) {
						tf = false;
					}
				}
			}
			
			if(tf == true) {
				if(A == B && A == C) {
					if(A == 0) {
						break;
					}
					System.out.println("Equilateral");
				} else {
					if(A == B || A == C || B == C) {
			 			System.out.println("Isosceles");
					} else {
			 			System.out.println("Scalene");
					}
		 		} 
			} else {
				System.out.println("Invalid");
			}
		}
	}
}