package student;

public class Student {
	// 학번, 이름, 국어, 영어, 수학에 해당하는 변수 타입, 이름 정의
	// StudentMain 클래스 생성 후 Student 인스턴스를 생성 후 데이터 초기화
	
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	// 생성자 작성 (모든 필드값을 초기화하는 생성자)
	public Student(int no, String name, int kor, int eng, int math, int sum, double avg) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return String.format("%4d\t%4s\t%4d\t%4d\t%4d\t%4d\t%4.2f\n", this.no, this.name, this.kor, this.eng, this.math, this.sum, this.avg);
	}
	
}
