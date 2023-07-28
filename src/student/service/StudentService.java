package student.service;

import static student.util.StudentUtils.nextLine;
import static student.util.StudentUtils.nextLineToInteger;

import java.util.Arrays;

import student.vo.Student;

public class StudentService {

	private int totalCnt = 20;

	private Student[] students = new Student[totalCnt];
//	private int cnt; // 삭제가 나오는 곳부터는 cnt가 크게 의미 없음

	{
		this.students[0] = new Student(1, "홍길동", 90, 80, 70);
		this.students[1] = new Student(2, "김길동", 90, 60, 60);
		this.students[2] = new Student(3, "이길동", 95, 85, 75);
	}

	// 학생 등록
	public void register() {

		int no = nextLineToInteger("학번을 입력하세요 > ");

		// 학번이 중복되는지 확인한다
		if (isExist(no)) { // 중복되면 throw
			throw new RuntimeException("학번이 중복됩니다");
		}

		String name = nextLine("학생 이름을 입력하세요 > ");

		int nameLen = name.length();
		if (nameLen < 2 || nameLen > 4) {
			throw new RuntimeException("이름은 2 ~ 4글자 완성형 한글로 입력해주세요");
		}

		char[] nameChars = name.toCharArray();
		for (char c : nameChars) {
			int nameInt = (int) c;

			if(nameInt < 44032 || nameInt > 55203) {
				throw new RuntimeException("이름은 2 ~ 4글자 완성형 한글로 입력해주세요");
			}
		}

		int kor = nextLineToInteger("국어 점수 입력하세요 > ");
		if(!isValidScore(kor)) {
			throw new RuntimeException("0부터 100 사이의 정수로 입력해주세요");
		}
		int eng = nextLineToInteger("영어 점수 입력하세요 > ");
		if(!isValidScore(eng)) {
			throw new RuntimeException("0부터 100 사이의 정수로 입력해주세요");
		}
		int math = nextLineToInteger("수학 점수 입력하세요 > ");
		if(!isValidScore(math)) {
			throw new RuntimeException("0부터 100 사이의 정수로 입력해주세요");
		}

		// 중간이 비기 때문에 이런 식으로 하면 안 됨
		// 일단 현재 중간이 비는 부분을 찾아야 함
		int minBlankIndex = findBlankIndex();
		if(minBlankIndex == -1) {
			throw new RuntimeException("학생 배열에 빈 공간이 없습니다");
		}
		
		this.students[minBlankIndex] = new Student(no, name, kor, eng, math);
		this.list();
	}

	// 목록 조회
	public void list() {
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("====================================================");
		for (int i = 0; i < totalCnt; i++) {
			if(students[i] != null) {
				System.out.println(students[i]);
			}
		}
	}

	// 학생 수정
	public void modify() {
		int no = nextLineToInteger("수정할 학생의 학번을 입력해주세요");

		Student s = null;

		// 삭제하면 array 특성상 중간이 비기에 totalCnt로 처리한다
		for (int i = 0; i < totalCnt; i++) {
			if(students[i] != null) { // 널포인터 방지
				if (no == students[i].getNo()) {
					s = students[i];
					break;
				}
			}
		}

		if (s == null) {
			throw new RuntimeException("찾으려는 학생이 없습니다");
		}

		// 수정하려는 학생이 있으면

		String name = nextLine("학생 이름을 입력하세요 > ");
		int nameLen = name.length();
		if (nameLen < 2 || nameLen > 4) {
			throw new RuntimeException("이름은 2 ~ 4글자 완성형 한글로 입력해주세요");
		}

		char[] nameChars = name.toCharArray();
		for (char c : nameChars) {
			int nameInt = (int) c;

			if(nameInt < 44032 || nameInt > 55203) {
				throw new RuntimeException("이름은 2 ~ 4글자 완성형 한글로 입력해주세요");
			}
		}
		
		int kor = nextLineToInteger("국어 점수 입력하세요 > ");
		if(!isValidScore(kor)) {
			throw new RuntimeException("0부터 100 사이의 정수로 입력해주세요");
		}
		int eng = nextLineToInteger("영어 점수 입력하세요 > ");
		if(!isValidScore(eng)) {
			throw new RuntimeException("0부터 100 사이의 정수로 입력해주세요");
		}
		int math = nextLineToInteger("수학 점수 입력하세요 > ");
		if(!isValidScore(math)) {
			throw new RuntimeException("0부터 100 사이의 정수로 입력해주세요");
		}

		s.setName(name);
		s.setKor(kor);
		s.setEng(eng);
		s.setMath(math);

		System.out.println("해당 학생을 수정하였습니다");
		System.out.println(s);
	}

