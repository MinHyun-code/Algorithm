import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = Integer.parseInt(scan.next());
		int B = Integer.parseInt(scan.next());
		
		String result = "";
		
		if(A>0) {
			if(B>0) {
				result = "1";
			} else {
				result = "4";
			}
		} else {
			if(B>0) {
				result = "2";
			} else {
				result = "3";
			}
		}
		
		System.out.print(result);
	}
}