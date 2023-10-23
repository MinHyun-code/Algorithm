import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int cnt = Integer.parseInt(bf.readLine());

		int[][] arr = new int[15][15];
		
		for(int i=0; i<15; i++) {
			// 1호
			arr[i][0] = 1;
			// 1층
			arr[0][i] = i+1;
		}
		
		for(int j=1; j<15; j++) {
			for(int k=1; k<15; k++) {
				arr[j][k] = arr[j-1][k] + arr[j][k-1];
			}
		}
		
		for(int i=0; i<cnt; i++) {
			int num1 = Integer.parseInt(bf.readLine());
			int num2 = Integer.parseInt(bf.readLine());
			
			System.out.println(String.valueOf(arr[num1][num2-1]));
		}
	}
}