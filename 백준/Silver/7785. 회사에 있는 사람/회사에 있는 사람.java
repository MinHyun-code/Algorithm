import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<String, String>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String done = st.nextToken();
			
			map.put(name, done);
		}
		
		List<String> list = new ArrayList<String>();
		
		for(String key : map.keySet()) {
			if(map.get(key).equals("enter")) {
				list.add(key);
			}
		}
		
		list.sort(Comparator.reverseOrder());
		
		for(String key : list) {
			sb.append(key).append("\n");
		}
		
		System.out.println(sb);
	}
}