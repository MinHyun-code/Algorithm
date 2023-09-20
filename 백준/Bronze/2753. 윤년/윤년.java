import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = Integer.parseInt(scan.next());
		
		String result = "0";
		
		if(A%4==0 && (A%100!=0 || A%400==0)) {
			result = "1";
		}
		System.out.print(result);
	}
}