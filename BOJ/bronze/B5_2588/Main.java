import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		String B = s.next();
		for (int i = 3; i > 0; i--) {
			System.out.println(A * Integer.parseInt(B.substring(i - 1, i)));
		}
		System.out.println(A * Integer.parseInt(B));
	}	
}
