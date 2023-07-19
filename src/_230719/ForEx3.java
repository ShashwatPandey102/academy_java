package _230719;

public class ForEx3 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%5d %5d %5d %5d\n", i, 10-i, i/3, i%3); // 뒤의 두 개는 각각 지연, 순환이라고도 한다
		}
	}
}
