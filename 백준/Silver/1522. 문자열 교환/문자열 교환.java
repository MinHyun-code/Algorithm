import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static String str;
	static char[] arr;
	
	public static void main(String[] args) throws IOException{
		
		str = br.readLine();
		
		arr = new char[str.length()];
		
		int result = Integer.MAX_VALUE;
		
		int countA = 0;
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
			if(arr[i] == 'a') {
				countA++;
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			int countB = 0;
			int idx = 0;
			
			for(int j=i; j<i+countA; j++) {

				if(j >= str.length()) {
					if(str.charAt(idx) == 'b') {
						countB++;
					}
					
					idx++;
				}
				else {
					if(str.charAt(j) == 'b') {
						countB++;
					}
				}
			}

			result = Math.min(result, countB);
		}
		
		System.out.println(result);
	}
}