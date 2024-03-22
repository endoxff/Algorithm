import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Queue {
	int[] que;
	int capacity;
	int front;
	int rear;
	int num;
	
	Queue(int maxlen) {
		front = rear = num = 0;
		capacity = maxlen;
		try {
			que = new int[maxlen];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	int enque(int x) {
		if (num >= capacity) {
			return -1;
		}
		que[rear++] = x;
		num++;
		if (rear == capacity) {
			rear = 0;
		}
		return x;
	}
	
	int deque() {
		if (num <= 0) {
			return -1;
		}
		int x = que[front++];
		num--;
		if (front == capacity) {
			front = 0;
		}
		return x;
	}
	
	int peekFront() {
		if (num <= 0) {
			return -1;
		}
		return que[front];
	}
	
	int peekBack() {
		if (num <= 0) {
			return -1;
		}
		return que[rear - 1];
	}
	
	int size() {
		return num;
	}
	
	int isEmpty() {
		if (num <= 0) {
			return 1;
		}
		return 0;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Queue que = new Queue(10000);

		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if (st.hasMoreTokens()) {
				que.enque(Integer.parseInt(st.nextToken()));
			}
			
			switch(command) {
				case "pop":
					sb.append(que.deque()).append("\n");
					break;
				case "size":
					sb.append(que.size()).append("\n");
					break;
				case "empty":
					sb.append(que.isEmpty()).append("\n");
					break;
				case "front":
					sb.append(que.peekFront()).append("\n");
					break;
				case "back":
					sb.append(que.peekBack()).append("\n");
					break;
			}
		}
		
		System.out.println(sb);
	}

}
