import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int T;
	
	static int N;
	static int[] arrN;
	
	static long sum;
	
	public static void main(String[] args) throws IOException{
		
		T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			sum = 0;
			N = Integer.parseInt(br.readLine());
				
			arrN = new int[N+1];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=1; i<N+1; i++) {
				arrN[i] = Integer.parseInt(st.nextToken());
			}

			maxValue(1, N);
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void maxValue(int start, int end) {
		
		int max = arrN[end];
		int max_i = end;
		
		int temp = max_i;

		for(int i=end-1; i>=start; i--) {
			if(max > arrN[i]) {
				temp = i;
			} else {
				break;
			}
		}
		
		for(int i=end; i>=temp; i--) {
			sum += (arrN[max_i] - arrN[i]);
		}

		if(temp != 1) {
			maxValue(1, temp-1);
		}
	}
}