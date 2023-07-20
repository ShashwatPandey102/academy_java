package _230720;

public class OpPractice {
	public static void main(String[] args) {
		
		int year = 1700;
		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		System.out.println(leapYear);
		
		System.out.println("-------------------------");
		
		int price = 187000;
		int oman = price / 50000;
		int ilman = (price % 50000) / 10000;
		int ochun = (price % 10000) / 5000;
		int ilchun = (price % 5000) / 1000;
		
		System.out.printf("5만원권 : %d\n", oman);
		System.out.printf("1만원권 : %d\n", ilman);
		System.out.printf("5천원권 : %d\n", ochun);
		System.out.printf("1천원권 : %d\n", ilchun);
		
		System.out.println("-------------------------");
		
		int number = 1234;
		int result = number / 100 * 100;
		int result2 = number - number % 100;
		
		System.out.println(result);
		System.out.println(result2);
		
		System.out.println("-------------------------");
		
	}
}
