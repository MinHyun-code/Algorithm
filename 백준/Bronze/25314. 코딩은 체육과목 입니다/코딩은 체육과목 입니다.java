import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();

		String result = "";
		
		for(int i=0; i<(A/4); i++) {
			result += "long ";
		}
		
		System.out.print(result + "int");
	}
}
