import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());	// 개수
		int W = Integer.parseInt(st.nextToken());	// 행
		int N = Integer.parseInt(st.nextToken());	// 세로
		int M = Integer.parseInt(st.nextToken());	// 가로
		
		int cnt = 0;
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				cnt++;
				j += M;
			}
			i += N;
		}
		
		System.out.println(cnt);
	}
} 

