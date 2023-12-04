import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
				
		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		
		Deque<Balloon> list = new ArrayDeque<Balloon>();
		
		for(int i=1; i<=N; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(new Balloon(i, num));
		}
		
		
		while(!list.isEmpty()) {

			sb.append(list.getFirst().index).append(" ");
			
			// 첫번째 풍선을 꺼낸 후 적혀있는 값 저장
			int next = list.poll().value;
		
			if(list.isEmpty()) {
				break;
			}
			
			/*
			 * 간단하게 생각하면 다음 순번의 값을 맨 앞에 두기위해 list 순서 조정한다는 느낌
			 */
			
			// 양수인 경우
			if(next > 0) {
				for(int i=0; i<next-1; i++) {
					list.addLast(list.pollFirst());
				}
			}
			
			// 음수인 경우
			else {
				for(int i=0; i<Math.abs(next); i++) {
					list.addFirst(list.pollLast());
				}
			}
		}
		System.out.println(sb);
	}
}

class Balloon {
	int index;	// 순번
	int value;	// 값
	
	public Balloon(int index, int value) {
		this.index = index;
		this.value = value;
	}
}