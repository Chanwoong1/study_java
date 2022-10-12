import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/25304

import java.util.Scanner;
public class B5_25304 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		int a = 0;
		int b = 0;
		for (int i = 0; i < N; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			X = X - (a * b);
		}
		if (X == 0)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
