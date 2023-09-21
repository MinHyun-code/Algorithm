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
		int C = Integer.parseInt(bf.readLine());
		
		int count = 0;
		
		for(int i=0; i<A; i++) {
			if(C == Integer.parseInt(B[i])) {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}