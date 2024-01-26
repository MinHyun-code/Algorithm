import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());	// 선택할 수 있는 거리
		
		char[] arr = new char[N];
		
		String str = br.readLine();
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = str.charAt(i);
		}
		
		for(int i=0; i<N; i++) {
			boolean tf = false;
			if(arr[i] == 'P') {
				for(int j=K; j>=1; j--) {
					if(i-j >= 0 && arr[i-j] == 'H') {
						arr[i-j] = 'E';
						count++;
						tf = true;
						break;
					}
				}
				if(!tf) {
					for(int j=1; j<=K; j++) {
						if(i+j < N && arr[i+j] == 'H') {
							arr[i+j] = 'E';
							count++;
							break;
						}
					}
				}
			}
		}
		
		System.out.println(count);
	}
}