package _230720;

public class Gugu2dan {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println("================");
		}
		
		for (int i = Integer.parseInt("0000", 2); i <= Integer.parseInt("1111", 2); i++) {
			System.out.println(String.format("%04d", Integer.parseInt(Integer.toBinaryString(i))));
		}
		
		System.out.println("================");
		
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				for (int k = 0; k <= 1; k++) {
					for (int l = 0; l <= 1; l++) {
						System.out.printf("%d%d%d%d\n", i, j, k, l);
					}
				}
			}
		}

		System.out.println("================");
	}
}
