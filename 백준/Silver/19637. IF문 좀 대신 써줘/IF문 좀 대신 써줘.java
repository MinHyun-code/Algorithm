import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	static int N;
	static int M;

	static String[] arrN;
	static int[] arrNScore;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arrN = new String[N+1];
		arrNScore = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			arrN[i] = st.nextToken();
			arrNScore[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=M; i++) {
			int score = Integer.parseInt(br.readLine());
			
			if(score <= arrNScore[1]) {
				sb.append(arrN[1]).append("\n");
			} else if(score >= arrNScore[N]) {
				sb.append(arrN[N]).append("\n");
			} else {
				sb.append(arrN[binarySearch(score, 0, N)]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	public static int binarySearch(int key, int low, int high) {
		
		while(low <= high) {
			int mid = (low + high)/2;
			if(key > arrNScore[mid-1] && key <= arrNScore[mid]) {
				return mid;
			} else if(key <= arrNScore[mid-1]){
				high = mid-1;
			} else if(key > arrNScore[mid]) {
				low = mid+1;
			}
		} 
		return -1;
	}
}