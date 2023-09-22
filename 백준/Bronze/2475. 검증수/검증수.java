import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] A = bf.readLine().split(" ");
		
		bw.write(calculate(A).charAt(0));
		
		bw.flush();
		bw.close();
	}
	
	private static String calculate(String[] A) {
		
		double sum = 0;
		
		for(int i=0; i<A.length; i++) {
			sum += Integer.parseInt(A[i]) * Integer.parseInt(A[i]);
		}
		
		String result = String.valueOf(sum % 10);
		
		return result;
	}
}