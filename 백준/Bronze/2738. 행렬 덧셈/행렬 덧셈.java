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
		int A0 = Integer.parseInt(A[0]);
		int A1 = Integer.parseInt(A[1]);
		
		// 2차원 배열 세팅
		int[][] setB = new int[A0][A1];
		int[][] setC = new int[A0][A1];
		
		for(int z=0; z<2; z++) {
			for(int i=0; i<A0; i++) {
				String[] temp = bf.readLine().split(" ");
				for(int j=0; j<A1; j++) {
					if(z==0) {
					setB[i][j] = Integer.parseInt(temp[j]);
					} else {
						setC[i][j] = Integer.parseInt(temp[j]);
					}
				}
			}
		}
		
		for(int i=0; i<A0; i++) {
			if(i != 0) {
				bw.write("\n");
			}
			for(int j=0; j<A1; j++) {
				bw.write(setB[i][j]+setC[i][j] + " ");
			}
		}
				
		bw.flush();
		bw.close();
	}
}