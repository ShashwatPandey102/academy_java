package student.vo;

// VO (Value Object) 객체

public class Student {
	// 학번, 이름, 국어, 영어, 수학에 해당하는 변수 타입, 이름 정의
	// StudentMain 클래스 생성 후 Student 인스턴스를 생성 후 데이터 초기화
	
	public static void main(String[] args) {
		System.out.println("나는 student 클래스");
		Student student = new Student(1, "김철수", 90, 80, 80);
		System.out.println(student);
	}

	// 자바 빈즈 컨벤션에 따라 멤버 변수는 private 접근 제한자를 가짐
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	// 자바 빈즈 컨벤션에 따라 인자가 없는 기본 생성자를 만듦
	public Student() {

	}

	// 생성자 작성 (모든 필드값을 초기화하는 생성자)
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// getter, setter (getter의 경우 파라미터가 존재하지 않아야 하며, setter의 경우 하나 이상의 파라미터가 존재한다)
	// 그리고 getter의 이름은 get[프로퍼티 이름]이며, setter의 이름은 set[프로퍼티 이름]이다
	// getter의 경우 해당 프로퍼티의 자료형을 반환 타입으로 지정해야 한다.
	// setter의 경우 반환값은 없으므로 void, 파라미터로는 해당 프로퍼티의 자료형으로 지정한다.
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return String.format("%4d\t%4s\t%4d\t%4d\t%4d\t%4d\t%4.2f", this.no, this.name, this.kor, this.eng, this.math,
				this.total(), this.avg());
	}

	// 총점 (총점을 별도로 저장장소에 저장하면 조회할 때마다 연산은 줄겠지만 공간도 차지하고 수정 시에도 계산해야 해서 일일이 연산하기로 함)
	// 자바 빈즈 컨벤션에 따라 멤버 메서드는 public 접근 제한자를 가짐
	public int total() {
		return this.kor + this.eng + this.math;
	}

	public double avg() {
		return this.total() / 3d;
	}

}
