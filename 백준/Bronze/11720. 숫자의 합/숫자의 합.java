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
		
		String B = bf.readLine();
		int sum = 0;
		
		for(int i=0; i<B.length(); i++) {
			sum += Integer.parseInt(B.substring(i,i+1));
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
