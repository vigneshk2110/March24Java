package march.java;

public class Pattern1 {

	public static void main(String[] args) {
		int a = 10, z = 0, c = 1, k = 1, x = 1;
		int t = a;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (j < t) {
					System.out.print("  ");
				} else {
					System.out.print(x);
					z = x;
					x = x + 2;
					System.out.print(" ");
				}
			}
			if (i == 1) {
				x = 2;
			} else {
				if (c % 2 == 0) {
					x = z - k;
					k = k + 2;
				} else {
					x = z - k;
				}
				c++;
			}
			t--;
			System.out.print('\n');
		}
	}

}
