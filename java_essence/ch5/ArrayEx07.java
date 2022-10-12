class ArrayEx07 {
	public static void main(String args[]) {
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i = 0; i < 10; i++)
			System.err.print(num[i]);
		System.out.println();
		int tmp;
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);
			tmp = num[0];
			num[0] = num[n];
			num[n] = tmp;
		}
		for (int i = 0; i < 10; i++)
			System.err.print(num[i]);
	}
}