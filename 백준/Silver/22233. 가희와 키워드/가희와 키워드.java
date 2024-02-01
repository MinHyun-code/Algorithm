import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int N;
	static int M;

	static Set<String> arrN = new HashSet<String>();
	static String[] arrM;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());	// 키워드 개수
		M = Integer.parseInt(st.nextToken());	// 글의 개수
		
		int cnt = N;
		
		arrM = new String[M];
		
		for(int i=0; i<N; i++) {
			arrN.add(br.readLine());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), ",");

			while(st.hasMoreTokens()) {
				
				String str = st.nextToken();
				
				if(arrN.contains(str)) {
					arrN.remove(str);
					cnt--;
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}
}