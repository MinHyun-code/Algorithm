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
			String[] B = bf.readLine().split(" ");
			int B0 = Integer.parseInt(B[0]);		
			String B1 = B[1];
			
			String result = "";
			
			for(int j=0; j<B1.length(); j++) {
				for(int z=0; z<B0; z++) {
					result += B1.charAt(j);
				}
			}
			bw.write(result + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}