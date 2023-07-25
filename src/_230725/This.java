package _230725;

public class This {
	int i = 10; // 멤버변수
	
	public static void main(String[] args) {
		
		This this1 = new This(); // 현재 클래스 생성
		
		System.out.println(this1.i); // 멤버변수 출력
		
		this1.run();
		
		This this2 = new This();
		
		System.out.println(this1);
		System.out.println(this2);
		
		System.out.println(this1 == this2); // new로 생성했기에 당연히 다름
		
		This this3 = this1;
		
		System.out.println(this3);
		
		System.out.println("======================");
		
		this1.printThis();
		this3 = new This(20);
		
		System.out.println(this1.i); // this3을 new 생성자로 생성하고 i를 초기화하였으므로 this1의 i는 변화 없음
		System.out.println(this3.i); // this3은 i 멤버변수가 20으로 위에서 초기화되었으.
	}
	
	void run() {
		System.out.println("This.run()");
	}
	
	void printThis() {
		// this : 미래에 생성될 객체의 주소값
		
		System.out.println(this);
		// 해당 메소드가 속한 클래스의 현재 인스턴스를 가리킴. printThis 메소드가 호출된 인스턴스를 가리키게 됨
	}
	 
	// 기본 생성자
	This(){
		
	}
	
	This(int i){
		this.i = i;
	}
}








