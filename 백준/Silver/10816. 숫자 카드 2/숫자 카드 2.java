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
		
		int num1 = Integer.parseInt(br.readLine());
		
		String str1 = br.readLine();
		st = new StringTokenizer(str1);
		
		int[] arr1 = new int[num1];
		
		for(int i=0; i<num1; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr1);
		
		int num2 = Integer.parseInt(br.readLine());
		
		String str2 = br.readLine();
		st = new StringTokenizer(str2);
		
		for(int i=0; i<num2; i++) {
			
			int key = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arr1, key) - lowerBound(arr1, key)).append(' ');
		}
		
		System.out.print(sb);
	}
	
	private static int lowerBound(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length;
		
		// lo가 hi와 같아질 때까지 반복
		while(lo < hi) {
			int mid = (lo + hi) / 2; 	// 중간 위치를 구한다.
			
			/*
			 * key 값이 중간 위치의 값보다 작거나 같을 경우
			 */
			
			if(key <= arr[mid]) {
				hi = mid;
			}
			
			else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
	
	private static int upperBound(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length;
		
		// lo가 hi랑 같아질 때 까지 반복
		while (lo < hi) {
	 
			int mid = (lo + hi) / 2; // 중간위치를 구한다.
	 
			// key값이 중간 위치의 값보다 작을 경우
			if (key < arr[mid]) {
				hi = mid;
			}
			// 중복원소의 경우 else에서 처리된다.
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}