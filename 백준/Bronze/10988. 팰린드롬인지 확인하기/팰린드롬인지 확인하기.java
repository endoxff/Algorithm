import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char[] array = str.toCharArray();
		
		int flag = 1;
		
		for (int i = 0; i < str.length() / 2; i++) {
			if (array[i] != array[str.length() - 1 - i]) {
				flag = 0;
			}
		}
		
		System.out.println(flag);
	}

}
