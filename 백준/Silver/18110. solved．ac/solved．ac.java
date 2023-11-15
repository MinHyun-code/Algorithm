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
		
		// 절사 평균으로 제외한 인원
		int excludeNum = (int) Math.round(num*0.15);
		
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);

		for(int i=0+excludeNum; i<num-excludeNum; i++) {
			sum += arr[i];
		}
		
		double temp = sum / (double)(num-excludeNum*2);
		int result = (int) Math.round(temp);

		System.out.println(result);
		
	} 
}