import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int[] arrN;
	static int[] arrM;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());	// 도시 수
		M = N-1;								// 도로 수
		
		arrN = new int[N+1];					// 도시별 기름 가격
		arrM = new int[M+1];					// 도로의 길이 배열
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=M; i++) {
			arrM[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());	
		}
		
		int minCost = arrN[1];
		long amt = 0;
		
		for(int i=1; i<=N-1; i++) {
			if(arrN[i] < minCost) {
				minCost = arrN[i];
			}
			
			amt += minCost * arrM[i];
		}
		
		System.out.println(amt);
	}
}