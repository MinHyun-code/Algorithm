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
		
		Stack<Integer> list = new Stack<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for(int i=1; i<=N; i++) {
			if(N%i == 0) {
				list.push(i);
			}
			
			if(list.size() == K) {
				break;
			}
		}
		
		if(list.size() < K) {
			System.out.println(0);
		} else {
			System.out.println(list.peek());
		}
	}
}