import java.util.Arrays;

public class ArrayEx10 {
	public static void main(String args[]) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int r = (int)(Math.random() * 10);
			arr[i] = r;
		}
		System.out.println("변경 전");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("\n변경 후");
		System.out.println(Arrays.toString(arr));
	}
}
