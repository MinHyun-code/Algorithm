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
		
		int cnt = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();

		// 시작 값
		int start = 0;
		
		for(int i=0; i<cnt; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > start) {
				for(int j=start+1; j<=num; j++) {
					stack.add(j);
					sb.append("+").append("\n");
				}
				start = num;
			}
			
			else if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		
		System.out.println(sb);
	}
}