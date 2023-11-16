import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		
		long sum = 0;
		
		//최대값
		long max = 0;
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += num;
			
			if(max < num) {
				max = num;
			}
		}
		
		long result = binary_search(arr, M, max);
		
		System.out.println(result);
		
	}
	
	public static long binary_search(int[] arr, int M, long max) {
		
		long half = 0;
		long min = 1;
		
		while(min <= max) {
			half = (min + max)/2;
			int count = 0;
			
			for(int num : arr) {
				count += num/half;
			}
			
			if(count < M) {
				max = half-1;
			}
			else {
				min = half+1;
			}
		}
		
		return (max+min)/2;
	}
}