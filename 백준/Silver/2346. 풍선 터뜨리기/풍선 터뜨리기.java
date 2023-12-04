import java.util.*;

class Balloon_2346 {
	int index; // 풍선 번호
	int value; // 적혀있는 값
	
	public Balloon_2346(int index, int value) {
		this.index=index;
		this.value=value;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Deque<Balloon_2346> dq=new ArrayDeque<>();
		StringBuilder sb=new StringBuilder();
		
		// 풍선의 번호를 늘려가며 적혀있는 번호 저장
		for(int i=1;i<=n;i++) {
			int value=sc.nextInt();
			dq.add(new Balloon_2346(i,value));
		}
			
		while(!dq.isEmpty()) {
			// 덱의 제일 앞에있는 풍선의 번호를 저장
			sb.append(dq.getFirst().index+" ");
			
			// 제일 앞에있는 풍선을 꺼낸 후, 적혀있는 값 저장
			int next=dq.poll().value; 
			
			// 남아있는 풍선이 없다면 종료
			if(dq.isEmpty())
				break;
			
			// 적혀있는 값이 양수인 경우
			if(next>0) {
				for(int i=0;i<next-1;i++)
					dq.addLast(dq.pollFirst());
			}
			// 적혀있는 값이 음수인 경우
			else {
				for(int i=0;i<Math.abs(next);i++)
					dq.addFirst(dq.pollLast());
			}
		}
		
		System.out.println(sb);
	}

}