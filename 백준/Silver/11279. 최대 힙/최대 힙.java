import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static long result;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		while(N-->0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				int exitNum;
				if(queue.size() > 0) {
					exitNum = queue.poll();
				} else {
					exitNum = 0;
				}
				sb.append(exitNum).append("\n");
			} 
			else {
				queue.add(num);
			}
		}
		
		System.out.println(sb);
	}
}