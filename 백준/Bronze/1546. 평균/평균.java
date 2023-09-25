import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(bf.readLine());

		String[] str = bf.readLine().split(" ");
		
		double max = 0;
		double result = 0;
		
		// 최대 값 
		for(int i=0; i<str.length; i++) {
			if(max < Double.parseDouble(str[i])) {
				max = Double.parseDouble(str[i]);
			}
		}
	
		for(int i=0; i<str.length; i++) {
			result += (Double.parseDouble(str[i])/max) * 100;
		}
		
		bw.write(String.valueOf(result/input));
		
		bw.flush();
		bw.close();
	}
}