	// 학생 삭제
	public void delete() {
		int no = nextLineToInteger("삭제할 학생의 학번을 입력해주세요");
		int delNo = -1; // 삭제할 학생의 인덱스

		Student s = null;

		for (int i = 0; i < totalCnt; i++) {
			if(students[i] != null) { // 널포인터 방지
				if (no == students[i].getNo()) {
					s = students[i];
					delNo = i;
					break;
				}
			}
		}

		if (s == null) {
			throw new RuntimeException("찾으려는 학생이 없습니다");
		}
		
		// 삭제하려는 학생이 있으면 null로 바꾼다
		this.students[delNo] = null;

		System.out.println("해당 학생을 삭제하였습니다");
	}
	
	// 학생 석차 정렬
	public void ranking() {
		// 버블 정렬 : 처음부터 끝까지 앞뒤로 비교하면서 작은 걸 뒤로 놓음. 그걸 n^2회 함)
		
		Student[] rankingStudents = Arrays.copyOf(students, totalCnt); // 그대로 복사
		int rank = 1;
		
		for (int i = 0; i < rankingStudents.length; i++) {
			if(rankingStudents[i] == null) { // 널포인터 방지
				continue;
			}
			for (int j = i + 1; j < rankingStudents.length; j++) {
				if(rankingStudents[j] == null) { // 널포인터 방지
					continue;
				}
				int leftTotal = rankingStudents[i].getKor() + rankingStudents[i].getEng() + rankingStudents[i].getMath();
				int rightTotal = rankingStudents[j].getKor() + rankingStudents[j].getEng() + rankingStudents[j].getMath();
				
				if(leftTotal < rightTotal) { // 앞뒤 바꿈
					Student temp = rankingStudents[i];
					rankingStudents[i] = rankingStudents[j];
					rankingStudents[j] = temp;
				}
			}
		}
		
		// 전체 학생 수를 셈 (석차용)
		int studentCount = countStudent();

		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\t석차\n");
		for(Student s : rankingStudents) {
			if(s != null) {
				System.out.println(s.toString2(rank, studentCount));
				rank++;
			}
		}
	}

	// 등록하려는 학번이 이미 존재하는지 확인 (학번은 Primary값)
	public boolean isExist(int no) {

		for (int i = 0; i < totalCnt; i++) {
			if (students[i] != null) { // 널포인터 방지
				if (no == students[i].getNo()) {
					return true;
				}
			}
		}

		return false;
	}
	
	// 점수가 0 ~ 100 사이인지 확인
	public boolean isValidScore(int score) {
		if(score < 0 || score > 100) {
			return false;
		}
		
		return true;
	}
	
	// 학생 배열에서 빈 공간 중 가장 작은 값을 찾는다
	public int findBlankIndex() {
		for (int i = 0; i < totalCnt; i++) {
			if(this.students[i] == null) {
				return i;
			}
		}
		
		// 여기까지 없으면 -1을 출력한다
		return -1;
	}
	
	public int	countStudent() {
		int cnt = 0;
		
		for (int i = 0; i < totalCnt; i++) {
			if(this.students[i] != null) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
}










