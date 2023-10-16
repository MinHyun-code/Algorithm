import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String str = bf.readLine();
		st = new StringTokenizer(str);

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());
		
		int day = 0;
		
		int temp1 = num3 - num1;
		int temp2 = num1 - num2;
		
		day = (temp1) / (temp2) + 1;

		if(temp1 % temp2 != 0) day++;
		
		System.out.println(day);
	}
}