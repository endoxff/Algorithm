import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int switchN, studentN, gender, num;
		int[] switches;
		
		switchN = Integer.parseInt(br.readLine());
		
		switches = new int[switchN];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < switchN; i++) {
			switches[i] = Integer.parseInt(st.nextToken());
		}
		
		studentN = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < studentN; i++) {
			st = new StringTokenizer(br.readLine());
			
			gender = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			
			if (gender == 1) {
				maleRule(switches, num);
			} else {
				femaleRule(switches, num - 1);
			}
		}
		
		for (int i = 0; i < switches.length; i++) {
			sb.append(switches[i]).append(" ");
			if ((i + 1) % 20 == 0) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static void maleRule(int[] switches, int num) {
		for (int i = num - 1; i < switches.length; i += num) {
			if (switches[i] == 0) {
				switches[i] = 1;
			} else {
				switches[i] = 0;
			}
		}
	}
	
	public static void femaleRule(int[] switches, int num) {
		int left = num - 1;
		int right = num + 1;
		
		while ((left > -1) && (right < switches.length)) {
			if (switches[left] == switches[right]) {
				left -= 1;
				right += 1;
			} else {
				break;
			}
		}
		
		for (int i = left + 1; i <= right - 1; i++) {
			if (switches[i] == 0) {
				switches[i] = 1;
			} else {
				switches[i] = 0;
			}
		}
	}

}
