import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		
		String S = br.readLine();
		
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == 'I') {
				list.add(i);	
			}
		}
		
		int count = 0;
		int result = 0;

		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i+1) - list.get(i) == 2) {
				count++;
			} else {
				count = 0;
			}
			
			if(count >= N) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}