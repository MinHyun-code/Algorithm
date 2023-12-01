import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	// 소수 리스트
	static List<Integer> list = new ArrayList<Integer>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		
		int maxNum = 0;
		
		int[] arr = new int[N];
		
		for(int i=1; i<=N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(maxNum < num) {
				maxNum = num;
			}
			
			arr[i-1] = num;
		}
		
		// 가장 큰 값의 소수
		maxPrime(maxNum);
		
		for(int i=0; i<arr.length; i++) {
			prime(arr[i]);
		}
		System.out.println(sb);
	}
	
	
	public static void maxPrime(int num) {
		while(num>1) {
			// 소수 여부 확인
			boolean primeTF = true;
			
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					primeTF = false;
					break;
				}
			}
			
			if(primeTF) {
				list.add(num);
			}
 			
			num--;
		}
	}
	
	
	public static void prime(int num) {
		
		int cnt = 0;
		int prev_j = list.size()-1;
		
		for(int i=0; i<list.size(); i++) {
			for(int j=prev_j; j>=i; j--) {
				if(list.get(i)+list.get(j) == num) {
					cnt++;
				} else if(list.get(i)+list.get(j) > num) {
					prev_j = j;
					break;
				}
			}
		}
		sb.append(cnt).append("\n");
	}
}