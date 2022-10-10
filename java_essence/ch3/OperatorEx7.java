public class OperatorEx7 {
	public static void main(String args[]) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);	// 300은 byte형에서 데이터 손실이 일어나므로 44가 변수 c에 저장된다.
	}
}
