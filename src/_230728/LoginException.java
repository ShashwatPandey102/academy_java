package _230728;

public class LoginException extends RuntimeException {

	// 지금은 그냥 다른 예외처럼 메시지만 던졌지만, 실제로는 여기에 예외 발생 시 해야 하는 일들을 적으면 된다.
	public LoginException(String msg) {
		super(msg);
	}

}
