import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static int result = 0;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		while(num>0) {
			
			String str = br.readLine();
			
			if(check(str) == true) {
				result++;
			}
			num--;
		}
		
		System.out.println(result);
	}
	
	public static boolean check(String str) {
		
		// 알파벳
		boolean[] check = new boolean[26];
		int prev = 0;
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				if(check[now-'a'] == false) {
					check[now-'a'] = true;
					prev = now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}
		
		return true;
	}
}