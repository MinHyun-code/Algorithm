import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		// 직전 대각선 누적 합
		int cross_count = 1;
		
		// 해당 대각선 개수
		int prev_count_sum = 0;
		
		while(true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if(num <= prev_count_sum + cross_count) {
				
				if(cross_count%2 == 1) {	// 대각선의 개수가 홀수라면 분자가 큰 수부터 시작
					System.out.print((cross_count - (num - prev_count_sum -1) + "/" + (num - prev_count_sum)));
					break;
				}
			
				else {	// 대각선의 개수가 짝수라면
					System.out.print((num - prev_count_sum) + "/" + (cross_count - (num - prev_count_sum -1)));
					break;
				}
			}else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		} 
	}
}