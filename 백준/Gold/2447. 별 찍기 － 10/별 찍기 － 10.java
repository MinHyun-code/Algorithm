import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int k;
	static String[][] arr;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		N = Integer.parseInt(br.readLine());
		
		arr = new String[N][N];
		
		int t = N;
		
		while(true) {
			t = t/3;
			
			k++;
			
			if(t == 1) {
				break;
			}
		}
		
		star(0, 0, N, false);
		
		for(int i=0; i<N; i++) {
			if(i!=0) {
				sb.append("\n");
			}
			for(int j=0; j<N; j++) {
				sb.append(arr[i][j]);
			}
		}
		
		System.out.println(sb);
	}
	
	static void star(int x, int y, int size, boolean blankYN) {
		
		// 공백일 경우
		if(blankYN) {
			for(int i=x; i<x+size; i++) {
				for(int j=y; j<y+size; j++) {
					arr[i][j] = " ";
				}
			}
			
			return;
		}
		
		// 길이가 1일 경우 종료
		if(size == 1) {
			arr[x][y] = "*";
			return;
		}
		
		int resize = size/3;
		int count = 0;
		
		for(int i=x; i<x+size; i+=resize) {
			for(int j=y; j<y+size; j+=resize) {
				count++;
				
				if(count == 5) {
					star(i,j,resize,true);
				}
				else {
					star(i,j,resize,false);
				}
			}
		}
		
		
	}
}