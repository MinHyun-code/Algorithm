import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String A = bf.readLine();
		// 알파벳 배열
		int[] temp = new int[26];
		
		// 초기 값 -1로 세팅
		for(int i=0; i<temp.length; i++) {
			temp[i] = -1;
		}
		
		for(int i=0; i<A.length(); i++) {
			// 초기 값일 경우만 변경 (중복 값 변경 X)
			if(temp[A.charAt(i) - 97] == -1) {
				temp[A.charAt(i) - 97] = i;
			}
		}
		
		String result = "";
		
		for(int i=0; i<temp.length; i++) {
			result += temp[i] + " ";
		}
		
		System.out.println(result);
		
		bw.flush();
		bw.close();
	}
}
