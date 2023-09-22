import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<testCase; i++) {
			String result = "";
			String[] temp = bf.readLine().split(" ");
			int floor = Integer.parseInt(temp[2]) % Integer.parseInt(temp[0]);
			int room = Integer.parseInt(temp[2]) / Integer.parseInt(temp[0]);
			if(floor == 0) {
				floor = Integer.parseInt(temp[0]);
			} else {
				room++;
			}
			
			if(room < 10) {
				result = floor+"0"+room;
			} else {
				result = String.valueOf(floor)+String.valueOf(room);
			}
			bw.write(result + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}