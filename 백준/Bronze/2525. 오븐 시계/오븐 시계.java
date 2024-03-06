import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int totalMinute = a * 60 + b + c;
		int h = totalMinute / 60;
		int m = totalMinute % 60;
		
		if (h >= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
	}

}
