import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		for (int i = 0; i < n + 1; i++)
			sum += i;
		System.out.print(sum);
	}
}