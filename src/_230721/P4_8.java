package _230721;

public class P4_8 {
	public static void main(String[] args) {
		
		// 2x + 4y = 10의 모든 해 구하기
		
		for (int i = 0; i <= 10; i++) {
			
			for (int j = 0; j <= 10; j++) {
				if(2 * i + 4 * j == 10) {
					System.out.printf("x=%d, y=%d\n", i, j);
					break;
				}
			}
			
		}
	}
}
