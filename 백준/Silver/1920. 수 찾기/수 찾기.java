import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int cnt1 = Integer.parseInt(br.readLine());
		int[] arr1 = new int[cnt1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<cnt1; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		int cnt2 = Integer.parseInt(br.readLine());
		int[] arr2 = new int[cnt2];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<cnt2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		// arr1 정렬
		Arrays.sort(arr1);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(binarySearch(arr1, arr2[i], 0, arr1.length-1));
		}
	}
	
	// 이분 탐색
	static int binarySearch(int[] arr, int key, int low, int high) {
		
		int mid;
		
		while(low <= high) {
			if((low + high)%2 == 0) {
				mid = (low + high)/2;
			} else {
				mid = (low + high)/2+1;
			}
			
			if(key == arr[mid]) {
				return 1;
			} else if(key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return 0;
	}
}