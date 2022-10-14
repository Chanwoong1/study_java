import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int ans = 0;
		int a = N / 10;
		int b = N % 10;
		while (true) {
			int c = a + b;
			a = b;
			b = c % 10;
			if (a * 10 + b == N)
				break;
			ans++;
		}
		System.out.print(ans + 1);
	}
}