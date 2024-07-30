import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> a = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println(getTotalViewer(n, a, b, c));
	}
	
	static long getTotalViewer(int n, ArrayList<Integer> a, int b, int c) {
		long count = n;
		
		for (int i = 0; i < n; i++) {
			int currentA = a.get(i);
			
			currentA -= b;
			if (currentA <= 0) continue;
			
			count += (currentA / c);
			if (currentA % c != 0) {
				count++;
			}
		}
		
		return count;
	}

}
