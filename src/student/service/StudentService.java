package student.service;

import static student.util.StudentUtils.nextLine;
import static student.util.StudentUtils.nextLineToInteger;

import student.vo.Student;

// 저번에 했던 카드 덱처럼 관리할 것임
// 학생 데이터를 관리하기 위한 서비스 클래스
public class StudentService {

	// 학생 배열
	private Student[] students = new Student[20];
	private int cnt; // 기본값은 0. 등록된 학생 수를 관리하기 위한 변수

	// 인스턴스 초기화 블록 (테스트를 위해 여기서 미리 students 배열에 학생 몇 개를 넣음)
	{
		this.students[cnt++] = new Student(1, "홍길동", 90, 80, 70);
		this.students[cnt++] = new Student(2, "김길동", 90, 60, 60);
		this.students[cnt++] = new Student(3, "이길동", 95, 85, 75);
	}

	// 학생 등록
	// Create, Read, Update, Delete (CRUD, 데이터 관리에 필요한 활동. 주로 DB에서 사용함)
	public void register() {

		int no = nextLineToInteger("학번을 입력하세요 > ");
		String name = nextLine("학생 이름을 입력하세요 > ");
		int kor = nextLineToInteger("국어 점수 입력하세요 > ");
		int eng = nextLineToInteger("영어 점수 입력하세요 > ");
		int math = nextLineToInteger("수학 점수 입력하세요 > ");

		this.students[cnt] = new Student(no, name, kor, eng, math);
		cnt++;
		this.list();
	}

	// 목록 조회
	public void list() {
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("====================================================");
		for (int i = 0; i < cnt; i++) { // 등록된 학생 수만큼 반복
			System.out.println(students[i]);
			// toString을 재정의했기에 아래처럼 할 필요가 없음
//			System.out.println(students[i].getNo());
//			System.out.println(students[i].getName());
//			System.out.println(students[i].getKor());
//			System.out.println(students[i].getEng());
//			System.out.println(students[i].getMath());
		}
	}

	// 학생 수정
	public void modify() {
		// 수정할 학생의 학번을 입력받는다 인덱스 0부터
		int no = nextLineToInteger("수정할 학생의 학번을 입력해주세요");

		Student s = null; // 학생 클래스를 null로 선언함

		// 배열을 순회하면서 해당 학생이 있는지 확인한다.
		for (int i = 0; i < cnt; i++) {
			if (no == students[i].getNo()) { // 해당 학번을 갖고 있는 학생이 있음
				s = students[i]; // 있으면 해당 학생을 아까 만든 객체에 넣음
				break;
			}
		}

		if (s == null) { // 학생이 없는 경우
			System.out.println("찾으려는 학생이 없습니다");
			return; // 메서드를 탈출함
		}

		// 학생이 있는 경우
		String name = nextLine("학생 이름을 입력하세요 > ");
		int kor = nextLineToInteger("국어 점수 입력하세요 > ");
		int eng = nextLineToInteger("영어 점수 입력하세요 > ");
		int math = nextLineToInteger("수학 점수 입력하세요 > ");

		s.setName(name);
		s.setKor(kor);
		s.setEng(eng);
		s.setMath(math);

		System.out.println(s); // 수정한 걸 확인하는 용도로 출력
	}
}







