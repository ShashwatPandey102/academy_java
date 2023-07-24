package _230721;

public class P4_3 {
	public static void main(String[] args) {
		
		int sum = 0;
		int now = 0;
		
		for (int i = 1; i <= 10; i++) {
			now += i;
			
			sum += now;
		}
		
		System.out.println("총합 : " + sum);
	}
}
