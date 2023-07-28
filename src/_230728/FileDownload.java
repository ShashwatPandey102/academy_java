package _230728;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownload {
	public static void main(String[] args) {
		
//		String urlText = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		String urlText = "https://www.daum.net/";
		
		FileOutputStream fos = null; // finally문 안에서 닫기 위해 fos를 밖으로 뺌
		
		// java.net.URL : 네트워크 리소스를 가리키는 URL(Uniform Resource Locator)을 다루기 위한 클래스
		try {
			URL url = new URL(urlText);
			
			// java.io.InputStream : 입력 바이트 스트림을 다루기 위한 추상 클래스. 바이트 스트림은 데이터를 바이트(byte) 단위로 처리하는 스트림을 말함.
			InputStream is = url.openStream(); // Add catch clause to surrounding try (현재 surrounding에 catch 블록을 추가)
			int b = 0;
			// java.io.FileOutputStream : 출력 바이트 스트림을 다루기 위한 클래스
//			fos = new FileOutputStream("다음로고.png");
			fos = new FileOutputStream("다음.html");
			
			// InputStream 객체를 이용해 입력 스트림으로부터 데이터를 읽어오면서 한 바이트씩 읽은 데이터를 FileOutputStream 객체를 사용하여 파일에 출력
			while((b = is.read()) != -1) { // 바이트 스트림이 끝나기 전까지 반복
				fos.write(b);
			}
			
		} catch (MalformedURLException e) {
			System.out.println("url 오탈자 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close(); // 변수 범위 때문에 fos의 선언을 밖으로 빼야함
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









