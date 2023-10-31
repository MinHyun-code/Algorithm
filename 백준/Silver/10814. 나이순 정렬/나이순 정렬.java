import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		int count = Integer.parseInt(br.readLine());
	
		String[][] arr = new String[count][2];
		
		for(int i=0; i<count; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			String age = st.nextToken();
			String name = st.nextToken();

			arr[i][0] = age;
			arr[i][1] = name;
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
			
		});

		for(int i=0; i<count; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
			
		}
	}
}