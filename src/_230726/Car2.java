package _230726;

public class Car2 {

	String color;
	String company;
	String type;

	// 매개변수 없는 생성자
	Car2() {
		this("white", "기아", "경차"); // 매개변수가 세 개인 필드 전부를 초기화하는 생성자를 호출함
	}

	Car2(String color, String company, String type) { // 매개변수를 세 개 받아 필드를 전부 초기화함
		this.color = color;
		this.company = company;
		this.type = type;
	}

	Car2(String com, String t) { // 매개변수를 두 개 받고 색상은 정해 놓음
		this("white", com, t);
	}

	Car2(String t) { // 매개변수를 하나 받고 색상, 회사는 정해 놓음
		this("white", "기아", t);
//		this("기아", t); 로 해도 됨
	}
	
	// toString 오버라이드 (이걸 안 하면 16진수 객체의 주소가 나옴)
	public String toString() {
		return color + "-" + company + "-" + type;
	}
	
}
