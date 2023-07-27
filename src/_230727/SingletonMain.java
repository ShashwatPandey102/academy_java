package _230727;

public class SingletonMain {
	public static void main(String[] args) {
		
//		Singleton singleton = new Singleton(); // 이렇게 생성 불가 (해당 싱글턴 객체의 생성자는 private임)
		Singleton singleton = Singleton.getSingleton(); // getter로만 해당 객체를 가져올 수 있음. 직접 객체를 생성할 수는 없음.
		
	}
}
