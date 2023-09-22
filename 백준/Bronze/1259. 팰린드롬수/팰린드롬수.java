import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String input = bf.readLine();
			
			if(input.equals("0")) {
				break;
			}
			
			String result = "yes";
			
			for(int i=0; i<input.length()/2; i++) {
				if(input.charAt(i) != input.charAt(input.length()-i-1)) {
					result = "no";
				}
			}
			bw.write(result + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}