import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N+1][N+1];
		
		// 머리 위치
		int headX = 0;
		int headY = 0;
		
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			
			for(int j=1; j<=N; j++) {
				arr[i][j] = str.substring(j-1, j);
				
				if(arr[i][j].equals("*") && headX == 0 && headY == 0) {
					headX = i;
					headY = j;
				}
			}
		}

		// 허리 위치
		int waistX = headX+1;
		int waistY = headY;

		int waistLength = 0;
		
		for(int i=waistX+1; i<=N; i++) {
			if(arr[i][waistY].equals("*")) {
				waistLength++;
			}
			else {
				break;
			}
		}
		
		// 팔 길이
		int leftArm = 0;
		int rightArm = 0;
		
		for(int i=waistY-1; i>=1; i--) {
			if(arr[waistX][i].equals("*")) {
				leftArm++;
			} 
			else {
				break;
			}
		}
		
		for(int i=waistY+1; i<=N; i++) {
			if(arr[waistX][i].equals("*")) {
				rightArm++;
			} 
			else {
				break;
			}
		}
		
		// 다리 길이
		int leftLeg = 0;
		int rightLeg = 0;
		
		for(int i=waistX+waistLength+1; i<=N; i++) {
			if(arr[i][waistY-1].equals("*")) {
				leftLeg++;
			}
			else {
				break;
			}
		}
		
		for(int i=waistX+waistLength+1; i<=N; i++) {
			if(arr[i][waistY+1].equals("*")) {
				rightLeg++;
			}
			else {
				break;
			}
		}
		
		sb.append(waistX).append(" ").append(waistY).append("\n");
		sb.append(leftArm).append(" ").append(rightArm).append(" ").append(waistLength).append(" ").append(leftLeg).append(" ").append(rightLeg);
		
		System.out.println(sb);
	}
}