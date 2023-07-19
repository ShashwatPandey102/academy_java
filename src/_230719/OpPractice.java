package _230719;

public class OpPractice {
	public static void main(String[] args) {
		
		int year = 1900;
		
		boolean leapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
		
		if(leapYear) {
			System.out.println("윤년입니다");
		}else {
			System.out.println("윤년이 아닙니다");
		}
		
		System.out.println("=======================");
		
		int price = 187000;
		
		// 가장 적은 지폐수량으로 지불하는 코드
		int oman = price / 50000;
		price -= oman * 50000;
		
		int ilman = price / 10000;
		price -= ilman * 10000;
		
		int ochun = price / 5000;
		price -= ochun * 5000;
		
		int ilchun = price / 1000;
		
		System.out.printf("5만원권 : %d장\n", oman);
		System.out.printf("1만원권 : %d장\n", ilman);
		System.out.printf("5천원권 : %d장\n", ochun);
		System.out.printf("천원권 : %d장\n", ilchun);
		
		System.out.println("=======================");
		
		// 정수 타입 변수 number에서 십의 자리 이하를 버리는 코드
		
		int number = 1234;
		
		int result = (int)(number / 100) * 100;
		
		System.out.println(result);
		
		System.out.println("=======================");
		
		int age = 5;
		int height = 130;
		boolean parent = true;
		boolean hearchDease = false;
		
		if((age >= 6 || (age < 6 && height >= 120 && parent)) && height >= 120 && !hearchDease) {
			System.out.println("탑승 가능");
		}else {
			System.out.println("탑승 불가능");
		}
	}
}









