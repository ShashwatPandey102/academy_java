package student.service;

import static student.util.StudentUtils.nextLine;
import static student.util.StudentUtils.nextLineToInteger;

import java.util.ArrayList;
import java.util.List;

import student.exception.RangeException;
import student.vo.Student;

public class StudentService {

//	private Student[] students = new Student[totalCnt];
	private List<Student> students = new ArrayList<>();

	// 인스턴스 초기화 블럭
	{
		students.add(new Student(1, "홍길동", 90, 80, 70));
		students.add(new Student(2, "김길동", 90, 60, 60));
		students.add(new Student(3, "이길동", 95, 85, 75));
	}

	// 학생 등록
	public void register() {

		int no = nextLineToInteger("학번을 입력하세요 > ");

		// 학번이 중복되는지 확인한다
		if (duplicateNo(no)) { // 중복되면 throw
			throw new RuntimeException("학번이 중복됩니다");
		}

		// 입력받음
		String name = inputName();
		int kor = inputScore("국어");
		int eng = inputScore("영어");
		int math = inputScore("수학");

		this.students.add(new Student(no, name, kor, eng, math));
		this.list();
	}

	// 목록 조회
	public void list() {
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("=====================================================");
		for(Student s : this.students) {
			System.out.println(s);
		}
		System.out.println("=====================================================");
	}

	// 학생 수정
	public void modify() {
		int no = nextLineToInteger("수정할 학생의 학번을 입력해주세요");

		Student s = null;

		// 수정할 학생이 존재하는지 확인
		for(Student ss : this.students) {
			if(no == ss.getNo()) {
				s = ss;
				break;
			}
		}

		if (s == null) {
			throw new RuntimeException("찾으려는 학생이 없습니다");
		}

		// 입력받아서 수정함
		s.setName(inputName());
		s.setKor(inputScore("국어"));
		s.setEng(inputScore("영어"));
		s.setMath(inputScore("수학"));

		System.out.println("해당 학생을 수정하였습니다");
		System.out.println(s);
	}

	// 학생 삭제
	public void remove() {
		int no = nextLineToInteger("삭제할 학생의 학번을 입력해주세요");

		Student s = null;
		
		// 삭제할 학생이 존재하는지 확인
		for(Student ss : this.students) {
			if(no == ss.getNo()) {
				s = ss;
				break;
			}
		}

		if (s == null) {
			throw new RuntimeException("찾으려는 학생이 없습니다");
		}

		// 삭제하려는 학생이 있으면 null로 바꾼다
		this.students.remove(s); // 인덱스 말고 그냥 객체로 찾아서 지울 거임

		System.out.println("해당 학생을 삭제하였습니다");
	}

	// 학생 석차 정렬
	public void ranking() {
		List<Student> rankingStudents = new ArrayList<>(); // 일단 ArrayList 복사

		for(Student s : this.students) {
			rankingStudents.add(s);
		}
		
		int rank = 1;

		for (int i = 0; i < rankingStudents.size(); i++) {
			Student leftStudent = rankingStudents.get(i);
			if (leftStudent == null) { // 널포인터 방지
				continue;
			}

			for (int j = i + 1; j < rankingStudents.size(); j++) {
				Student rightStudent = rankingStudents.get(j);
				if (rightStudent == null) { // 널포인터 방지
					continue;
				}

				int leftTotal = leftStudent.total();
				int rightTotal = rightStudent.total();

				if (leftTotal < rightTotal) { // 앞뒤 바꿈
					Student temp = rankingStudents.get(i);
					rankingStudents.set(i, rankingStudents.get(j)); // i에 j 넣음
					rankingStudents.set(j, temp); // j에 i 넣음
				}
			}
		}

		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\t석차\n");
		System.out.println("===========================================================");
		for (Student s : rankingStudents) {
			if (s != null) {
				System.out.println(s.toString(rank, students.size()));
				rank++;
			}
		}
		System.out.println("===========================================================");
	}

	// 점수가 0 ~ 100 사이인지 확인
	private void isValidScore(int start, int end, int score) {
		if(score < start || score > end) {
			throw new RangeException(start, end);
		}
	}

	// 등록, 수정에 공통적으로 들어가는 부분
	private String inputName() {
		String name = nextLine("학생 이름을 입력하세요 > ");
		int nameLen = name.length();
		if (nameLen < 2 || nameLen > 4) {
			throw new RuntimeException("이름은 2 ~ 4글자 완성형 한글로 입력해주세요");
		}

		// 또는 그냥 length 가지고 String.charAt() 써도 됨

		char[] nameChars = name.toCharArray();
		for (char c : nameChars) {
			int nameInt = (int) c;

			if (nameInt < 44032 || nameInt > 55203) {
				throw new RuntimeException("이름은 2 ~ 4글자 완성형 한글로 입력해주세요");
			}
		}

		return name;
	}

	// 점수를 입력함
	private int inputScore(String subject) {
		int score = nextLineToInteger(subject + " 점수를 입력하세요 > ");
		isValidScore(0, 100, score);

		return score;
	}
	
	// 학번이 중복되는지 확인함
	private boolean duplicateNo(int no) {

		for(Student s : this.students) {
			if(s.getNo() == no) {
				return true;
			}
		}
		
		return false;
	}

}
