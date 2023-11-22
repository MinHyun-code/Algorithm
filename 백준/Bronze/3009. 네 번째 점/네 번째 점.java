import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int[] arrX = new int[3];
		int[] arrY = new int[3];
		
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine());

			arrX[i] = Integer.parseInt(st.nextToken());
			arrY[i] = Integer.parseInt(st.nextToken());
		}
		
//		같은 값을 가진 x
		int x = 0;
		
		
//		같은 값을 가진 y
		int y = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<3; j++) {
				if(arrX[i] == arrX[j]) {
					x = arrX[i];
				}
				if(arrY[i] == arrY[j]) {
					y = arrY[i];
				}
			}
		}
		
		int resultX = 0;
		int resultY = 0;
		
		for(int i=0; i<3; i++) {
			if(arrX[i] != x) {
				resultX = arrX[i];
			}
			
			if(arrY[i] != y) {
				resultY = arrY[i];
			}
		}

		System.out.println(resultX + " " + resultY);
	}
}