import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			Stack<String> stack = new Stack<String>();
			String result = "YES";
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				String subStr = str.substring(j, j+1);
				
				if(subStr.equals("(")) {
					stack.push(subStr);
				} else {
					if(stack.size() > 0) {
						stack.pop();
					} else {
						result = "NO";
					}
				}
			}
			
			if(stack.size() > 0) {
				result = "NO";
				System.out.println(result);
			} else {
				System.out.println(result);
			}
		}
	}
}