package _230720;

import java.util.Arrays;

public class ArrEx1 {
	public static void main(String[] args) {
		
		int[] arrInt; // 초기화 안 함
		int arrInt2[] = new int[1];
		
//		System.out.println(arrInt[0]);
		System.out.println(arrInt2[0]);
		
//		기본자료형은 리터럴을 갖고 있다.
//		참조자료형은 String을 제외하면 거의 리터럴을 갖고 있지 않다.
		
//		리터럴은 데이터 그 자체를 뜻한다. 변수에 넣는 변하지 않는 데이터를 의미한다.
		
		String str = new String("test"); // 원래는 String도 클래스이므로 이런 식으로 객체를 생성해줘야 한다.
		int[] arr = new int[5]; // 길이가 5인 배열 객체 생성
		// new로 객체를 생성하면
		
		System.out.println(arr); // arr 인스턴스의 주소값이 나온다
		// 각 배열 원소에 대한 값을 정해주지 않았으므로 int 초기값인 0이 들어간다
		// 인덱스의 시작 숫자는 0임
		
		System.out.println(Arrays.toString(arr));
		
		// 해당 array의 데이터 타입과 일치하는 데이터만 배열에 들어갈 수 있다.
		
	
	}
}
