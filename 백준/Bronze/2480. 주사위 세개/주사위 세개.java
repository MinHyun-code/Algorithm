import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = Integer.parseInt(scan.next());
		int B = Integer.parseInt(scan.next());
		int C = Integer.parseInt(scan.next());
		
		int result = 0;
		
		// 2개만 같을 경우
		if(A == B || B == C || A == C) {
			if(A == B) {
				result = 1000+A*100;
			} else if(B == C) {
				result = 1000+B*100;
			} else if(C == A) {
				result = 1000+C*100;
			}

			// 모두 같을 경우
			if(A == B && A == C) {
				result = 10000+A*1000;
			}
		} 
		// 모두 다를 경우
		else {
			if(A > B && A > C) {
				result = A*100;
			} else if(B > A && B > C) {
				result = B*100;
			} else if(C > A && C > B) {
				result = C*100;
			}
		}
		System.out.print(result);
	}
}