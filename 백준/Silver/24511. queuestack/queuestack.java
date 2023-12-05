import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		
		// 2번째로 받는 수열은 해당 숫자를 가진 각각의 자료구조다. 
		 
		st = new StringTokenizer(br.readLine());
		
		// Queue(0)인지 Stack(1)인지
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		// 자료구조 리스트
		int[] arr2 = new int[N];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=N-1; i>=0; i--) {
			if(arr[i] == 0) {
				queue.add(arr2[i]);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		
		// 삽입할 원소 리스트
		int[] arr3 = new int[M];
		
		st = new StringTokenizer(br.readLine());

		for(int i=0; i<M; i++) {
			arr3[i] = Integer.parseInt(st.nextToken());
		}

		/*
		 *  1. Queue일 때만 값이 바뀜.
		 * 	2. 	
		 */

		for(int i=0; i<M; i++) {

			if(queue.size() > 0) {
				queue.add(arr3[i]);
				sb.append(queue.poll()).append(" ");
				
			} else {
				sb.append(arr3[i]).append(" ");
			}
		}
		
		System.out.println(sb);
	}
}