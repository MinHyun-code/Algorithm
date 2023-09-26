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
		int count = 0;
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<input; i++) {
			int num = Integer.parseInt(bf.readLine());
			if(num == 0) {
				arr.remove(count-1);
				count--;
			} else {
				count++;
				arr.add(num);
			}
		}
		
		int result = 0;
		
		for(int i=0; i<arr.size(); i++) {
			result += arr.get(i);
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
	}
}