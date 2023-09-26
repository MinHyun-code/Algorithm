import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int input = Integer.parseInt(bf.readLine());
		
		int[][] arr = new int[input][2];
		
		for(int i=0; i<input; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][0] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input; i++) {
			sb.append(arr[i][1] + " " + arr[i][0]).append("\n");
		}
		System.out.println(sb);
	}
}