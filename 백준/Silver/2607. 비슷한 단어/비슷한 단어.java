import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static int[] firstArr = new int[26];	// 비교 기준이 될 첫 번째 단어 (알파벳 26자)
	static int firstSize = 0;
	static int[] tempArr;					// 비교 대상 (알파벳 26자)
	static int tempSize;
	
	static int count = 0;	// 비슷한 단어의 개수
	
	public static void main(String[] args) throws IOException{
		
		N = Integer.parseInt(br.readLine());
		
		String first = br.readLine();
		for(int i=0; i<first.length(); i++) {
			firstSize++;
			firstArr[first.charAt(i)-65]++;
		}
		
		while(N-->1) {
			
			String str = br.readLine();

			tempArr = new int[26];
			tempSize = 0;
			
			for(int i=0; i<str.length(); i++) {
				tempSize++;
				tempArr[str.charAt(i)-65]++;
			}
			
			sameCheck();
		}

		System.out.println(count);
	}
	
	public static void sameCheck() {
		
		boolean sameTF = true;
		int falseCnt = 0;
		
		if(Math.abs(firstSize - tempSize) > 1) {
			return;
		}
		
		for(int i=0; i<26; i++) {
			if(tempArr[i] != firstArr[i]) {
				falseCnt += Math.abs(tempArr[i] - firstArr[i]);
				
				// 3개 이상 차이날 경우 비슷 X
				// 2개 차이날 때, 문자의 개수가 같으면 통과
				if(falseCnt > 2) {
					sameTF = false;
					break;
				}
			}
		}
		
		// 비슷한 경우 +1
		if(sameTF) {
			count++;
		}
		
	}
}