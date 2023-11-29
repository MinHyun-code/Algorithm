import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		
		int numA = Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());

		List<Integer> listA = new ArrayList<Integer>();
		Map<Integer, Integer> mapA = new HashMap<Integer, Integer>();
		List<Integer> listB = new ArrayList<Integer>();
		Map<Integer, Integer> mapB = new HashMap<Integer, Integer>();

		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=numA; i++) {
			int value = Integer.parseInt(st.nextToken());
			listA.add(value);
			mapA.put(value, i);
		}

		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=numB; i++) {
			int value = Integer.parseInt(st.nextToken());
			listB.add(value);
			mapB.put(value, i);
		}
		
		int cntA = 0;
		
		for(int num : listA) {
			if(!mapB.containsKey(num)) {
				cntA++;
			}
		}
		
		int cntB = 0;
		for(int num : listB) {
			if(!mapA.containsKey(num)) {
				cntB++;
			}
		}
		
		System.out.println(cntA+cntB);
		
	}
}

