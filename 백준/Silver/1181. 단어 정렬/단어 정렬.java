import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(bf.readLine());
	
		// set으로 중복 제거
		Set<String> set = new HashSet<String>();
	
		for(int i=0; i<input; i++) {
			String temp = bf.readLine();
			set.add(temp);
		}
		
		List<String> list = new ArrayList<>(set);
		
		// 정렬
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				// 길이가 짧은 데이터 앞으로
				if(list.get(j).length() < list.get(i).length()) {
					String A = list.get(j);
					list.remove(list.get(j));
					list.add(i, A);
				}	
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}