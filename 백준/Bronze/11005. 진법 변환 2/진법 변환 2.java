import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		String result = "";
		
		while(N > 0) {
			int remain = N%B;
			
			if(remain >= 10) {
				char cha = (char) (remain+55);
				result += cha;
			} else {
				result += remain;
			}

			N = N/B;
		}
		
		for(int i=result.length()-1; i>=0; i--) {
			System.out.print(result.substring(i,i+1));
		}
	}
}