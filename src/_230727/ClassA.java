package _230727;

public class ClassA {
	public static void main(String[] args) {
		ClassB cb = new ClassB();
		
		cb.print();
	}
	
	public void print() {
		System.out.println("여기는 ClassA");
	}
	
	protected void m() {
		System.out.println("A.m()");
	}
}

// public으로 하기 위해 ClassB 파일을 별도로 만들었음
//class ClassB{
//	void print() {
//		System.out.println("여기는 ClassB");
//	}
//}
