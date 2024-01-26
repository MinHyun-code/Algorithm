import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		String num = br.readLine();
		int result = 0;
		int index = 0;
		
		while(true) {
			result++;
			String numStr = Integer.toString(result);
			for(int i=0; i<numStr.length(); i++) {
				if(numStr.charAt(i) == num.charAt(index)) {
					index++;
				}
				
				if(index == num.length()) {
					System.out.println(result);
					return;
				}
			}
		}
	}
}