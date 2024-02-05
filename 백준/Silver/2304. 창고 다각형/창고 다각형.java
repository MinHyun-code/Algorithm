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
	
	static int N;
//	static int[][] arr;
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		
		N = Integer.parseInt(br.readLine());
		arr = new int[1001];
		
		int maxL = -1;
		int minL = 1001;
		
		int maxH = -1;
		int tempL = -1;
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			
			arr[L] = H;
		
			if(L >= maxL) {
				maxL = L;
			}
			if(L < minL) {
				minL = L;
			}
			
			if(H > maxH) {
				maxH = H;
				tempL = L;
			}
		}
		
		
		for(int i=minL; i<tempL; i++) {
			if(arr[i-1] > arr[i]) {
				arr[i] = arr[i-1];
			}
		}
		
		for(int i=maxL; i>tempL; i--) {
			if(arr[i-1] < arr[i]) {
				arr[i-1] = arr[i];
			}
		}

		for(int i=minL; i<=maxL; i++) {
			sum += arr[i];
		}
		
//		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}
}