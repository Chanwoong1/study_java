// 논리 부정 연산자
public class OperatorEx27 {
	public static void main(String args[]) {
		boolean	b = true;
		char	ch = 'C';

		System.out.printf("b = %b\n", b);
		System.out.printf("!b = %b\n", !b);
		System.out.printf("!!b = %b\n", !!b);
		System.out.printf("!!!b = %b\n", !!!b);
		System.out.printf("\n");

		System.out.printf("ch = %c\n", ch);
		System.out.printf("ch < 'a' || ch > 'z' -> %b\n", ch < 'a' || ch > 'z');
		System.out.printf("!(ch >= 'a' && ch <= 'z') -> %b\n", !(ch >= 'a' && ch <= 'z'));
		System.out.printf("ch >= 'a' && ch <= 'z' -> %b\n", ch >= 'a' && ch <= 'z');
	}
}
