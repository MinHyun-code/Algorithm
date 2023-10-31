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
	
		int count = Integer.parseInt(br.readLine());
		
		int[] arr = new int[count];
		
		for(int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<count; i++) {
			if(i != count-1) {
				sb.append(arr[i]+"\n");
			} else {
				sb.append(arr[i]);
			}
		}
		
		System.out.print(sb);
	}
}