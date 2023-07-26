package _230725;

public class Student {
	String name;
	int grade;
	String department;
	
	// 여기까지만 적으면 자동으로 기본생성자를 생성해줌
	
	// 직접 생성자를 작성해 봄 (반환값이 없음)
//	Student(String n, int g, String d){
//		// 생성자 내에서는 어떤 행위를 할 수도 있고, 해당 클래스의 멤버변수를 초기화할 수도 있음
//		this.name = n;
//		this.grade = g;
//		this.department = d;
//	}
	
	// 기본 생성자처럼 만들어 봄
	public Student(){ // 접근제한자를 적지 않으면 기본적으로 default(package)이며, 같은 패키지 안에서만 사용할 수 있다
		
	}
	
	Student(String n){
		this.name = n;
	}

	Student(String n, int g){
		this.name = n;
		this.grade = g;
	}

	Student(String n, int g, String d){
		this.name = n;
		this.grade = g;
		this.department = d;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", department=" + department + "]";
	}
	
	

}



