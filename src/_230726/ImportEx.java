package _230726;

//import _230725.Student; // 다른 패키지의 클래스를 쓸 수 있게 함
import _230725.*; // 이렇게 하면 해당 패키지 안의 모든 클래스를 불러옴
import student.*; // student 패키지도 불러옴

public class ImportEx {
	public static void main(String[] args) {
//		Student s = new Student();
		
//		_230725.Student s = new _230725.Student(); // 이렇게 일일이 패키지명을 적기는 불편함. 그래서 import를 하는 것임.
		
//		Student s = new Student(); // The type Student is ambiguous 에러가 뜸 (Student 클래스가 두 패키지 전부에 존재하므로)
		// 그래서 원하는 Student 클래스를 import해서 쓰거나 한다.
		This t;
		
		
	}
}
