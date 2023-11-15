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
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		int sum = 0;
		int center = num/2;
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;
		
		for(int i=0; i<num; i++) {
			// 동일한 수가 나온만큼 i값 jump
			int jump = 0;
			int count = 1;
			int i_value = arr[i];
			
			for(int j=i+1; j<num; j++) {
				if(arr[i] != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			i += jump;
		}
		
		
		
		sb.append((int)Math.round((double)sum / num)).append("\n");
		sb.append(arr[center]).append("\n");
		sb.append(mode).append("\n");
		sb.append(arr[num-1]-arr[0]).append("\n");
		
		System.out.println(sb);
	} 
}