import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Stack {
	int[] stk;
	int capacity;
	int ptr;
	
	Stack(int maxlen) {
		capacity = maxlen;
		ptr = 0;
		
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	int push(int x) {
		if (isFull() == 1)
			return -1;
		
		return stk[ptr++] = x;
	}
	
	int pop() {
		if (isEmpty() == 1)
			return -1;
		
		return stk[--ptr];
	}
	
	int peek() {
		if (isEmpty() == 1)
			return -1;
		
		return stk[ptr - 1];
	}
	
	int isEmpty() {
		if (ptr <= 0)
			return 1;
		
		return 0;
	}
	
	int isFull() {
		if (ptr >= capacity)
			return 1;
		
		return 0;
	}
	
	int size() {
		return ptr;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Stack stk = new Stack(10000);
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch (command) {
				case "push":
					stk.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(stk.pop()).append("\n");
					break;
				case "size":
					sb.append(stk.size()).append("\n");
					break;
				case "empty":
					sb.append(stk.isEmpty()).append("\n");
					break;
				case "top":
					sb.append(stk.peek()).append("\n");
					break;
			}
		}
		
		System.out.println(sb);
	}

}
