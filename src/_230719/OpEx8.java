package _230719;

public class OpEx8 {
	
	public static void main(String[] args) {
		
		String name = "홍길동";
		System.out.println("안녕하세요 " + name + "입니다");
		
		int height = 180;
		System.out.println("저의 키는 " + height + "cm입니다");
		
		String weight = 75.5 + ""; // 빈 문자열을 더하면 자동으로 문자열 타입으로 바뀐다
		System.out.println("제 몸무게는 " + weight + "kg입니다");
		
		double w = 75.5;
		
		int ageInt = 30; // 정수
		String ageStr = "30"; // 문자열
		
		// 많이 사용하는 System.out 클래스의 출력 종류로는 3가지 정도가 있다
		System.out.print("abcd"); // 개행 없이 출력
		System.out.printf("abcd"); // print format
		System.out.println("abcd"); // 끝나고 개행을 같이 출력함
		
		// printf : 지시자와 결합하여 가독성 높은 출력 구문 생성
		
		System.out.printf("안녕하세요. %s입니다\n", name);
		System.out.printf("저의 키는 %dcm입니다%n", height);
		System.out.printf("저의 몸무게는 %.1fkg입니다\n", w);
		
//		지시자의 종류
//		%s : 문자열 대체
//		%d : 정수 대체 (10진수)
//		%s : 실수 대체
//		%n : 줄 바꿈 (\n)
//		%x : 16진수
//		%o : 8진수
	}
}



