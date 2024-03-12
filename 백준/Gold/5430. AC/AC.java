import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int T; 		// 테스트 케이스 개수 
	
	public static void main(String[] args) throws IOException{

		T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {

			Deque<Integer> deque = new ArrayDeque<Integer>();
			String p = br.readLine(); 	// 실행할 명령어
			int n = Integer.parseInt(br.readLine());	// 배열에 들어있는 숫자의 개수
			String str = br.readLine();	// 배열
			boolean tf = true;
			String tempStr = "";
			
			if(n > 0) {
				for(int j=1; j<str.length(); j++) {
					if(str.charAt(j) == ',' || str.charAt(j) == ']') {
						deque.add(Integer.parseInt(tempStr));
						tempStr = "";
					} else {
						tempStr += String.valueOf(str.charAt(j)-'0');
					}
				}
			}
			
			boolean reverse = false;
			boolean error = false;
			
			for(int j=0; j<p.length(); j++) {
				if(p.charAt(j) == 'R') {
					if(reverse) {
						reverse = false;
					} else {
						reverse = true;
					}
					continue;
				}
				
				if(deque.size() < 1) {
					error = true;
					continue;
				}
				
				if(reverse) {
					deque.pollLast();
				} 
				else {
					deque.pollFirst();
				}
			}
			
			if(error) {
				sb.append("error").append("\n");
				continue;
			}
			
			sb.append("[");
			
			if(!reverse) {
				while(!deque.isEmpty()) {
					if(deque.size() == 1) {
						sb.append(deque.pollFirst());
					}
					else {
						sb.append(deque.pollFirst() + ",");
					}
				}
			}
			else {
				while(!deque.isEmpty()) {
					if(deque.size() == 1) {
						sb.append(deque.pollLast());
					}
					else {
						sb.append(deque.pollLast() + ",");
					}
				}
			}
			
			
			
			sb.append("]").append("\n");
		}
		
		System.out.println(sb);
	}
}