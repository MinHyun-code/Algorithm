import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		String str = br.readLine();
		
		// 중복은 안되므로 set으로 설정
		Set<String> set = new HashSet<String>();
		
		String[] arr = new String[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.substring(i, i+1);
		}
		
		// 글자의 갯수
		int cnt = 1;
		
		while(cnt <= str.length()) {
			
			for(int i=0; i<str.length()-cnt+1; i++) {
				set.add(str.substring(i, i+cnt));
			}
			
			cnt++;
		}
		
		System.out.println(set.size());
	}
}