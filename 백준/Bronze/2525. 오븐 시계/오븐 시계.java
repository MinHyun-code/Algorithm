import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = Integer.parseInt(scan.next());
		int B = Integer.parseInt(scan.next());
		int C = Integer.parseInt(scan.next());
		
		String result = "";
		
		// 시간
		int temp = C/60;
		// 분
		int temp2 = C%60;
		
		if(A+temp >= 24) {
			A = A + temp - 24;
			B += temp2;
		} else {
			A += temp;
			B += temp2;
		}
		
		if(B >= 60) {
			B -= 60;
			A += 1;
			if(A >= 24) {
				A -= 24;
			}
		}
		
		System.out.print(A + " " + B);
	}
}