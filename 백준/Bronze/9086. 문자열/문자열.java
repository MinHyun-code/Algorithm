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
		
		for(int i=0; i<A; i++) {
			String B = bf.readLine();
			bw.write(B.substring(0, 1) + B.substring(B.length()-1, B.length()) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
