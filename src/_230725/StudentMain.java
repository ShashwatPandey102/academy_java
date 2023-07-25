package _230725;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 4, "소프트웨어공학");
	
//		Student s2 = new Student(); // 생성자가 단 하나 뿐이고, 그 생성자의 매개변수가 존재하므로 반드시 그 매개변수에 맞춰서 해당 객체를 생성해야만 한다.
		
		System.out.println(s.name);
		System.out.println(s.grade);
		System.out.println(s.department);
		
		Student s2 = new Student(); // 기본 생성자처럼 추가 생성자를 만든 후 호출함
		Student s3 = new Student("정민");
		Student s4 = new Student("길동", 3);
		Student s5 = new Student("이름", 2, "컴퓨터공학");
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
