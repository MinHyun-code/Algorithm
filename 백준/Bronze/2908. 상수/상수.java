import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(bf.readLine());
		
		String st0 = st.nextToken();
		String st1 = st.nextToken();
		
		String num0 = "";
		String num1 = "";
		
		for(int i=st0.length()-1; i>=0; i--) {
			num0 += st0.substring(i, i+1);
		}
		
		for(int i=st1.length()-1; i>=0; i--) {
			num1 += st1.substring(i, i+1);
		}

		StringBuilder sb = new StringBuilder();
		
		if(Integer.parseInt(num0) > Integer.parseInt(num1)) {
			sb.append(num0);
		} else {
			sb.append(num1);
		}
		System.out.println(sb);
	}
}