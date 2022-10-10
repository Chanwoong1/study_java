public class OperatorEx9 {
	public static void main(String args[]) {
		long a = 1000000 * 1000000;
		long b = 1000000 * 1000000L;	// L을 한 값에 넣어줌으로써 b는 long으로 형변환이 되었다.

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
