package student;

// static 메서드 부를 때 앞의 클래스명을 생략할 수 있게 해 줌 (import static 키워드)
import static student.StudentUtils.nextLine;
import static student.StudentUtils.nextLineToInteger;

// 저번에 했던 카드 덱처럼 관리할 것임
// 학생 데이터를 관리하기 위한 클래스
public class StudentService {

	// 학생 배열
	Student[] students = new Student[20];
	int cnt; // 기본값은 0. 등록된 학생 수를 관리하기 위한 변수

	// Create, Read, Update, Delete (CRUD, 데이터 관리에 필요한 활동. 주로 DB에서 사용함)

	// 학생 등록
	void register() {

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
	void list() {
		System.out.println("학번	이름	국어	영어	수학");
		System.out.println("====================================");
		for (int i = 0; i < cnt; i++) { // 등록된 학생 수만큼 반복
			System.out.printf("%4d\t%4s\t%4d\t%4d\t%4d\n", students[i].no, students[i].name, students[i].kor,
					students[i].eng, students[i].math);
		}
	}
}



