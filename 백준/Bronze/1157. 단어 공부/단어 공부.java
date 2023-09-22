import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String A = bf.readLine().toUpperCase();
		
		// 아스키 코드 count
		int[] asc = new int[127];
		
		for(int i=0; i<A.length(); i++) {
			asc[A.charAt(i)]++;
		}
		
		// 가장 많이 나온 아스키 코드의 count 
		int max = 0;
		
		// max 값 중복 여부
		boolean maxDupl = false;
		
		// 가장 많이 나온 아스키 코드 
		int maxNum = 0;
		
		for(int i=0; i<asc.length; i++) {
			if(max == asc[i]) {
				maxDupl = true;
			}
			
			if(max < asc[i]) {
				max = asc[i];
				maxNum = i;
				maxDupl = false;
			}
		}
		
		if(maxDupl == true) {
			bw.write("?");
		} else {
			bw.write(maxNum);
		}
		
		
		bw.flush();
		bw.close();
	}
}