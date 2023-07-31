package student.exception;

// 사용자 정의 Exception 생성
public class RangeException extends RuntimeException{ // Exception을 하면 던지는 강제성이 있는데 RuntimeException은 강제성이 없음

	public RangeException(int start, int end) {
		super(String.format("값의 범위를 초과했습니다. %d ~ %d 사이의 정수로 입력해주세요.", start, end));
	}
	
}
