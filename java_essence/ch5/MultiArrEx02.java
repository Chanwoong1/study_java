import java.util.*;

public class MultiArrEx02 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[25];
		for (int i = 1; i < 26; i++)
			arr[i - 1] = i;
		for (int i = 0; i < 100; i++) {
			int r = (int)(Math.random() * 25);
			int tmp = arr[r];
			arr[r] = arr[0];
			arr[0] = tmp;
		}
		int[][] bingo = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				bingo[i][j] = arr[i * 5 + j];
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (bingo[i][j] < 10)
					System.out.print(' ');
				System.out.printf("%d ", bingo[i][j]);
			}
			System.out.println();
		}
		while (true) {
			System.out.println("1 ~ 25의 숫자를 입력하세요. (종료 : 0)>");
			int input = sc.nextInt();
			if (input == 0)
				break;
			if (input < 1 || input > 25) {
				System.out.println("잘못된 값입니다. 다시 입력하세요.");
				continue;
			}
			else {
				for (int i = 0; i < 5; i++) {
					int r_sum = 0;
					int c_sum = 0;
					for (int j = 0; j < 5; j++) {
						if (bingo[i][j] == input)
							bingo[i][j] = 0;
					for (int k = 0; k < 5; k++) { 
						r_sum += bingo[i][k];
						c_sum += bingo[k][i];
					}
					if (r_sum == 0 || c_sum == 0) {
						System.out.println("축하합니다. 빙고입니다!");
						return ;
					}
					}
				}
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if (bingo[i][j] < 10)
							System.out.print(' ');
						System.out.printf("%d ", bingo[i][j]);
					}
					System.out.println();
				}
			}
			
		}
	}
}
