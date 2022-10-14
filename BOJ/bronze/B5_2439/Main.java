import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			for (int k = N - 1; k > i; k--) {
				System.out.print(' ');
			}
			for (int j = -1; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}