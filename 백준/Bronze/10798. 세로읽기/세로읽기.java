import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String[][] arr = new String[5][15];
		
		int maxLength = 0;
		
		for(int i=0; i<5; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				if(str.length() > maxLength) {
					maxLength = str.length();
				}
				arr[i][j] = str.substring(j,j+1);
			}
		}
		
		for(int j=0; j<maxLength; j++) {
			for(int i=0; i<5; i++) {
				if(arr[i][j] != null) {
					sb.append(arr[i][j]);
				}
			}
		}
		
		System.out.println(sb);
	} 
}