import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();
		int Q = s.nextInt();

		H += Q / 60;
		M += Q % 60;
		if (M >= 60) {
			H++;
			M -= 60;
		}
		if (H > 23) {
			H -= 24;
		}
		System.out.print(H + " " + M);
	}
}