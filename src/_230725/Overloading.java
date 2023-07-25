package _230725;

public class Overloading {
	public static void main(String[] args) {
		
		Operator op = new Operator();
		
		System.out.println(op.multiply(4, 3));
		System.out.println(op.multiply(4.5, 3.5));
		System.out.println(op.multiply(4, 3.5));
		System.out.println(op.multiply(4.5, 3));
	}
}

class Operator{
	
	// 메서드 오버로딩의 예시
	int multiply(int x, int y) {
		System.out.println("(int, int)");
		return x * y;
	}
	
	// 매개변수 타입이랑 개수랑 순서가 같으므로 오버로딩이 되지 않음
//	int multiply(int x, int y) {
//		
//	}
	
	double multiply(double x, double y) {
		System.out.println("(double, double)");
		return x * y;
	}
	
	double multiply(int x, double y) {
		System.out.println("(int, double)");
		return x * y;
	}
	
	double multiply(double x, int y) {
		System.out.println("(double, int)");
		return x * y;
	}
}









