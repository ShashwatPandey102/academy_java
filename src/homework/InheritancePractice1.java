package homework;

public class InheritancePractice1 {
	public static void main(String[] args) {
		ChildEx ce = new ChildEx();
		ParentEx pe = new ParentEx();
		
		pe = ce;
		pe = (ParentEx)pe;
		
//		ce = pe; // 작은 것에 큰 것을 담을 수 없다!
		ce = (ChildEx)pe;
		
	}
}

class ParentEx{
	public ParentEx() {
		this(1);
		System.out.println("(1)");
	}
	
	public ParentEx(int x) {
		System.out.println("(2)");
	}
	
	void p() {
		
	}
}


class ChildEx extends ParentEx{
	public ChildEx() {
		this(1);
		System.out.println("(3)");
	}
	
	public ChildEx(int x) {
		System.out.println("(4)");
	}
	
	void c() {
		
	}
}