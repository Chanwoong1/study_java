public class OperatorEx10 {
	public static void main(String args[]) {
		int a = 1000000;

		int result1 = a * a / a;	// 먼저 곱하면 오버플로우 발생
		int result2 = a / a * a;	// 나눠준 뒤 곱해주면 1 곱하기 a

		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);
	}
}
