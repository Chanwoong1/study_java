import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a < 60) System.out.print('F');
		else if (a < 70) System.out.print('D');
		else if (a < 80) System.out.print('C');
		else if (a < 90) System.out.print('B');
		else System.out.print('A');
	}
}