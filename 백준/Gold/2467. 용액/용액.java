import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static int[] arr;
	static long min = Long.MAX_VALUE;
	static int minusMax = 0;		// 음수 갯수
	static int idx1, idx2;
	
	public static void main(String[] args) throws IOException{
	
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] < 0) {
				minusMax++;
			}
		}
		
		
		if(minusMax > 1) {
			minus();
		}
		
		if(N-minusMax > 1) {
			plus();
		}

		if(minusMax > 0 && N-minusMax > 0) {
			mix();
		}

		sb.append(arr[idx1]).append(" ").append(arr[idx2]);
		System.out.println(sb);
	}
	
	// 알칼리성 2개 합
	public static void minus() {
		
		long temp = Math.abs(arr[minusMax-2] + arr[minusMax-1]);
		if(min > temp) {
			min = temp;
			idx1 = minusMax-2;
			idx2 = minusMax-1;
		}
	}

	// 산성 2개 합
	public static void plus() {
		
		if(min > Math.abs(arr[minusMax+1] + arr[minusMax])) {
			min = arr[minusMax+1] + arr[minusMax];
			idx2 = minusMax+1;
			idx1 = minusMax;
		}
	}
	
	// 알칼리성, 산성 하나씩일 경우
	public static void mix() {
		
		// 알칼리성이 적은 경우
		if(minusMax < N-minusMax) {
			long temp_min = Long.MAX_VALUE;
			for(int i=0; i<minusMax; i++) {
				for(int j=N-1; j>=minusMax; j--) {
					long sum = Math.abs(arr[i] + arr[j]);
					if(temp_min > sum) {
						temp_min = sum;

					}
					else if(temp_min < sum){
						break;
					}
					
					if(temp_min < min) {
						min = temp_min;
						idx1 = i;
						idx2 = j;
					}
				}
			}
		}
		// 산성이 적은 경우
		else {
			for(int i=minusMax; i<N; i++) {
				long temp_min = Long.MAX_VALUE;
				for(int j=0; j<minusMax; j++) {
					long sum = Math.abs(arr[i] + arr[j]);
					if(temp_min > sum) {
						temp_min = sum;
					}
					else if(temp_min < sum){
						break;
					}
					
					if(temp_min < min) {
						min = temp_min;
						idx1 = j;
						idx2 = i;
					}
				}
			}
		}
	}
}