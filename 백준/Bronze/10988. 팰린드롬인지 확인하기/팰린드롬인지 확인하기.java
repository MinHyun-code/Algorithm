import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String str = br.readLine();
		int result = 1;
		
		for(int i=0; i<str.length(); i++) {
			int index = str.length()-i;
			
			if(str.substring(i,i+1).equals(str.substring(index-1, index)) && result == 1) {
				result = 1; 
			} else {
				result = 0;
			}
		}
		System.out.println(result);
		
	}
}