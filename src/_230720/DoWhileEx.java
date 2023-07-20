package _230720;

public class DoWhileEx {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 200;
		
		do {
			sum += i;
			i++;
		} while (i <= 100);
		
		System.out.println("합계 : " + sum);

		sum = 0;
		i = 200;
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("합계 : " + sum);
	}
}
