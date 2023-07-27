package _230727;

// StackOverFlow 발생 (무한재귀)
public class Recursion {
	Recursion r = new Recursion(); // 해당 객체(인스턴스)를 생성한다는 건, 해당 인스턴스의 필드를 초기화해야한다는 것이다.
	// 그래서 초기화할 때 그 안의 인스턴스를 초기화하고, 그리고 또 그 안의 인스턴스를 초기화하고... 마트료시카마냥 됨.

//	final int i; // 당연히 final이 붙으면 상수이기 때문에 단순 변수를 넣을 수 없다.
	
//	다만 아래와 같이 final int 변수명; 후 초기화 블럭에 해당 변수를 초기화해주면 상관 없다.
//	결국 아래는 final int i = 20; 과 같은 말이기 때문이다.
	final int i;
	{
		i = 20;
	}
	
//	이렇게 해도 되고
	final int j = 20;
	
//	아래처럼 어떤 생성자 안에 초기화하면 된다.
	final int k;
	public Recursion() {
		k = 20;
	}
	
//	배열의 주소(참조값)가 변경 불가
	final int[] arr = new int[10];
	{
//		arr = new int[20]; // 이렇게는 주소를 바꾸는 거라 안 됨
		
		arr[0] = 10;
		arr[1] = 20;
	}
	
	public static void main(String[] args) {
		new Recursion(); // Recursion을 생성하면 해당 클래스 내에서 Recursion을 생성한다. 그리고 그 안에서 또 Recursion을 생성한다. (초기화 과정)

	}
}
