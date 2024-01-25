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
	static int minValue = 1000000000;
	static int minIndex = 100000;
	static long amt = 0;
	
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
			// 끝지점은 제외
			if(minValue > arrN[i] && i != N) {
				minValue = arrN[i];
				minIndex = i;
			}
		}
		
		// 처음이 가장 작은 가격일 경우
		if(minIndex == 1) {
			for(int i=1; i<=M; i++) {
				amt += arrM[i];
			}
		} 
		else {
			amt += (arrN[1] * arrM[1]);
			subFunction(minIndex, N);
		}
		// 위 조건 이전 도로는 어떻게 할까?
		// 똑같이 반복문 돌려야할거 같은데
		
		
		// 맨 끝 도시의 기름 가격은 안씀

		System.out.println(amt);
	}
	
	public static void subFunction(int min, int max) {
	// 제일 작은 비용 : 뒤로 있는 도로 길이 모두 +
		
		long total = 0; // 도로 길이 합
		
		for(int i=min; i<max; i++) {
			total += arrM[i];
		}
		
		amt += (total * arrN[minIndex]);

		System.out.println(amt);
		
		minValue = 1000000000;
		int maxIndex = minIndex;
		
		for(int i=2; i<minIndex; i++) {
			if(minValue > arrN[i]) {
				minValue = arrN[i];
				minIndex = i;
			}
		}
		
		if(minValue != 1000000000) {
			subFunction(minIndex, maxIndex);
		}
	}
}