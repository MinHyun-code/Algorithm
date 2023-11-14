import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int cnt = 20;
		
		Double Sum = 0.0;
		Double scoreSum = 0.0;
		
		while(cnt>0) {
			
			st = new StringTokenizer(br.readLine());

			String subject = st.nextToken();
			Double score = Double.parseDouble(st.nextToken());
			String credit = st.nextToken();
			Double exchange = 1.0;
			
			if(credit.equals("A+")) {
				exchange = 4.5;
			} else if(credit.equals("A0")) {
				exchange = 4.0;
			} else if(credit.equals("B+")) {
				exchange = 3.5;
			} else if(credit.equals("B0")) {
				exchange = 3.0;
			} else if(credit.equals("C+")) {
				exchange = 2.5;
			} else if(credit.equals("C0")) {
				exchange = 2.0;
			} else if(credit.equals("D+")) {
				exchange = 1.5;
			} else if(credit.equals("D0")) {
				exchange = 1.0;
			} else if(credit.equals("F")) {
				exchange = 0.0;
			} else if(credit.equals("P")) {
				cnt--;
				continue;
			}
			
			Sum += score * exchange;
			scoreSum += score;
			
			cnt--;
		}
		
		double result = Math.round(Sum/scoreSum*1000000)/1000000.0;
		System.out.println(result);
	}
}