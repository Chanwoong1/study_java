import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println("Case #" + (i + 1) + ": " + (a + b));
		}
	}
}