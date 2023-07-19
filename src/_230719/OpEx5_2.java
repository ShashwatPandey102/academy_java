package _230719;

public class OpEx5_2 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// & 연산 (& 연산은 좌항이 false이더라도 우항을 실행함)
		// 굳이 넣자면 일반 논리 연산자라기 보다는 비트 연산자로 친다
		System.out.println("--------------------");
		System.out.println(a == b & test1());
		System.out.println(a != b | test1());
		
		// && 연산 (&& 연산은 좌항이 false이면 우항을 굳이 실행하지 않음)
		// 즉, && 연산이 더 효율적이다
		System.out.println("--------------------");
		System.out.println(a == b && test2());
		System.out.println(a != b || test2());
		
		// 다항 연산의 경우 왼쪽부터 오른쪽으로 실행함
		
		// 각 메서드 안의 println은 하나씩 그냥 메서드 내에서 출력하는 거고,
		// a == b & test1() 이런 것들의 조건에 대한 반환값을 println 했으므로 true나 false가 출력이 된다
		
		// 메서드 호출
		System.out.println("--------------------");
		test();
	}
	
	public static boolean test1() {
		System.out.println("test1() 메서드 실행됨. & 연산 이후 호출함");
		return true;
	}
	
	public static boolean test2() {
		System.out.println("test2() 메서드 실행됨. && 연산 이후 호출함");
		return true;
	}
	
	public static void test() {
		System.out.println("메서드 호출");
	}
}
