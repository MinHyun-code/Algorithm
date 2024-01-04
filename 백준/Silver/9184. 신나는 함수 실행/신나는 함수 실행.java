import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int[][][] arr = new int[51][51][51];
	static int result;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {

			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			
			result = 0;
			
			result += Wfuc(a,b,c);
			
			sb.append("w("+a+", "+b+", "+c+") = " + result).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static int Wfuc(int a, int b, int c) {
		
		if(a > 0 && b > 0 && c > 0 && arr[a][b][c] != 0) {
			return arr[a][b][c];
		}
		
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} else if(a > 20 || b > 20 || c > 20) {
			return arr[20][20][20] = Wfuc(20,20,20);
		} else if(a < b && b < c) {
			return arr[a][b][c] = Wfuc(a, b, c-1) + Wfuc(a, b-1, c-1) - Wfuc(a, b-1, c);
		} else {
			return arr[a][b][c] = Wfuc(a-1, b, c) + Wfuc(a-1, b-1, c) + Wfuc(a-1, b, c-1) - Wfuc(a-1, b-1, c-1);
		}
	}
}