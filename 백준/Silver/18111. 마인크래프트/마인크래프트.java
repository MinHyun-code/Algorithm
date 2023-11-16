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
		
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int store = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		// 땅의 높이 최대 최솟값
		int min = 256;
		int max = 0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(min > arr[i][j]) {
					min = arr[i][j];
				}
				
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
				
			}
		}
		
//		걸린 시간
		int time = 999999999;
		int timeTemp = 0;
//		맞춘 땅의 높이
		int height = 0;
		
		// 최소 높이와 최대 높이 사이의 갑
		for(int i=min; i<=max; i++) {

			timeTemp = 0;
			
			int block = store;
			
			for(int j=0; j<N; j++) {
				for(int z=0; z<M; z++) {
					
					// 높을 때
					if(arr[j][z] > i) {
						timeTemp += (arr[j][z] - i) * 2;
						block += (arr[j][z] - i);
					} else {
						timeTemp += i - arr[j][z];
						block -=  (i - arr[j][z]);
					}
				}
			}
			
			if(block < 0) {
				break;
			}
			
			// 같은 시간이라도 높은 높이를 출력해야하므로
			if(time >= timeTemp) {
				time = timeTemp;
				height = i;
			}
		}

		sb.append(time).append(" ").append(height);
		System.out.println(sb);
	}
}