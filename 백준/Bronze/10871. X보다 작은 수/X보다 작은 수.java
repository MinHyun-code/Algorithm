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
		String[] B = bf.readLine().split(" ");
		
		for(int i=0; i<Integer.parseInt(A[0]); i++) {
			if(Integer.parseInt(A[1]) > Integer.parseInt(B[i])) {
				bw.write(B[i]+" ");
			}
		}
		bw.flush();
		bw.close();
	}
}
