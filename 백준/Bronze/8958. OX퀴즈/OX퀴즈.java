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
			int count = 0;
			int result = 0;
			String B = bf.readLine();
			for(int j=0; j<B.length(); j++) {
				if('O' == B.charAt(j)) {
					count++;
				} else {
					count = 0;
				}
				result += count;
			}
			bw.write(String.valueOf(result) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}