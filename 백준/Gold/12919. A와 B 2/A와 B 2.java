import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static String S, T;
	static int N; 	// 삭제시켜야할 문자 갯수
	
	public static void main(String[] args) throws IOException{
		
		S = br.readLine();
		T = br.readLine();
		
		N = T.length() - S.length() + 1;
		
		
		
		System.out.println(func(T));
	}
	
	public static int func(String st) {
		
		if(st.length() == S.length()) {
			if(st.equals(S)) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		int answer = 0;
		
		if(st.charAt(st.length()-1) == 'A') {
			String stA = st.substring(0, st.length()-1);
			
			answer += func(stA);
		}
		
		if(st.charAt(0) == 'B') {
			String temp = "";
			for(int i=st.length()-1; i>=0; i--) {
				temp += st.charAt(i);
			}
			String stB = temp.substring(0, temp.length()-1);
			
			answer += func(stB);
		}
		
		return answer > 0 ? 1 : 0;
	}
	
}