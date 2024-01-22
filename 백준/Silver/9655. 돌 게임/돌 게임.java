import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// false : 상근(SK), true: 창영(CY)
		boolean person;
		
		if(N % 2 == 0) {
			person = true;
		} else {
			person = false;
		}
		
		if(person) {
			sb.append("CY");
		} else {
			sb.append("SK");
		}
		
		System.out.println(sb);
	}
}