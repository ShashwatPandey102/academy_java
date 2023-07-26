package _230726;

public class SmartPhoneMain {
	public static void main(String[] args) {
		
		Phone p = new Phone(); // SmartPhone 클래스의 수퍼 클래스가 될 Phone 클래스
		
		p.name = "전화기";
		p.company = "현대";
		p.color = "화이트";
		
		System.out.println("Phone 출력");
		System.out.println(p);
		
		// Phone의 기능들을 실행해 봄
		p.call();
		p.receive();
		
		SmartPhone sp = new SmartPhone(); // Phone 클래스를 물려받은 SmartPhone 클래스 (서브 클래스)
		
		sp.name = "갤럭시";
		sp.company = "삼성";
		sp.color = "블랙";
		
		System.out.println("SmartPhone 출력");
		System.out.println(sp);
		
		// SmartPhone의 기능들을 실행해 봄
		sp.call();
		sp.receive();
		sp.installApp();
	}
}
