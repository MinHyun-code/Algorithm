import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String game = st.nextToken();
		
		/*
		 *  중복 제거 후 
		 *  필요한 사람으로 나눈 몫
		 */
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<N; i++) {
			String temp = br.readLine();
			
			set.add(temp);
		}
		
		int result = 0;
		
		if(game.equals("Y")) {
			result = set.size();
		} 
		else if(game.equals("F")) {
			result = set.size()/2;
		}
		else {
			result = set.size()/3;
		}
		
		System.out.println(result);
	}
}