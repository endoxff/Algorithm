import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int a, b, m, ten;
		int[] numA;
		ArrayList<Integer> numB = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		numA = new int[m];
		
		for (int i = 0; i < m; i++) {
			numA[i] = Integer.parseInt(st.nextToken());
		}
		
		ten = aToTen(a, numA);
		tenToB(ten, b, numB);
		
		Collections.reverse(numB);
		for (int e: numB) {
			sb.append(e).append(" ");
		}
		
		System.out.println(sb);
	}
	
	public static int aToTen(int a, int[] num) {
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			int square = 1;
			
			for (int j = 0; j < num.length - 1 - i; j++) {
				square *= a;
			}
			
			sum += (num[i] * square);
		}
		
		return sum;
	}
	
	public static void tenToB(int ten, int b, ArrayList<Integer> num) {
		while (ten > 0) {
			num.add(ten % b);
			ten /= b;
		}
	}
}
