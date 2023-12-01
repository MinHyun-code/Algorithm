
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
				
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(st.nextToken());
			
			if(num1 == 1) {
				int num2 = Integer.parseInt(st.nextToken());
				stack.add(num2);
			} else if(num1 == 2) {
				if(stack.size() == 0) {
					sb.append("-1").append("\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
			} else if(num1 == 3) {
				sb.append(stack.size()).append("\n");
			} else if(num1 == 4) {
				if(stack.size() == 0) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
			} else if(num1 == 5) {
				if(stack.size() == 0) {
					sb.append("-1").append("\n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}