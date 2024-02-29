import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int N, M;
	static Integer[] arr;
	
	public static void main(String[] args) throws IOException{

		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new Integer[N];
		
		st = new StringTokenizer(br.readLine());
		
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 내림차순 정렬
		Arrays.sort(arr, Collections.reverseOrder());
		
		
		long low = 1;
		long high = 2000000000;
		
		while(low <= high) {

			long slice = 0;
			long mid = (low + high) / 2;
			
			for(int i=0; i<N; i++) {
				if(mid >= arr[i]) {
					break;
				} else {
					slice += arr[i] - mid;
				}
			}
			
			if(slice >= M) {
				low = mid + 1;
			}
			
			else if(slice < M) {
				high = mid - 1;
			}
		}
		System.out.println(high);
		
	}
}