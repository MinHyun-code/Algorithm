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
		
		String str = br.readLine();
		int result = 0;
		
		String[] setArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<setArr.length; i++) {
			while(str.contains(setArr[i])){
				str = str.replaceFirst(setArr[i], " ");
				result++;
//				System.out.println(str);
			}
		}
		System.out.println(str.length());
	}
}