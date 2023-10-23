import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(bf.readLine());
		
		int cnt = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[cnt];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}

		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(i!=arr.length-1) {
				stringBuilder.append(arr[i] + "\n");
			} else {
				stringBuilder.append(arr[i]);
			}
		}
		
		System.out.println(stringBuilder);
	}
}