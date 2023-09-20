import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = Integer.parseInt(scan.next());
		
		String result = "";
		
		if(A >= 90) {
			result = "A";
		} else if(A >= 80) {
			result = "B";
		} else if(A >= 70) {
			result = "C";
		} else if(A >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		
		System.out.print(result);
	}
}
