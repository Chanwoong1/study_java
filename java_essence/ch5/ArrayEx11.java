import java.util.Arrays;

class ArrayEx11 {
	public static void main(String args[]) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		int[] counter = new int[10];
		for (int i = 0; i < counter.length; i++)
			for (int j = 0; j < arr.length; j++)
				if (arr[j] == i)
					counter[i]++;
		for (int i = 0; i < counter.length; i++)
			System.out.printf("%d의 개수 : %d\n", i, counter[i]);
	}
}