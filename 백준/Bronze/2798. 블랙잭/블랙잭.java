import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(bf.readLine());
		
		int cnt = Integer.parseInt(st.nextToken());
		int result = Integer.parseInt(st.nextToken());

		int sum = 0;
		
		int[] card = new int[cnt];
		
		st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<card.length; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<card.length; i++) {
			for(int j=0; j<card.length; j++) {
				for(int z=0; z<card.length; z++) {
					if(i!=j && i!=z && j!=z) {
						if((card[i] + card[j] + card[z] <= result) && (sum < card[i] + card[j] + card[z])) {
							sum = card[i] + card[j] + card[z];
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}