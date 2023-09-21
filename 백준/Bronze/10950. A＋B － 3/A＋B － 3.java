
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = Integer.parseInt(scan.nextLine());
		int result = 0;
		String B = "";
		
		for(int i=0; i<A; i++) {
			B = scan.nextLine();
			String[] C = B.split(" ");
			
			if(C.length == 2) {
				result = Integer.parseInt(C[0]) + Integer.parseInt(C[1]);

				System.out.println(result);
			}
		}
	}
}
