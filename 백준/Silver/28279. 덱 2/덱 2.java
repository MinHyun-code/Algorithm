import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
				
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			int num;
			switch (str) {
			case "1":
				num = Integer.parseInt(st.nextToken());
				deque.addFirst(num);
				break;
			case "2":
				num = Integer.parseInt(st.nextToken());
				deque.addLast(num);
				break;
			case "3":
				if(deque.size() > 0) {
					sb.append(deque.pollFirst()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "4":
				if(deque.size() > 0) {
					sb.append(deque.pollLast()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "5":
				sb.append(deque.size()).append("\n");
				break;
			case "6":
				if(deque.size() == 0) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case "7":
				if(deque.size() > 0) {
					sb.append(deque.peekFirst()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "8":
				if(deque.size() > 0) {
					sb.append(deque.peekLast()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;

			default:
				break;
			}
		}
		
		System.out.println(sb);
	}
}