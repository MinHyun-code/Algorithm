import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N, M;
	
	public static void main(String[] args) throws IOException{

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		List<Integer> troubleBtn = new ArrayList<Integer>();
		
		if(M != 0) {
			st = new StringTokenizer(br.readLine());
		}
		
		
		for(int i=0; i<M; i++) {
			troubleBtn.add(Integer.parseInt(st.nextToken()));
		}
		
		int ans = Math.abs(100-N);
		
		int mini = 987654321;
		int cnt = 0;
		
		for(int i=0; i<=999999; i++) {
			
			String str = String.valueOf(i);
			boolean chk = true;
			
			for(int k=0; k<str.length(); k++) {
				if(troubleBtn.contains(str.charAt(k) - '0')) {
					chk = false;
					break;
				}
			}
			
			if(chk == false) {
				continue;
			}
			
			cnt = str.length() + Math.abs(i-N);
			
			if(cnt < mini) {
				mini = cnt;
			}
		}
		
		if(mini < ans) {
			ans = mini;
		}
		
		System.out.println(ans);
	}
}