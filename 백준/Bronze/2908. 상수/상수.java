import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int reverseA = reverse(a);
		int reverseB = reverse(b);
		
		if (reverseA > reverseB) {
			System.out.println(reverseA);
		} else {
			System.out.println(reverseB);
		}
	}
	
	public static int reverse(int n) {
		int reverseN = (n % 10) * 100 + ((n / 10) % 10) * 10 + n / 100;
		
		return reverseN;
	}

}
