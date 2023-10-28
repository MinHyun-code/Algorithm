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
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		int temp = 0;
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<st.countTokens(); j++) {
				int count = queue.size();
				String tempStr = st.nextToken();
				if(tempStr.equals("push")) {
					temp = Integer.parseInt(st.nextToken());
					queue.add(temp);
				} else if(tempStr.equals("pop")) {
					if(count > 0) {
						System.out.println(queue.poll());
					} else {
						System.out.println(-1);
					}
				} else if(tempStr.equals("size")) {
					System.out.println(count);
				} else if(tempStr.equals("empty")) {
					if(count > 0) {
						System.out.println(0);
					} else {

						System.out.println(1);
					}
				} else if(tempStr.equals("front")) {
					if(count > 0) {
						System.out.println(queue.peek());
					} else {
						System.out.println(-1);
					}
				} else if(tempStr.equals("back")) {
					if(count > 0) {
						System.out.println(temp);
					} else {
						System.out.println(-1);
					}
				}
			}
		}
	}
}