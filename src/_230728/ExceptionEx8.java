package _230728;

import java.util.Scanner;

public class ExceptionEx8 {

	public static String userId = "seo";
	public static String userPw = "smg1234";

	public static void main(String[] args) throws RuntimeException {
		
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			System.out.print("아이디 : ");
			String inputId = sc.nextLine();

			System.out.print("비밀번호 : ");
			String inputPw = sc.nextLine();

			if (!userId.equals(inputId)) {
				throw new LoginException("아이디가 올바르지 않습니다");
			} else if (!userPw.equals(inputPw)) {
				throw new LoginException("비밀번호가 올바르지 않습니다");
			} else {
				System.out.println("로그인 성공");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
