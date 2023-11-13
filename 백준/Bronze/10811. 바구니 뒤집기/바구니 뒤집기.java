import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[num1+1];
		
		// 기본 셋팅
		for(int i=1; i<=num1; i++) {
			arr[i] = i;
		}
		
		while(num2 > 0) {

			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int tempNum;
			
			// 같으면 변동 없으므로 제외
			if(start != end) {
				for(int i=start; i<=end; i++) {
					tempNum = arr[i];
 					arr[i] = arr[end];
 					arr[end] = tempNum;
 					
 					end--;
				}
			}
			
			num2--;
		}
		
		for(int i=1; i<arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
	}
}