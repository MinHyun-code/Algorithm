import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String input;
		
		while(true) {		
			
			input = br.readLine();
			
			if(input.equals(".")) {
				break;
			}
			
			sb.append(solve(input)).append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	public static String solve(String input) {
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<input.length(); i++) {
			
			String c = input.substring(i, i+1);
			
			if(c.equals("(") || c.equals("[")) {
				stack.add(c);
			}
			else if(c.equals(")")) {
				if(stack.empty() || !stack.peek().equals("(")) {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			else if(c.equals("]")) {
				if(stack.empty() || !stack.peek().equals("[")) {
					return "no";
				}
				else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}