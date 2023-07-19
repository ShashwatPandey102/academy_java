package _230718;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String vowels = "aeiouy";
			
			String result = "";
			
			while(true) {
				int n = Integer.parseInt(br.readLine());
				
				if(n == 0) {
					break;
				}
				
				int max = 0; // 각 단어의 이중모음쌍의 최대 개수
				String res = "";

				// 각 테스트 케이스에서 이중 모음쌍이 많은 단어를 출력한다
				
				for (int i = 0; i < n; i++) {
					String str = br.readLine();
					
					int count = 0; // 현재 단어의 이중 모음쌍 수
					
					for (int j = 0; j < str.length() - 1; j++) {
						if(str.charAt(j) == str.charAt(j + 1) && vowels.contains(String.valueOf(str.charAt(j)))) {
							count++;
							j++;
						}
					}
					
					if(count > max) {
						max = count;
						res = str;
					}
					
	                if(res.isEmpty()){
	                    res = str;
	                }
					
				}
				
				result += res + "\n";
			}
			
			bw.write(result);
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
