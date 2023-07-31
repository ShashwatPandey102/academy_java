package student;

import static student.util.StudentUtils.nextLineToInteger;

import student.service.StudentService;

// 1. 학생 타입에 대한 기본정의 (변수)
// 2. 학생들 관리를 위한 학생 배열 생성
// 2-1. 등록 기능 일부 구현
// 3. 입력 관련 기능 유틸리티 정의
// 4. 메인의 반복적인 프로그램 운용
// 5. 등록 시 학생 배열의 정확한 위치 지정 (추가변수 사용 : 학생 수)

// 07/28 과제 내용
// 1. 학생 삭제 - 완료
// 2. 정렬 (석차 내림차순) - 완료
// 3. 예외 처리 - 완료
// 3-1. 이름은 한글로만 구성 (2 ~ 4글자 사이) - 완료
// 3-2. 메뉴 선택 시 지정된 숫자만 입력 가능 - 완료
// 3-3. 점수 입력 시 값의 범위를 0 ~ 100 사이의 정수만 지정 - 완료
// 3-4. 숫자를 입력받아야 할 때 문자 입력 시 종료되지 않고 메세지 출력 - 완료
// 3-5. 예외 처리 시 맨 처음으로 가면 됨 - 완료

public class StudentMain {
	public static void main(String[] args) {

		StudentService ss = new StudentService();

		while (true) {

			try {
				int input = nextLineToInteger("1. 조회 / 2. 등록 / 3. 수정 / 4. 삭제 / 5. 석차조회 / 6. 종료");

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
					ss.remove();
					break;
				case 5:
					ss.ranking();
					break;
				case 6:
					System.out.println("종료되었습니다");
					return; // 메인 메서드 종료 (프로그램 종료)
				default:
					throw new RuntimeException("1번부터 6번 사이에서 골라주세요");
				}

			} catch (NumberFormatException e) {
				System.out.println("정수형 숫자로 입력해주세요");

			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
