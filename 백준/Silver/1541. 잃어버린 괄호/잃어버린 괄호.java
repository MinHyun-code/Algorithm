import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		String str = br.readLine();

		List<Integer> list = new ArrayList<Integer>();

		String temp = "";
		for(int i=0; i<str.length(); i++) {
			String sub = str.substring(i, i+1);
			
			// 숫자인지 확인
			if(isInteger(sub)) {
				temp += sub;
			} else {
				if(!temp.equals("")) {
					list.add(Integer.parseInt(temp));
					temp = sub;
				}
			}
			// 마지막 값 추가
			if(i == str.length()-1) {
				list.add(Integer.parseInt(temp));
			}
		}
		
		int sum = list.get(0);
		
		boolean minusTF = false;
		
		for(int i=1; i<list.size(); i++) {
			
			if(list.get(i) < 0) {
				minusTF = true;
			}
			
			if(minusTF) {
				if(list.get(i) < 0) {
					sum += list.get(i);
				} else {
					sum -= list.get(i);
				}
			}
			else {
				sum += list.get(i);
			}
		}
		System.out.println(sum);
	}
	
	static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
			
		} catch (NumberFormatException e) {
			return false;
		}
	}
}