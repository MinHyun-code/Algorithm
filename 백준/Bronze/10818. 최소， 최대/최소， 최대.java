import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(bf.readLine());
		String[] B = bf.readLine().split(" ");
		
		int min = Integer.parseInt(B[0]);
		int max = -1000000;
		
		for(int i=0; i<A; i++) {
			if(Integer.parseInt(B[i]) > max) {
				max = Integer.parseInt(B[i]);
			}
			if(Integer.parseInt(B[i]) < min) {
				min = Integer.parseInt(B[i]);
			}
		}
		
		bw.write(min + " " + max);
		
		bw.flush();
		bw.close();
	}
}
