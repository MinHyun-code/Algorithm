import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	
	public static void main(String[] args) throws IOException{
	
		N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		Stack<int[]> stack = new Stack<int[]>();
		
		for(int i=1; i<=N; i++) {
			int top = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				if(stack.peek()[1] >= top) {
					System.out.print(stack.peek()[0] + " ");
					break;
				}
				
				stack.pop();
			}
			if(stack.isEmpty()) {
				System.out.print("0 ");
			}
			stack.push(new int[] {i, top});
		}	
	}
}