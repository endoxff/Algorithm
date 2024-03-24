import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(eratosthenes(n, k));
	}

	public static int eratosthenes(int n, int k) {
		prime = new boolean[n + 1];
		int count = 0;
		
		prime[0] = true;
		prime[1] = true;
		
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				continue;
			}
			
			for (int j = i; j < prime.length; j += i) {
				if (prime[j] == true) {
					continue;
				} else {
					prime[j] = true;
					count++;
					if (count == k) {
						return j;
					}
				}
			}
		}
		
		return -1;
	}
}
