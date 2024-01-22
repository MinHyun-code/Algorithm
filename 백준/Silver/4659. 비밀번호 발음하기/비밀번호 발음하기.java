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
		
		while(true) {
			
			String str = br.readLine();
			
			if(str.equals("end")) {
				break;
			}
			
			int vowelCnt = 0; 			// 모음 개수
			int vowelStreamCnt = 0;		// 연속 모음 개수
			int consonantStreamCnt = 0;	// 연속 자음 개수
			boolean streamTF = true;	// 3개 이상 연속되는지
			
			for(int i=0; i<str.length(); i++) {
				
				// 모음 개수가 1개 이상인지 확인
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					vowelCnt++;
					consonantStreamCnt = 0;
					vowelStreamCnt++;
					
					if(vowelStreamCnt == 3) {
						streamTF = false;
						break;
					}
				} else {
					vowelStreamCnt = 0;
					consonantStreamCnt++;
					
					if(consonantStreamCnt == 3) {
						streamTF = false;
						break;
					}
				}
				
				// 2개 연속오는지 확인
				if(i < str.length()-1) {
					if(str.charAt(i) == str.charAt(i+1)) {
						if(str.charAt(i) != 'e' && str.charAt(i) != 'o') {
							streamTF = false;
							break;
						}
					}
				}
				
				
			}
			
			if(vowelCnt == 0 || streamTF == false) {
				sb.append("<"+str+">").append(" is not acceptable.").append("\n");
			} else {
				sb.append("<"+str+">").append(" is acceptable.").append("\n");
			}
			
		}
		
		System.out.println(sb);
	}
}