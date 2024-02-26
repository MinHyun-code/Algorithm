import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {

	int index;
	int weight;
	
	public Node(int index, int weight) {
		this.index = index;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Node o) {
		return Integer.compare(this.weight, o.weight);
	}
}

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int N, M;
	static List<List<Node>> graph = new ArrayList<List<Node>>();
	
	public static void main(String[] args) throws IOException{
	
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		for(int i=0; i<N; i++) {
			graph.add(new ArrayList<Node>());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());

			int start = Integer.parseInt(st.nextToken())-1;
			int end = Integer.parseInt(st.nextToken())-1;
			int weight = Integer.parseInt(st.nextToken());
			
			graph.get(start).add(new Node(end, weight));
			graph.get(end).add(new Node(start, weight));
		}
		
		Dijkstra(0);
	}
	
	private static void Dijkstra(int index) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		int[] distance = new int[N];
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		
		distance[index] = 0;
		pq.offer(new Node(index, 0));
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int nodeIndex = node.index;
			int weight = node.weight;
		
		/* 
		 * 큐는 최단거리 기준 오름차순 정렬 
		 */
		
			if(weight > distance[nodeIndex]) {
				continue;
			}
			
			for(Node linkedNode : graph.get(nodeIndex)) {
				if(weight + linkedNode.weight < distance[linkedNode.index]) {
					
					distance[linkedNode.index] = weight + linkedNode.weight;
					
					pq.offer(new Node(linkedNode.index, distance[linkedNode.index]));
				}
			}
		}
		
		System.out.println(distance[N-1]);
	}
}