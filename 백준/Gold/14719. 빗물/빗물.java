import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int H, W;
	
	static int sum = 0;
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
	
		st = new StringTokenizer(br.readLine());

		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		
		arr = new int[W];
		
		st = new StringTokenizer(br.readLine());

		for(int i=0; i<W; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<W-1; i++) {

			int leftMax = 0;
			int rightMax = 0;
			
			for(int j=0; j<i; j++) {
				leftMax = Math.max(arr[j], leftMax);
			}
			
			for(int j=i+1; j<W; j++) {
				rightMax = Math.max(arr[j], rightMax);
			}
			
			if(arr[i] < leftMax && arr[i] < rightMax) {
				sum += Math.min(leftMax, rightMax) - arr[i];
			}
		}
	
		System.out.println(sum);
	}
}