import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int count = str.length();
		
		for (int i = 0; i < str.length(); i++) {
			if (i != str.length() - 1 && str.charAt(i) == 'c' 
					&& (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
				count--;
			} else if (str.charAt(i) == 'd') {
				if (i < str.length() - 2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
					count -= 2;
				} else if (i != str.length() - 1 && str.charAt(i + 1) == '-') {
					count--;
				}
			} else if (i != 0 && str.charAt(i) == 'j'
				&& (str.charAt(i - 1) == 'l' || str.charAt(i - 1) == 'n')) {
				count--;
			} else if (i != 0 && str.charAt(i) == '=') {
				if (str.charAt(i - 1) == 's') {
					count--;
				} else if (str.charAt(i - 1) == 'z' && ((i == 1) || str.charAt(i - 2) != 'd')) {
					count--;
				}
			}
		}
		
		System.out.println(count);
	}

}
