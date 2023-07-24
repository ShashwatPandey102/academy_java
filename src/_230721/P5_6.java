package _230721;

public class P5_6 {
	public static void main(String[] args) {
		
		// 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산
		// 가능한 한 적은 수의 동전으로 거슬러 줘야 함
		
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for (int i = 0; i < coinUnit.length; i++) {
			int div = money / coinUnit[i];
			System.out.printf("%d원: %d\n", coinUnit[i], div);
			money -= div * coinUnit[i];
		}
	}
}
