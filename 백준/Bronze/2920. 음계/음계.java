import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] A = bf.readLine().split(" ");
		String[] B = {"1","2","3","4","5","6","7","8"};
		String[] C = {"8","7","6","5","4","3","2","1"};
		
		if(Arrays.equals(A,B)) {
			bw.write("ascending");
		} else if(Arrays.equals(A,C)){
			bw.write("descending");
		} else {
			bw.write("mixed");
		}
		
		bw.flush();
		bw.close();
	}
}
