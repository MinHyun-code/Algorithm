import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		SortedMap<String, Integer> map = new TreeMap<String, Integer>();
		
		while(N-->0) {
			
			String word = br.readLine();
			
			if(word.length() >= M) {
				if(map.containsKey(word)) {
					map.put(word, map.get(word)+1);
				} else {
					map.put(word, 1);
				}
			}
		}
		
        List<String> words = new ArrayList<>(map.keySet());
        
        Collections.sort(words, new Comparator<String>() {
        	
        	@Override
        	public int compare(String o1, String o2) {
        		
        		// 자주 등장하는 단어 순서대로 정렬
        		if(Integer.compare(map.get(o1), map.get(o2)) != 0) {
        			return Integer.compare(map.get(o2), map.get(o1));
        		}
        		
        		// 등장 횟수가 같으면 길이가 긴 단어 순서대로 정렬
        		if(o1.length() != o2.length()) {
        			return o2.length() - o1.length();
        		}
        		
        		// 등장 횟수 및 길이가 같으면 사전 순으로 정렬
        		return o1.compareTo(o2);
        	}
		});
        
        for (String str : words) {
            sb.append(str + "\n");
        }
        
        System.out.println(sb);
	}
}