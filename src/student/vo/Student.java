package student.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// VO (Value Object) 객체

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	// 학번, 이름, 국어, 영어, 수학에 해당하는 변수 타입, 이름 정의
	// StudentMain 클래스 생성 후 Student 인스턴스를 생성 후 데이터 초기화

	// 자바 빈즈 컨벤션에 따라 멤버 변수는 private 접근 제한자를 가짐
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	@Override
	public String toString() {
		return String.format("%3d\t%3s\t%3d\t%3d\t%3d\t%3d\t%3.2f", this.no, this.name, this.kor, this.eng, this.math,
				this.total(), this.avg());
	}
	
	public String toString2(int rank, int count) {
		return String.format("%3d\t%3s\t%3d\t%3d\t%3d\t%3d\t%3.2f\t%d/%d", this.no, this.name, this.kor, this.eng, this.math,
				this.total(), this.avg(), rank, count);
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

