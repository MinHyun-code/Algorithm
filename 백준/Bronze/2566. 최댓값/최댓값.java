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
		
		int[][] arr = new int[10][10];
		int max = 0;
		int x = 1;
		int y = 1;
		
		for(int i=1; i<=9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=9; j++) {
				 int num = Integer.parseInt(st.nextToken());
				 if(max < num) {
					 x = i;
					 y = j;
					 max = num;
				 }
				 arr[i][j] = num;
			}
		}
		sb.append(arr[x][y]).append("\n");
		sb.append(x).append(" ").append(y);
		
		System.out.println(sb);
	} 
}