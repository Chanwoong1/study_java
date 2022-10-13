import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();

		if (M < 45 && H == 0) H = 23;
		else if (M < 45 && H != 0) H -= 1;
		if (M < 45) M += 15;
		else M -= 45;
		System.out.print(H + " " + M);
	}
}