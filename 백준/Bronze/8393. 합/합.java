import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int result = 0;

		for(int i=1; i<=A; i++) {
			result += i;
		}
		System.out.print(result);
	}
}
