package _230720;

public class ArrEx4 {
	public static void main(String[] args) {
		
		String[] arrStr = new String[5];
		
		System.out.println(arrStr[0]);
		
		// String은 참조자료형이기 때문에 기본값인 null이 들어간다.
	
		char[] arrChar = new char[5]; // u0000으로 초기화되는데, 이는 공백이다.
		double[] doubleArr = new double[5];
		
		System.out.println(doubleArr[0]);
		
		// NullPointerException에서의 pointer에 대한 부분은 c언어를 공부하면서 배우면 좋다. (웬만한 언어를 관통하는 개념이다)
		
		// 아래와 같은 방식들로 선언 및 할당한다.
		int[] arr = new int[5];
		int[] arr2 = new int[]{10, 20, 30, 40}; // 생략하지 않은 정식 문법
		int[] arr3 = {10, 20, 30, 40}; // new int[]를 생략함 (생성자를 생략)
		
		System.out.println("기존 주소 : " + arr);
		
		arr = new int[10]; // 위의 int[] arr에서 선언했던 주소가 아니고 새로운 주소를 갖는다.

		System.out.println("새로운 주소 : " + arr);
		
//		arr2 = {50, 60, 70}; // array 상수 (할당)은 new 생성자와 함께 사용할 수 있다. 생성과 동시에 값을 초기화해야만 한다. (생성자 없이 값 초기화 불가능)
		
	}
}
