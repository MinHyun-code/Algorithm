import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String str = bf.readLine();
		st = new StringTokenizer(str);
		
		int num = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		while(result<num) {
			String resultStr = String.valueOf(result);
			int sum = result;
			for(int i=0; i<resultStr.length(); i++) {
				sum += Integer.parseInt(resultStr.substring(i,i+1));
			}
			if(sum == num) {
				break;
			}
			result++;
		}
		
		if(result == num) {
			result = 0;
		}
		
		System.out.println(result);
	}
}