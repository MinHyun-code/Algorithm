import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


// 9017
public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {

			Map<String, Integer> map = new HashMap<String, Integer>(); 		// 팀 인원
			Map<String, Integer> scoreMap = new HashMap<String, Integer>(); // 팀별 점수 합산
			
			int N = Integer.parseInt(br.readLine());
			
			int[] arr = new int[N];					// 입력 값 임시 배열
			int[] tempArr = new int[201];			// 4등까지만 합산이므로, 몇등까지 합산한지 저장한 배열 (200팀까지 있음)
			int[] fiveLocation = new int[201];		// 5등 위치
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<N; i++) {
				String temp = st.nextToken();
					
				arr[i] = Integer.parseInt(temp);
				
				if(map.containsKey(temp)) {
					map.put(temp, map.get(temp)+1);
				}
				else {
					map.put(temp, 1);
				}
			}
			
			int score = 1;
			
			for(int i=0; i<N; i++) {
				int team = arr[i];
				
				// 팀 인원이 6명인 곳만
				if(map.get(String.valueOf(team)) == 6) {
					tempArr[team]++;
					
					// 4등까지만 합산
					if(tempArr[team] <= 4) {
						if(scoreMap.containsKey(String.valueOf(team))) {
							scoreMap.put(String.valueOf(team), scoreMap.get(String.valueOf(team))+score);
						}
						else {
							scoreMap.put(String.valueOf(team), score);
						}
					} else if(tempArr[team] == 5) {
						fiveLocation[team] = i;
					}
					
					score++;
				}
			}
			
//			System.out.println(map);
//			System.out.println(scoreMap);
//			System.out.println(Arrays.toString(tempArr));
//			System.out.println(Arrays.toString(fiveLocation));
			
			int minScore = 2000000000;
			String minScoreTeam = "";
			boolean dupleYn = false;	// 중복 여부
			String dupleTeam = "";
			
			for(String team : scoreMap.keySet()) {
				if(minScore > scoreMap.get(team)) {
					minScoreTeam = team;
					minScore = scoreMap.get(team);
					dupleYn = false;
				}
				else {
					if(minScore == scoreMap.get(team)) {
						if(fiveLocation[Integer.parseInt(minScoreTeam)] > fiveLocation[Integer.parseInt(team)]) {
							dupleYn = true;
							dupleTeam = team;
						}
					}
				}
			}
			
			if(dupleYn) {
				sb.append(dupleTeam).append("\n");
			} else {
				sb.append(minScoreTeam).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}