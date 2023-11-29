import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];		
		int[] sorted = new int[N];
		HashMap<Integer, Integer> ranking = new HashMap<Integer, Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		// 배열에 값 대입
		for(int i=0; i<N; i++) {
			arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);
		
		int rank = 0;
		
		for(int v : sorted) {
			
			if(!ranking.containsKey(v)) {
				ranking.put(v, rank);
				rank++;
			}
		}
		
		for(int key : arr) {
			sb.append(ranking.get(key)+" ");
		}
		System.out.println(sb);
	}
}