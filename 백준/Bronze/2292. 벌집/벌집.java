import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(bf.readLine());
		int num = 1;
		int count = 1;

		while(a > num) {
			num = num + 6 * count;
			count++; 
		}   

		System.out.println(count);
	}
}