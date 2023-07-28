package _230728;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class FileDownload2 {
	public static void main(String[] args) throws Exception {

		String urlText = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";

		FileOutputStream fos = null;

		URL url = new URL(urlText);

		InputStream is = url.openStream();
		int b = 0;
		int cnt = 0;
		fos = new FileOutputStream("다음로고.png");

		while ((b = is.read()) != -1) {
			cnt++;
			fos.write(b);
		}
		
		System.out.println("바이트 수 : " + cnt);

		fos.close();
	}
}
