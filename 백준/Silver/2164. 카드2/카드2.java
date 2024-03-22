import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	
	int size() {
		return num;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue que = new Queue(n);
		
		for (int i = 1; i <= n; i++) {
			que.enque(i);
		}
		
		while (que.size() != 1) {
			que.deque();
			int x = que.deque();
			que.enque(x);
		}
		
		System.out.println(que.deque());
	}

}
