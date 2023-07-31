package _230731;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		Random r1 = new Random(42); // Random() 에 인자를 넣으면 시드값을 정하는 것이다.
		Random r2 = new Random(42); // r1과 r2 랜덤 객체에 전부 같은 시드값을 넣었기 때문에, 같은 순서대로 난수를 생성한다.
		
		Math.random();
		
		System.out.println("r1");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + r1.nextInt());
			
			System.out.println(i + "=" + r1.nextInt(10)); // 0부터 10 미만까지 정수값 반환
		}

		System.out.println("r2");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + r2.nextInt());

			System.out.println(i + "=" + r2.nextInt(10));
		}
	}
}
