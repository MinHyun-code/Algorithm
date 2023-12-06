import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static boolean[] arr;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		String str;
		
        while ((str = br.readLine()) != null) {          
        	int N = Integer.parseInt(str);  
        	
        	int size = 1;
        	for(int i=0; i<N; i++) {
        		size *= 3;
        	}
        	arr = new boolean[size];
        	
        	Cantor(0, size);

        	for(int i=0; i<arr.length; i++) {
        		if(arr[i] == false) {
        			sb.append("-");
        		} else {
        			sb.append(" ");
        		}
        	}
        	sb.append("\n");
        }
        
        
        System.out.println(sb);
	}
	
	/*
	 * 배열 중간만 바꾸면 됨
	 */
	
	static void Cantor(int start, int size) {

		if(size == 1) {
			return;
		}

		// 바뀔 size 임시 데이터
		int temp = size/3;
		
		
		for(int i=start+temp; i<start+temp*2; i++) {
			arr[i] = !arr[i];
		}

		Cantor(start, temp);
		Cantor(start+temp*2, temp);
	}
}