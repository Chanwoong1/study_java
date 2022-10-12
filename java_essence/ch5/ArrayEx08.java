import java.util.Random;

// 무작위 로또 번호 추출

class ArrayEx08 {
	public static void main(String args[]) {
		int[] lotto = new int[45];
		
		for (int i = 0; i < 45; i++)
			lotto[i] = i + 1;

		for (int i = 0; i < 500; i++) {
			int n = (int)(Math.random() * 45);
			int tmp = lotto[0];
			lotto[0] = lotto[n];
			lotto[n] = tmp;
		}

		System.out.print("lotto num : ");
		for (int i = 0; i < 6; i++) {
			System.out.print("[" + lotto[i] + "]");
		}
		System.out.println();
	}
}