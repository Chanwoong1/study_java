import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(a + b);
		}
		s.close();
	}
}