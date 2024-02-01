import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int p;
	static int m;
	
	static int[] arrl;
	static String[] arrn;
	
	static int[][] roomScore;
	static int[] roomCnt = new int[301];
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		
		p = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arrl = new int[p+1];
		arrn = new String[p+1];
		
		roomScore = new int[301][m+1];
		
		for(int i=1; i<=p; i++) {
			st = new StringTokenizer(br.readLine());

			arrl[i] = Integer.parseInt(st.nextToken());
			arrn[i] = st.nextToken();
			
			room(arrl[i], i);
		}
		

		int index = 0;
		while(true) {

			index++;
			
			// 방 기준 점수가 0이면 방이 없다는 뜻
			if(roomScore[index][0] == 0) {
				break;
			}
			
			// 인원이 다 찼다면
			if(roomCnt[index] == m) {
				sb.append("Started!").append("\n");
			}
			
			// 부족하다면
			else {
				sb.append("Waiting!").append("\n");
			}
			
			String[][] tempArr = new String[roomCnt[index]][2];
			
			for(int i=1; i<=roomCnt[index]; i++) {
				tempArr[i-1][0] = String.valueOf(arrl[roomScore[index][i]]);
				tempArr[i-1][1] = arrn[roomScore[index][i]];
			}
			
			// 1. Comparator 익명 클래스 구현 (2번째 숫자 오름차순 정렬)
			Arrays.sort(tempArr, new Comparator<String[]>() {
			    @Override
			    public int compare(String[] o1, String[] o2) {
			        return o1[1].compareTo(o2[1]);
			    }
			});
			
			for(int i=0; i<tempArr.length; i++) {
				sb.append(tempArr[i][0]).append(" ").append(tempArr[i][1]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	public static void room(int score, int i) {
		
		int index = 0;
		
		while(true) {
			index++;
			
			// 방 기준 점수가 0이면 방이 없다는 뜻
			if(roomScore[index][0] == 0) {
				roomScore[index][0] = score;
				roomCnt[index]++;
				roomScore[index][roomCnt[index]] = i;
				
				break;
			}
			
			// 범위 -10, 10
			if(roomScore[index][0] + 10 >= score && roomScore[index][0] - 10 <= score && roomCnt[index] < m) {
				roomCnt[index]++;
				roomScore[index][roomCnt[index]] = i;
				break;
			}
		}
	}
}