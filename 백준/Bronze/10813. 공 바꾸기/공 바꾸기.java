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
		int temp = 0;
		
		for(int i=0; i<a0; i++) {
			result[i] = i+1;
		}
		
		for(int i=0; i<a1; i++) {
			String[] B = bf.readLine().split(" ");
			int b0 = Integer.parseInt(B[0])-1;
			int b1 = Integer.parseInt(B[1])-1;
			temp = result[b0];
			result[b0] = result[b1];
			result[b1] = temp;
		}
		
		for(int i=0; i<a0; i++) {
			bw.write(result[i] + " ");
		}
		
		bw.flush();
		bw.close();
	}
}