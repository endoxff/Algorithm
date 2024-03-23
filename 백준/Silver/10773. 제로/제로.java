import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {
	int[] stk;
	int capacity;
	int ptr;
	
	Stack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	int push(int x) {
		if (ptr >= capacity) {
			return -1;
		}
		stk[ptr++] = x;
		return x;
	}
	
	int pop() {
		if (ptr <= 0) {
			return -1;
		}
		return stk[--ptr];
	}
	
	int size() {
		return ptr;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		Stack stk = new Stack(k);
		long sum = 0;
		
		for (int i = 0; i < k; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if (x == 0) {
				stk.pop();
			} else {
				stk.push(x);
			}
		}
		
		while (stk.size() != 0) {
			sum += stk.pop();
		}
		
		System.out.println(sum);
	}

}
