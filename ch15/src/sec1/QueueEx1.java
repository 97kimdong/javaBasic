package sec1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(20);
		que.add(30);
		que.offer(40);
		que.offer(50);
		System.out.println("큐의 처음의 값 : "+que.peek());
		System.out.println("큐의 사이즈 : "+que.size());
		que.remove();
		System.out.println("삭제 후 큐의 처음의 값 : "+que.peek());
		System.out.println("큐의 사이즈 : "+que.size());
		que.poll();
		System.out.println("삭제 후 큐의 처음의 값 : "+que.peek());
		System.out.println("큐의 사이즈 : "+que.size());
		que.clear();
		System.out.println("모두 삭제 후 큐의 처음의 값 : "+que.peek());
		System.out.println("큐의 사이즈 : "+que.size());
	}
}
