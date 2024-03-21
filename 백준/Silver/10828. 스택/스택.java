import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Stack {
	int[] stk;
	int capacity;
	int ptr;
	
	Stack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[maxlen];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	int push(int x) {
		if (ptr >= capacity) {
			return -1;
		}
		return stk[ptr++] = x;
	}
	
	int pop() {
		if (ptr <= 0) {
			return -1;
		}
		return stk[--ptr];
	}
	
	int peek() {
		if (ptr <= 0) {
			return -1;
		}
		return stk[ptr - 1];
	}
	
	int size() {
		return ptr;
	}
	
	int isEmpty() {
		if (ptr <= 0) {
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
		
		Stack stk = new Stack(10000);
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			if (st.hasMoreTokens()) {
				stk.push(Integer.parseInt(st.nextToken()));
			} else {
				switch(command) {
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
		}
		
		System.out.println(sb);
	}

}
