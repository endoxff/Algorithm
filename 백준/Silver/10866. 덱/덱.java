import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Deque {
	int[] deq;
	int capacity;
	int front;
	int rear;
	int num;
	
	Deque(int maxlen) {
		capacity = maxlen;
		front = rear = num = 0;
		
		try {
			deq = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	int enque_front(int x) {
		if (isFull() == 1)
			return -1;
		
		if (front == 0)
			front = capacity - 1;
		else
			front--;
		
		deq[front] = x;
		num++;
		
		return x;
	}
	
	int enque_back(int x) {
		if (isFull() == 1)
			return -1;
		
		deq[rear++] = x;
		num++;
		
		if (rear == capacity)
			rear = 0;
		
		return x;
	}
	
	int deque_front() {
		if (isEmpty() == 1)
			return -1;
		
		int x = deq[front++];
		num--;
		
		if (front == capacity)
			front = 0;
		
		return x;
	}
	
	int deque_back() {
		if (isEmpty() == 1)
			return -1;
		
		if (rear == 0)
			rear = capacity - 1;
		else
			rear--;
		
		int x = deq[rear];
		num--;
		
		return x;
	}
	
	int peek_front() {
		if (isEmpty() == 1)
			return -1;
		
		return deq[front];
	}
	
	int peek_back() {
		if (isEmpty() == 1)
			return -1;
		
		if (rear == 0) {
			return deq[capacity - 1];
		}
		
		return deq[rear - 1];
	}
	
	int isEmpty() {
		if (num <= 0)
			return 1;
		
		return 0;
	}
	
	int isFull() {
		if (num >= capacity)
			return 1;
		
		return 0;
	}
	
	int size() {
		return num;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Deque deq = new Deque(10000);
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch (command) {
				case "push_front":
					deq.enque_front(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					deq.enque_back(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					sb.append(deq.deque_front()).append("\n");
					break;
				case "pop_back":
					sb.append(deq.deque_back()).append("\n");
					break;
				case "size":
					sb.append(deq.size()).append("\n");
					break;
				case "empty":
					sb.append(deq.isEmpty()).append("\n");
					break;
				case "front":
					sb.append(deq.peek_front()).append("\n");
					break;
				case "back":
					sb.append(deq.peek_back()).append("\n");
					break;
			}
		}
		
		System.out.println(sb);
	}

}
