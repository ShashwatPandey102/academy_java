package student;

import static student.util.StudentUtils.nextLineToInteger;

import student.service.StudentService;

// 1. 학생 타입에 대한 기본정의 (변수)
// 2. 학생들 관리를 위한 학생 배열 생성
// 2-1. 등록 기능 일부 구현
// 3. 입력 관련 기능 유틸리티 정의
// 4. 메인의 반복적인 프로그램 운용
// 5. 등록 시 학생 배열의 정확한 위치 지정 (추가변수 사용 : 학생 수)

public class StudentMain {
	public static void main(String[] args) {

		StudentService ss = new StudentService();

		while (true) {
			int input = nextLineToInteger("1. 조회 / 2. 등록 / 3. 수정 / 4. 삭제 / 5. 종료");

			switch (input) {
			case 1:
				ss.list();
				break;
			case 2:
				ss.register();
				break;
			case 3:
				ss.modify();
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("종료되었습니다");
				return; // 메인 메소드 종료 (main 메서드에서 return하는 것이기 때문)
			default:
				break;
			}
		}

	}
}
