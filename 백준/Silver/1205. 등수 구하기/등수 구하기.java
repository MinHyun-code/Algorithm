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
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int newScore = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int lower = 2000000000; // 가장 낮은 점수
		int lowerIndex = 0; 	// 가장 낮은 점수의 인덱스
		
		int[] arr = new int[P+1];
		int[] rank = new int[N+1]; // 랭킹
		
		arr[N] = newScore;
		
		// 숫자가 아무도 없었을 때, 무조건 1등 출력
		if(N == 0) {
			System.out.println(1);
			return;
		}
		
		// 랭킹 1로 셋팅
		for(int i=0; i<=N; i++) {
			rank[i] = 1;
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			// 가장 낮은 점수 셋팅
			if(lower > arr[i]) {
				lower = arr[i];
				lowerIndex = i;
			}
		}
		
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=N; j++) {
				if(arr[i] < arr[j]) {
					// 추가로 넣으면 초과할 때, 가장 낮은 값 제외
					if(P == N) {
						if(i != lowerIndex && j != lowerIndex) {
							rank[i]++;
						}
					}
					else {
						rank[i]++;
					}
				}
			}
		}

		// 새로운 점수가 가장 낮은 점수보다 낮을 경우 -1
		if(newScore <= lower && P == N) {
			sb.append(-1);
		}
		else {
			sb.append(rank[N]);
		}
		
		System.out.println(sb);
	}
}