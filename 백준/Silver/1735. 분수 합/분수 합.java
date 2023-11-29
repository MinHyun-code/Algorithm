import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		st = new StringTokenizer(br.readLine());
		int childA = Integer.parseInt(st.nextToken());
		int parentA = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int childB = Integer.parseInt(st.nextToken());
		int parentB = Integer.parseInt(st.nextToken());
	
	/*	
	 * 		1. parentA 와 parentB의 최대 공약수를 찾는다.
	 * 		2. 최소 공배수 = 최대공약수 * (A분모를 최대공약수로 나눈 값) * (B분모를 최대공약수로 나눈 값)
	 * 		3. 최소 공배수로 통분해준다.
	 * 		4. 분모에 곱한 값을 분자에도 곱해준다.
	 * 		5. 합산 후 최대공약수로 약분해준다.
	 */		
		
		int parentGCD = getGCD(parentA, parentB);
		int parentLCM = parentGCD * (parentA/parentGCD) * (parentB/parentGCD);
		
		childA = childA*(parentLCM/parentA);
		childB = childB*(parentLCM/parentB);

		int parentChildGCD = getGCD(parentLCM, childA+childB);
		
		sb.append((childA+childB)/parentChildGCD).append(" ").append(parentLCM/parentChildGCD);
		
		System.out.println(sb);
	}
	
	public static int getGCD(int num1, int num2) {
		
		if(num1 % num2 == 0) {
			return num2;
		}
		
		return getGCD(num2, num1%num2);
	}
}