import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		if (n1 == n2 && n2 == n3) System.out.print(10000 + 1000 * n1);
		else if (n1 == n2 && n2 != n3) System.out.print(1000 + 100 * n1);
		else if (n1 == n3 && n2 != n3) System.out.print(1000 + 100 * n1);
		else if (n2 == n3 && n1 != n3) System.out.print(1000 + 100 * n2);
		else {
			int max;
			if (n1 > n2) {
				if (n1 > n3) max = n1;
				else max = n3;
			}
			else {
				if (n2 > n3) max = n2;
				else max = n3;
			}
			System.out.print(100 * max);
		}
	}
}