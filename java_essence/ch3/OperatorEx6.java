public class OperatorEx6 {
	public static void main(String args[]) {
		byte a = 10;
		byte b = 10;
		byte c = a + b;	// Error 발생. int형보다 작은 byte, short 형의 경우, 연산을 수행할 때, 명시적으로 형변환을 해주어야 한다.
		byte c = (byte)(a + b); // 옳은 경우
		System.out.println(c);
	}
}
