import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String pwd;
		
		while (!(pwd = br.readLine()).equals("end")) {
			if (checkOne(pwd) && checkTwo(pwd) && checkThree(pwd)) {
				sb.append("<" + pwd + ">" + " is acceptable.").append("\n");
			} else {
				sb.append("<" + pwd + ">" + " is not acceptable.").append("\n");
			}
		}
		
		System.out.println(sb);
	}

	public static boolean isVowel(char c) {
		return "aeiou".indexOf(c) != -1;
	}
	
	public static boolean checkOne(String pwd) {
		boolean flag = false;
		
		for (int i = 0; i < pwd.length(); i++) {
			if (isVowel(pwd.charAt(i))) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			return true;
		}
		return false;
	}
	
	public static boolean checkTwo(String pwd) {
		if (pwd.length() < 3) {
			return true;
		} else {
			for (int i = 0; i < pwd.length() - 2; i++) {
				if ((isVowel(pwd.charAt(i)) && isVowel(pwd.charAt(i + 1)) && isVowel(pwd.charAt(i + 2)))
						|| (!isVowel(pwd.charAt(i)) && !isVowel(pwd.charAt(i + 1)) && !isVowel(pwd.charAt(i + 2)))) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static boolean checkThree(String pwd) {
		for (int i = 0; i < pwd.length() - 1; i++) {
			if ((pwd.charAt(i) == pwd.charAt(i + 1)) && (pwd.charAt(i) != 'e' && pwd.charAt(i) != 'o')) {
				return false;
			}
		}
		return true;
	}
	
}
