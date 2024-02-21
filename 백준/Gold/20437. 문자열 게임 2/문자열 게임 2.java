import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static String W;
	static int T, K;
	static int[] arr;
	
	static int min;
	static int max;
	
	public static void main(String[] args) throws IOException{
		
		T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			W = br.readLine();
			K = Integer.parseInt(br.readLine()); 

			min = Integer.MAX_VALUE;
			max = -1;
			arr = new int[26];
			
			int maxLength = 0;
			
			for(int i=0; i<W.length(); i++) {
				arr[W.charAt(i)-97]++;
				
				if(maxLength < arr[W.charAt(i)-97]) {
					maxLength = arr[W.charAt(i)-97];
				}
			}	
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] >= K) {
					func(i, arr[i]);
				}
			}
		
			if(maxLength < K) {
				sb.append(-1).append("\n");
				continue;
			}
			else {
				sb.append(min).append(" ").append(max).append("\n");
			}
			
		}
		
		System.out.println(sb);
	}
	
	public static void func(int num, int cnt) {
	
		// index 배열
		int[] indexArr = new int[cnt];
		int count = 0;
		
		for(int i=0; i<W.length(); i++) {
			if(W.charAt(i) == 97 + num) {
				indexArr[count] = i;
				count++;
			}
		}
		
		for(int i=0; i<indexArr.length; i++) {
			if(i+K-1 < indexArr.length) {
				if(min > indexArr[i+K-1] - indexArr[i] + 1) {
					min = indexArr[i+K-1] - indexArr[i] + 1;
				}
				if(max < indexArr[i+K-1] - indexArr[i] + 1) {
					max = indexArr[i+K-1] - indexArr[i] + 1;
				}
			}
		}
	}
}