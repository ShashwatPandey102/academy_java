package _230719;

public class ForEx2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		
		System.out.println("합계 : " + sum);
	}
}
