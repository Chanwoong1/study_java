public class OperatorEx8 {
	public static void main(String args[]) {
		int a = 1000000;
		int b = 2000000;
		long c = a * b;	// a * b 가 먼저 int형으로 계산될 때 오버플로우가 발생하므로 그 후 long 형에 저장되어도 값이 변환된다.

		System.out.println(c);
	}
}
