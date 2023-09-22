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

		int A0 = Integer.parseInt(A[0]);
		int A1 = Integer.parseInt(A[1]);
		
		bw.write(String.valueOf((A0+A1)*(A0-A1)));
		
		bw.flush();
		bw.close();
	}
}
