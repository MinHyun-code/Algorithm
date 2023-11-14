import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());

		// 별 개수
		int star = 1;
		// 공백 개수
		int block = num-1;
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<block; j++) {
				sb.append(" ");
			}
			for(int j=0; j<star; j++) {
				sb.append("*");
			}
			sb.append("\n");
			
			if(i!=num-1) {
				star = star+2;
				block--;
			}
		}
		
		for(int i=0; i<num; i++) {
			block++;
			star = star-2;
			for(int j=0; j<block; j++) {
				sb.append(" ");
			}
			for(int j=0; j<star; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}