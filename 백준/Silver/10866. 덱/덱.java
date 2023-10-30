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
	
		Deque<Integer> deque = new LinkedList<Integer>();
	
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<st.countTokens(); j++) {
				if(st.countTokens() == 2) {
					String a = st.nextToken();
					int b = Integer.parseInt(st.nextToken());
					
					if(a.equals("push_front")) {
						deque.addFirst(b);
					} else {
						deque.addLast(b);
					}
				} else {
					String a = st.nextToken();
					if(a.equals("pop_front")) {
						if(deque.size() == 0) {
							System.out.println(-1);
						} else {
							System.out.println(deque.pollFirst());
						}
					} else if(a.equals("pop_back")) {
						if(deque.size() == 0) {
							System.out.println(-1);
						} else {
							System.out.println(deque.pollLast());
						}
					} else if(a.equals("size")) {
						System.out.println(deque.size());
					} else if(a.equals("empty")) {
						if(deque.size() == 0) {
							System.out.println(1);
						} else {
							System.out.println(0);
						}
					} else if(a.equals("front")) {
						if(deque.size() == 0) {
							System.out.println(-1);
						} else {
							System.out.println(deque.getFirst());
						}
					} else if(a.equals("back")) {
						if(deque.size() == 0) {
							System.out.println(-1);
						} else {
							System.out.println(deque.getLast());
						}
					}
				}
			}
			
		}
	}
}