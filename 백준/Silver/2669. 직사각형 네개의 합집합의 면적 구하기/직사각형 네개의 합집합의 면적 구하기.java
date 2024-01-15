import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] arr = new int[4][4];
		
		for(int i=0; i<4; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		boolean[][] result = new boolean[101][101];
		
		int cnt = 0;
		
		for(int i=0; i<4; i++) {
			int lowerX = arr[i][0];
			int upperX = arr[i][2];
			int lowerY = arr[i][1];
			int upperY = arr[i][3];
			
			for(int j=lowerX; j<upperX; j++) {
				for(int z=lowerY; z<upperY; z++) {
					if(!result[j][z]) {
						result[j][z] = true;
					}
				}
			}
		}
		
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (result[i][j]) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
 	}
} 