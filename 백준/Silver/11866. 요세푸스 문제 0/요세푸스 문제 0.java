import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Queue<Integer> queue = new LinkedList<Integer>();
	
		st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		int[] result = new int[num1];
		
		for(int i=1; i<=num1; i++) {
			queue.add(i);
		}

		for(int j=0; j<num1; j++) {
			for(int i=0; i<num2-1; i++) {
				queue.add(queue.peek());
				queue.poll();
			}
			result[j] = queue.peek();
			queue.remove();
		}
		
		System.out.print("<");
		for(int i=0; i<result.length; i++) {
			if(i != result.length-1) {
				System.out.print(result[i]+", ");
			} else {
				System.out.print(result[i]);
			}
		}
		System.out.print(">");
	}
}