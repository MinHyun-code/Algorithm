import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int seq = 0;
		
		for(int i=0; i<9; i++) {
			int A = Integer.parseInt(bf.readLine());
			if(A > max) {
				seq = i+1;
				max = A;
			}
		}
			
		bw.write(max + "\n" + seq);
		
		bw.flush();
		bw.close();
	}
}