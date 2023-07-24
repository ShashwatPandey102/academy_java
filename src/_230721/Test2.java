package _230721;

public class Test2 {
	static class AAclass{ // 내부 클래스임. 내부 클래스이므로 상위 클래스인 Test2가 생성되어야 AAclass를 생성할 수 있음. 하지만 앞에 static을 붙인다면 상위 클래스인 Test2 인스턴스를 생성하지 않아도 사용할 수 있음.
		int i;
		int j;
		
		
	}
	
	public static void main(String[] args) {
		AAclass myVal = new AAclass();
		myVal.i = 10;
		myVal.j = 20;
		
		myVal = change(myVal); // 스태틱 함수를 선언해놨기에 상위 클래스인 Test2 인스턴스 생성 없이 사용할 수 있음.
		System.out.printf("i=%d, j=%d\n", myVal.i, myVal.j);
	}
	
	// AAclass 자료형을 반환하는 함수 change (매개변수로 AAclass를 받음)
	static AAclass change(AAclass myVal) {
		
		// i, j 필드값을 바꿔서 클래스를 반환함
		int temp;
		temp = myVal.i;
		myVal.i =  myVal.j;
		myVal.j = temp;
		return myVal;
	}
}
