import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] B = new int[31];
		
		int min = 30;
		
		for(int j=1; j<31; j++) {
			B[j] = j;
		}
		
		// 28개
		for(int i=0; i<28; i++) {
			int C = Integer.parseInt(bf.readLine());
			// 배열의 값과 일치 여부 (일치하면 0)
			for(int j=1; j<31; j++) {
				if(B[j] == C) {
					B[j] = 0;
				}	
			}
		}
		
		for(int j=1; j<31; j++) {
			if(B[j] != 0) {
				if(min > B[j]) {
					min = j;
				}
			}	
		}
		
		int tempMin = 30;
		
		for(int j=1; j<31; j++) {
			if(B[j] != 0) {
				if(tempMin > B[j] && B[j] > min) {
					tempMin = j;
				}
			}	
		}
		bw.write(min+"\n"+tempMin);
		bw.flush();
		bw.close();
	}
}
