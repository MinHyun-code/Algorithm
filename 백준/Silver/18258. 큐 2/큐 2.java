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
		StringBuilder sb = new StringBuilder();
				
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int backNum = 0;
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			
			if(str.equals("push")) {
				int addItem = Integer.parseInt(st.nextToken());
				backNum = addItem;
				queue.add(addItem);
			} else if(str.equals("front")) {
				if(queue.size() > 0) {
					sb.append(queue.peek()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
			} else if(str.equals("back")) {
				if(queue.size() > 0) {
					sb.append(backNum).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
 			} else if(str.equals("size")) {
 				sb.append(queue.size()).append("\n");
 			} else if(str.equals("empty")) {
 				if(queue.size() == 0) {
 					sb.append("1").append("\n");
 				} else {
 					sb.append("0").append("\n");
 				}
 			} else if(str.equals("pop")) {
 				if(queue.size() > 0) {
					sb.append(queue.poll()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
 			}
		}
		
		System.out.println(sb);
	}
}