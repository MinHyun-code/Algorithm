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
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char strAt = str.charAt(i);
			
			if(strAt == 'A' || strAt == 'B' || strAt == 'C') {
				count += 2;
			} else if(strAt == 'D' || strAt == 'E' || strAt == 'F') {
				count += 3;
			} else if(strAt == 'G' || strAt == 'H' || strAt == 'I') {
				count += 4;
			} else if(strAt == 'J' || strAt == 'K' || strAt == 'L') {
				count += 5;
			} else if(strAt == 'M' || strAt == 'N' || strAt == 'O') {
				count += 6;
			} else if(strAt == 'P' || strAt == 'Q' || strAt == 'R' || strAt == 'S') {
				count += 7;
			} else if(strAt == 'T' || strAt == 'U' || strAt == 'V') {
				count += 8;
			} else if(strAt == 'W' || strAt == 'X' || strAt == 'Y' || strAt == 'Z') {
				count += 9;
			}
		}
		
		System.out.println(count+str.length());
	}
}