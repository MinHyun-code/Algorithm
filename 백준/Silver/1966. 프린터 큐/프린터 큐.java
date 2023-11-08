import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int t;	// 테스트케이스 수
	static int n;	// 문서의 개수
	static int m;	// 궁금한 문서의 초기 위치
	static Queue<Integer> queue;	// 문서의 중요도
	static Queue<Integer> indexQueue;	// 문서의 인덱스

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());

		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			
			queue = new LinkedList<>();
			indexQueue = new LinkedList<>();
			
			for(int j=0; j<n; j++) {
				queue.offer(Integer.parseInt(st.nextToken()));
				indexQueue.offer(j);
			}
			
			solve();
		}
	}
	
	public static void solve() {
		
		int count = 1; // 몇번째 인쇄인지
		
		while(!queue.isEmpty()) {
			int max = Collections.max(queue);	// 현재 최우선 문서
			int cur = queue.poll();				// 현재 문서
			int curIndex = indexQueue.poll();	// 현재 인덱스
			
			// 인쇄 가능할 때
			if(cur == max) {
				// 찾는 문서를 인쇄했다면 몇번 째 인쇄인지 출력, break
				if(curIndex == m) {
					System.out.println(count);
					break;
				}
				count++;
			} else {
				queue.offer(cur);
				indexQueue.offer(curIndex);
			}
		}
	}
}