import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
				int x = s.nextInt();
				int y = s.nextInt();
				int term = y - x;
				int max = (int)Math.sqrt(term);
				if (max == Math.sqrt(term)) {
					System.out.println(max * 2 - 1);
				}
				else if (term <= max * max + max) {
					System.out.println(max * 2);
				}
				else {
					System.out.println(max * 2 + 1);
			}
		}
	}
}
