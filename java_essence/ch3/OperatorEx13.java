public class OperatorEx13 {
	public static void main(String args[]) {
		char c1 = 'a';
		// char c2 = c1 + 1;	// compile error
		char c2 = 'a' + 1;	// compile ok  -> literal + const

		System.out.println(c2);
	}
}
