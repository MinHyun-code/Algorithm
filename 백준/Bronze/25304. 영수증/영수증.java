import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = Integer.parseInt(scan.nextLine());
		int B = Integer.parseInt(scan.nextLine());

		String result = "No";
		int sum = 0;
		
		for(int i=0; i<B; i++) {
			String C = scan.nextLine();
			
			String[] temp = C.split(" ");
			
			sum += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
		}

		if(A == sum) {
			result = "Yes";
		}
		
		System.out.print(result);
	}
}