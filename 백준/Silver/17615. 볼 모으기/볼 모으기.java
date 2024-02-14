import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static char[] arr;
	static int count = 500000;
	static int cntR = 0;
	static int cntB = 0;
	
	public static void main(String[] args) throws IOException{
	
		N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		arr = new char[N];
		
		char temp = 0;
		int changeCnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			if(arr[i] == 'R') {
				cntR++;
			}
			else {
				cntB++;
			}
			
			if(temp != arr[i]) {
				temp = arr[i];
				changeCnt++;
			}
		}
		
		if(changeCnt > 2) {
			moveFirst();
			moveLast();
		}
		else {
			count = 0;
		}
	
		System.out.println(count);
	}

	// 처음으로 옮길 경우
	private static void moveFirst() {
		
		char first = arr[0];
		
		// 처음과 다른 값을 옮길 경우
		if(first == 'R') {
			if(cntB < count) {
				count = cntB;
			}
		} else {
			if(cntR < count) {
				count = cntR;
			}
		}
		
		// 처음과 같은 값을 옮길 경우
		int tempCnt = 0;
		int temp = 0;
		

		for(int i=0; i<arr.length; i++) {
			if(arr[i] != first) {
				temp = i;
				break;
			}
		}
		
		for(int i=temp; i<arr.length; i++) {
			if(arr[i] == first) {
				tempCnt++;
			}
		}
		
		if(tempCnt < count && tempCnt != 0) {
			count = tempCnt;
		}
	}

	// 끝으로 옮길 경우
	private static void moveLast() {
		
		char last = arr[arr.length-1];

		// 마지막과 다른 값을 옮길 경우
		if(last == 'R') {
			if(cntB < count) {
				count = cntB;
			}
		} else {
			if(cntR < count) {
				count = cntR;
			}
		}
		
		
		// 마지막과 같은 값을 옮길 경우
		int temp = 0;
		int tempCnt = 0;
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] != last) {
				temp = i;
				break;
			}
		}
		
		for(int i=0; i<=temp; i++) {
			if(arr[i] == last) {
				tempCnt++;
			}
		}
		
		if(tempCnt < count && tempCnt != 0) {
			count = tempCnt;
		}
	}
}