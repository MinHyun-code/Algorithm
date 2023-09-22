import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] A = bf.readLine().split(" ");
		
		Long result;
		
		result = Long.parseLong(A[0]) - Long.parseLong(A[1]);
		
		if(result < 0) {
			result *= -1;
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
