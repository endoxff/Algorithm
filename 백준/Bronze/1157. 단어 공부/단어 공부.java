import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();
		
		int[] array = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			array[str.charAt(i) - 65]++;
		}
		
		int index = 0;
		int max = 0;
		
		for (int i = 0; i < 26; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < 26; i++) {
			if (array[i] == max) {
				count++;
			}
		}
		
		if (count > 1) {
			System.out.println("?");
		} else {
			System.out.println((char)(index + 65));
		}
	}

}
