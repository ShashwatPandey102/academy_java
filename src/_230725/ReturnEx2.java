package _230725;

public class ReturnEx2 {

	public static void main(String[] args) {
		
		Return2 obj = new Return2();

		obj.getTest(0);
		obj.getTest(1);

		System.out.println("==================");

		System.out.println(obj.getName(0));
		System.out.println(obj.getName(1));
		
		
	}
}

class Return2 {

	void getTest(int type) {
		System.out.println("getTest() 메서드 시작");

		if (type == 1) {
			return;
		}

		System.out.println("getTest() 메서드 끝");
	}

	String getName(int type) {

		// 아래와 같이 안 됨
//		if(type == 1) {
//			return "";
//		}
//		
//		if(type != 1) {
//			return "";
//		}

//		이런 식으로 if ~ else 형태로 해서 다른 그 어떤 조건도 있지 않는 상황을 만들면 가능함
		if (type == 1) {
			return "";
		} else {
			return "";
		}

		// 근데 위와 같이 하는 경우는 거의 없음

//		return "홍길동";
	}
}
