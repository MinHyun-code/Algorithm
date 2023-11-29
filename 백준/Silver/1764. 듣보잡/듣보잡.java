import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		st = new StringTokenizer(br.readLine());
	
		// 듣지못한 인원
		int N = Integer.parseInt(st.nextToken());
		// 보지못한 인원
		int M = Integer.parseInt(st.nextToken());
		
		// 듣지못한 인원 셋팅
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			map.put(str, i);
		}
		
		int cnt = 0;
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			
			if(map.containsKey(str)) {
				cnt++;
				list.add(str);
			}
		}
		
		list.sort(Comparator.naturalOrder());
		System.out.println(cnt);
		
		for(String a : list) {
			sb.append(a).append("\n");
		}
		System.out.println(sb);
	}
}