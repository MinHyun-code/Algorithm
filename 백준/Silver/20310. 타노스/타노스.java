import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		String S = br.readLine();
		
		Integer[] arr = new Integer[S.length()];
		int[] cnt = new int[2];
		
		for(int i=0; i<S.length(); i++) {
			arr[i] = S.charAt(i)-48;
			
			if(arr[i] == 1) {
				cnt[1]++;
			}
			else {
				cnt[0]++;
			}
		}
		
		
		// 1은 앞에서 부터 떼고 
		// 0은 뒤에서 부터 뗌
		
		cnt[1] = cnt[1]/2;
		cnt[0] = cnt[0]/2;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1 && cnt[1] > 0) {
				arr[i] = null;
				cnt[1]--;
			}
			if(cnt[1] == 0) {
				break;
			}
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] != null && arr[i] == 0 && cnt[0] > 0) {
				arr[i] = null;
				cnt[0]--;
			}
			if(cnt[0] == 0) {
				break;
			}
			
		}
		
		String result = "";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				result += String.valueOf(arr[i]);
			}
		}
		
		System.out.println(result);
	}
}