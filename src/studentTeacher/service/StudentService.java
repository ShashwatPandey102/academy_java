package studentTeacher.service;

import static studentTeacher.util.StudentUtils.*;

import java.util.ArrayList;
import java.util.List;

import studentTeacher.vo.Student;

public class StudentService {
	private List<Student> students = new ArrayList<>();
	{
		students.add(new Student(1, "홍길동", 90, 80, 70));
		students.add(new Student(2, "김길동", 80, 70, 60));
		students.add(new Student(3, "이길동", 70, 60, 50));
	}

	public void resister() {
		int id = nextInt("학번을 입력하세요 >");
		if (findBy(id) != null) {
			System.out.println("동일 학번 학생이 존재합니다");
			return;
		}
		String name = nextLine("학생이름을 입력하세요 >");
		if (!chkHangle(name)) {
			throw new RuntimeException("이름은 한글로 구성해야 합니다.");
		}
		int kor = chkRange(nextInt("국어점수를 입력하세요 >"));
		int eng = chkRange(nextInt("영어점수를 입력하세요 >"));
		int mat = chkRange(nextInt("수학점수를 입력하세요 >"));

		students.add(new Student(id, name, kor, eng, mat));
		list();
	}

	public void list() {
		System.out.println("학번  이름  국어  영어  수학  총점  평균");
		System.out.println("=========================================");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}

	// pk를 통한 단일 탐색(현재 소스에서는 index를 반환) >>index대신 학생 인스턴스 반환
	private Student findBy(int id) {
//		Student student  = null; // 
		for (int i = 0; i < students.size(); i++) {
			if (id == students.get(i).getId()) {
				return students.get(i);

			}
		}
		return null;
	}

	public void modify() {
		int id = nextInt("수정할 학생의 학번을 입력 >");
		Student s = findBy(id);
		if (s == null) {
			throw new RuntimeException("찾으려는 학생의 학번이 없습니다.");
		}
		String name = nextLine("학생이름을 입력하세요 >");
		if (!chkHangle(name)) {
			throw new RuntimeException("이름은 한글로 구성해야 합니다.");
		}
		int kor = chkRange(nextInt("국어점수를 입력하세요 >"));
		int eng = chkRange(nextInt("영어점수를 입력하세요 >"));
		int mat = chkRange(nextInt("수학점수를 입력하세요 >"));
		s.setName(name);
		s.setKor(kor);
		s.setEng(eng);
		s.setMat(mat);
	}

	public void delete() {
		int id = nextInt("삭제할 학생의 학번을 입력 >");
		Student s = findBy(id);
		if (s == null) {
			System.out.println("찾으려는 학생의 학번이 없습니다.");
			return;
		}
		students.remove(s);
	}

	public void rank() {
		List<Student> arr = new ArrayList<Student>(students);
		for (int j = 0; j < arr.size() - 1; j++) {
			for (int i = 0; i < arr.size() - 1; i++) {
				if (arr.get(i).total() < arr.get(i + 1).total()) {
					Student tmp = arr.get(i);
					arr.set(i, arr.get(i + 1));
					arr.set(i + 1, tmp);
				}
			}
		}
		System.out.println("학번  이름  국어  영어  수학  총점  평균 ");
		System.out.println("=========================================");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
