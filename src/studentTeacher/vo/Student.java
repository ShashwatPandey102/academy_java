package studentTeacher.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 클래스 내의 필드, 메서드 생성자 순서지키는게 가독성 높음
// 1. 필드
// 1. 5초기화블럭
// 2.생성자
// 3.getter /setter
// 4. 추가 정의 매서드
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {
	public static void main(String[] args) {
		System.out.println("나는 student 클래스");
		Student student = new Student(1, "김철수", 90, 80, 80);
		System.out.println(student);
		System.out.println(student.toString());
	}

	private int id;
	private String name;
	private int kor;
	private int eng;
	private int mat;

	public int total() {
		return kor + eng + mat;
	}

	public double avg() {
		return total() / 3d;
	}

	public int ranking() {
		return getId();
	}

	public String toString() {
		return String.format("%4d %s %3d %3d %3d %3d %.2f", id, name, kor, eng, mat, total(), avg());
	}
}
