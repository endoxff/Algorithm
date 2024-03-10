import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = n;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			int[] array = new int[26];
			
			for (int j = 0; j < str.length(); j++) {
				if (array[str.charAt(j) - 97] == 1 && (str.charAt(j) != str.charAt(j - 1))) {
					count--;
					break;
				}
				array[str.charAt(j) - 97] = 1;
			}
		}
		
		System.out.println(count);
	}

}
