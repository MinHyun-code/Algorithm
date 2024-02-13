import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Path {
	int start;
	int end;
	int dist;
	
	public Path(int start, int end, int dist) {
		this.start = start;
		this.end = end;
		this.dist = dist;
	}
}

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N, D;
	static List<Path> list = new ArrayList<Path>();
	static boolean[] check;
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());

			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());

			if(D >= start && D >= end) {
				list.add(new Path(start, end, dist));
			}
		}
		
		check = new boolean[list.size()];
		
		dfs(0, D, 0);
		
		System.out.println(result);
	}
	
	private static void dfs(int now, int end, int dist) {
		
		if(now > end) {
			return;
		}
		
		else if(now == end) {
			result = Math.min(result, dist);
			return;
		}
		
		else {
			result = Math.min(result, dist+(end-now));
		}
		
		for(int i=0; i<list.size(); i++) {
			if(!check[i]) {
				Path path = list.get(i);
				
				if(path.start == now) {
					check[i] = true;
					dfs(path.end, D, dist + path.dist);
					check[i] = false;
				}
			}
		}
		dfs(now+1, D, dist+1);
	}
}