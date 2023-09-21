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
		int a0 = Integer.parseInt(A[0]);
		int a1 = Integer.parseInt(A[1]);
		int[] result = new int[Integer.parseInt(A[0])];
		
		for(int i=0; i<a1; i++) {
			String[] B = bf.readLine().split(" ");
			int b0 = Integer.parseInt(B[0]);
			int b1 = Integer.parseInt(B[1]);
			int b2 = Integer.parseInt(B[2]);
			for(int j=b0-1; j<=b1-1; j++) {
				result[j] = b2;
			}
		}
		
		for(int i=0; i<a0; i++) {
			bw.write(result[i] + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
