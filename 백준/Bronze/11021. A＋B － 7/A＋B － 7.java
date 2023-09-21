import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(bf.readLine());
		
		for(int i=1; i<A+1; i++) {
			String B = bf.readLine();
			
			String[] C = B.split(" ");
			
			bw.write("Case #"+i+": "+(Integer.parseInt(C[0]) + Integer.parseInt(C[1]))+"\n");
		}
		bw.flush();
		bw.close();
	}
}
