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
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int time = 0;
		
		for(int i=0; i<arr.length; i++) {
			time += arr[i]*num;
			num--;
		}
		
		System.out.println(time);
	}
}