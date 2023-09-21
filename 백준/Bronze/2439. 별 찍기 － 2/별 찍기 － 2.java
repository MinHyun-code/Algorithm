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
		
		String result = "";
		String result2 = "";
		
		for(int i=1; i<A+1; i++) {
			result += "*";
			result2 = result;
			result2 = String.format("%"+A+"s", result2).replace(" ", " ");
			
			
			bw.write(result2+"\n");
		}
		bw.flush();
		bw.close();
	}
}