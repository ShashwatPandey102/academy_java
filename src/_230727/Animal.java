package _230727;

public class Animal {
	private String type;
	private String name;
	
	// 기본 생성자
	public Animal() {
	}
	
	// 필드 초기화
	public Animal(String type, String name) {
		this.type = type;
		this.name = name;
	}

	// getter, setter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println(this.name + "은(는) 잠을 잔다.");
	}
	
}





