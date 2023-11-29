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
	
		st = new StringTokenizer(br.readLine());
		
		// 도감 개수
		int N = Integer.parseInt(st.nextToken());
		// 맞춰야하는 개수
		int M = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[N+1];
		
		// 도감에 저장된 리스트
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=1; i<=N; i++) {
			String line = br.readLine();
			map.put(line, i);
			arr[i] = line;
			
		}

		for(int i=0; i<M; i++) {
			
			String str = br.readLine();
			
			if(numYn(str)) {
				sb.append(arr[Integer.parseInt(str)]).append("\n");
			} else {
				sb.append(map.get(str)).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	public static boolean numYn(String str) {
		try {
			Double.parseDouble(str);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}
}