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
		
		int M = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> arrM = new HashMap<Integer, Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			int num1 = Integer.parseInt(st.nextToken());
			if(!arrM.containsKey(num1)) {
				arrM.put(num1, 1);
			}
		}
		
		int N = Integer.parseInt(br.readLine());
		int[] arrN = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			int num2 = Integer.parseInt(st.nextToken());
			int tf = 1;
			if(!arrM.containsKey(num2)) {
				tf = 0;
			}
			sb.append(tf + " ");
		}
		
		System.out.println(sb);
 	}
}
