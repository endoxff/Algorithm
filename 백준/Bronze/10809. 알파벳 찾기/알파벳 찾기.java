import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
		
		int[] array = new int[26];
		
		for (int i = 0; i < 26; i++) {
			array[i] = -1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if (array[(int)str.charAt(i) - 97] == -1) {
				array[(int)str.charAt(i) - 97] = i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 26; i++) {
			sb.append(array[i]).append(" ");
		}
		
		System.out.println(sb);
	}

}
