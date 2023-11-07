import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 최대로 수정하는 경우 8*8
	static int min = 64;
	static boolean[][] arr;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());

		// 행
		int column = Integer.parseInt(st.nextToken());
		// 열
		int row = Integer.parseInt(st.nextToken());
		
		arr = new boolean[column][row];
		
		for(int i=0; i<column; i++) {
			String str = br.readLine();
			for(int j=0; j<row; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
				
			}
		}

		for(int i=0; i<(column-7); i++) {
			for(int j=0; j<(row-7); j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}
	
	public static void find(int x, int y) {
		int end_x = x+8;
		int end_y = y+8;
		int count = 0;
		
		boolean TF = arr[x][y]; // 첫번째 칸의 색
		
		for(int i=x; i<end_x; i++) {
			for (int j=y; j<end_y; j++) {
				
				// 올바른 색이 아닐 경우 count 1 증가
				if(arr[i][j] != TF) { 
					count++;
				}
				// 다음 칸은 색이 바뀌므로 변경
				TF = !TF;
			}
			TF = !TF;
 		}
		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * 이전까지의 경우 중 최솟값보다 현재 count 값이
		 * 더 작을 경우 최솟값을 갱신 
		 */
		min = Math.min(min, count);
	}
}