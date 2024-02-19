import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N, d, k, c;
	static int[] sushi;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());	// 회전벨트에 놓인 접시의 수
		d = Integer.parseInt(st.nextToken());	// 초밥의 가짓수
		k = Integer.parseInt(st.nextToken());	// 연속해서 먹는 접시의 수
		c = Integer.parseInt(st.nextToken());	// 쿠폰 번호
		
		sushi = new int[N+k-1];
		
		for(int i=0; i<N; i++) {
			sushi[i] = Integer.parseInt(br.readLine());
		}
		
		// N-k < 0 경우, Index 0부터 다시 시작하므로 채워준다
		for(int i=0; i<k-1; i++) {
			sushi[N++] = sushi[i];
		}
		
		int[] eaten = new int[d+1];
		
		int max = 1;	// 쿠폰은 먹은거로
		
		eaten[c] += 1;
		
		
		// 처음
		int start = 0;
		
		for(int i=start; i<k; i++) {
			if(eaten[sushi[i]] == 0) {
				max++;
			}
			
			eaten[sushi[i]]++;
		}
		
		// 윈도우 이동
		start = 0;
		
		int end = k;
		int result = max;
		
		for(int i=end; i<sushi.length; i++) {
			eaten[sushi[start]]--;
			
			// 삭제된 초밥 == 추가할 초밥, 빼지않아도 됨
			
			if(eaten[sushi[start]] == 0) {
				result--;
			}
			
			
			if(eaten[sushi[i]] == 0) {
				result++;
			}
			eaten[sushi[i]]++;
			
			max = Math.max(max, result);
			start++;
		}
		
		System.out.println(max);
	}
}