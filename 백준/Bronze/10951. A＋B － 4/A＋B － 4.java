import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String A = bf.readLine();

		while(true) {
			if(A == null) {
				break;
			} else {
				String[] B = A.split(" ");
				bw.write(Integer.parseInt(B[0])+Integer.parseInt(B[1])+"\n");
				A = bf.readLine();
			}
		}
		bw.flush();
		bw.close();
	}
}
