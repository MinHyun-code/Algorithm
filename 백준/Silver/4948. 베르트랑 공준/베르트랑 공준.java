import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		while(true) {
			int num = Integer.parseInt(br.readLine());
			// 0 = 마지막
			if(num == 0) {
				break;
			}
			
			int prime = prime(num);
			sb.append(prime).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static int prime(int num) {
		
		// 소수의 개수
		int cnt = 0;
		for(int i=num+1; i<=num*2; i++) {
			int tempCnt = 0;
			
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {
					tempCnt++;
				}
				
				if(tempCnt > 1) {
					break;
				}
			}

//			0, 1은 소수가 아니라서 제외
			if(tempCnt == 0 && i>=2) {
				cnt++;
			}
		}
		
		return cnt;
	}
}
