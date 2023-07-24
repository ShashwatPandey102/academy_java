package homework;

public class Student {
	// 학번, 이름, 국어, 영어, 수학에 해당하는 변수 타입, 이름 정의
	// StudentMain 클래스 생성 후 Student 인스턴스를 생성 후 데이터 초기화
	
	String studentNo;
	String name;
	int kor;
	int eng;
	int math;
	
	
	public Student(String studentNo, String name, int kor, int eng, int math) {
		this.studentNo = studentNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ "]";
	}
	
}
