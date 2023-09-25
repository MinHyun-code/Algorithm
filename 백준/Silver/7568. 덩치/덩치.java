import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(bf.readLine());

		List<Integer> height = new ArrayList<Integer>();
		List<Integer> weight = new ArrayList<Integer>();
		
		String result = "";
		
		// list 정렬
		for(int i=0; i<input; i++) {
			String[] str = bf.readLine().split(" ");
			height.add(Integer.parseInt(str[0]));
			weight.add(Integer.parseInt(str[1]));
		}
		
		for(int i=0; i<height.size(); i++) {

			// 등수
			int rank = input;
			// 동일한 등수
			int sameRank = -1;
			
			for(int j=0; j<height.size(); j++) {
				// 키가 클 경우
				if(height.get(i) >= height.get(j)) {
					if(weight.get(i) > weight.get(j)) {
						rank--;
					} else {
						sameRank++;
					}
					
				} 
				// 몸무게가 많이 나갈 경우
				else if(weight.get(i) >= weight.get(j)) {
					if(height.get(i) > height.get(j)) {
						rank--;
					} else {
						sameRank++;
					}
				}
			}
			if(i == height.size()-1) {
				result += String.valueOf(rank - sameRank);
			} else {
				result += String.valueOf(rank - sameRank) + " ";
			}
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}
}
