import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		
		Set<String> list = new HashSet<String>();
		
		int result = 0;
		
		while(N-->0) {
			String str = br.readLine();
			
			if(str.equals("ENTER")) {
				list.clear();
			} else {
				if(!list.contains(str)) {
					list.add(str);
					result++;
				}
			}
		}
		System.out.println(result);
	}
}