import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int switchCnt = Integer.parseInt(br.readLine());
		int[] arr = new int[switchCnt+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=switchCnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int studentCnt = Integer.parseInt(br.readLine());

		for(int i=0; i<studentCnt; i++) {
			st = new StringTokenizer(br.readLine());

			int gender = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
		
			// 남자일 경우
			if(gender == 1) {
				for(int j=1; j<=switchCnt; j++) {
					// 나누어 떨어질 때 바꿈
					if(j % number == 0) {
						if(arr[j] == 1) {
							arr[j] = 0;
						}
						else {
							arr[j] = 1;
						}
					}
				}
			}
			// 여자일 경우
			else {
				// 해당 스위치 바꿈
				if(arr[number] == 1) {
					arr[number] = 0;
				}
				else {
					arr[number] = 1;
				}
				
				// 좌우 대칭되는 곳 까지 바꿈
				int temp = 1;

				while(true) {
					if(number-temp >= 1 && number+temp <= switchCnt) {
						if(arr[number-temp] == arr[number+temp]) {
							if(arr[number-temp] == 1) {
								arr[number-temp] = 0;
								arr[number+temp] = 0;
							}
							else {
								arr[number-temp] = 1;
								arr[number+temp] = 1;
							}
						}
						else {
							break;
						}
					}
					else {
						break;
					}
					temp++;
				}
			}
		}
		
		for(int i=1; i<=switchCnt; i++) {
			sb.append(arr[i]).append(" ");
			if(i%20 == 0) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
}