package student;

public class Student {
	// 학번, 이름, 국어, 영어, 수학에 해당하는 변수 타입, 이름 정의
	// StudentMain 클래스 생성 후 Student 인스턴스를 생성 후 데이터 초기화
	
	int no;
	String name;
	int kor;
	int eng;
	int math;
	
	// 생성자 작성 (모든 필드값을 초기화하는 생성자)
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return String.format("%4d\t%4s\t%4d\t%4d\t%4d\t%4d\t%4.2f\n", this.no, this.name, this.kor, this.eng, this.math, this.total(), this.avg());
	}
	
	// 총점 (총점을 별도로 저장장소에 저장하면 조회할 때마다 연산은 줄겠지만 공간도 차지하고 수정 시에도 계산해야 해서 일일이 연산하기로 함)
	public int total() {
		return this.kor + this.eng + this.math;
	}
	
	public double avg() {
		return this.total() / 3d;
	}
	
}
