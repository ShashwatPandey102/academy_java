package _230731;

import java.util.Arrays;

public class StringTest {
	public static void main(String[] args) {

		// indexOf
		String str = "abcdeabcde"; // length() 10

		// indexOf는 발견한 처음 위치의 인덱스를 반환함
		System.out.println(str.indexOf("bc")); // 시작 위치를 따라간다
		System.out.println(str.indexOf("f")); // 못 찾으면 -1이 반환된다

		System.out.println(str.indexOf("b", 3));
		System.out.println(str.indexOf("b", 7)); // 없으므로 -1을 반환

		System.out.println(str.lastIndexOf("a")); // 오른쪽부터 찾으므로 5가 반환
		System.out.println(str.lastIndexOf("a", 4)); // 오른쪽부터 찾는데 4부터 시작하므로 0이 반환

		System.out.println(str.substring(1)); // 1번 인덱스부터 끝까지 자름
		System.out.println(str.substring(1, 3)); // 1번 인덱스부터 3번 인덱스 전까지 자름

		// 3번 인덱스에 있는 문자 반환
		System.out.println(str.charAt(3));

		// 3번 인덱스에 있는 문자열 반환
		System.out.println(str.substring(3, 4));

		System.out.println(str.toUpperCase());
		System.out.println(str.contains("f"));

		System.out.println(str.replace("a", "f"));

		System.out.println(str);

		// str.split의 인자가 비면 전부 한글자로 해서 저장함
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("d")));

//		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=가나다";
//		String url = "https://v.daum.net/v/20230731105402030";
		String url = "https://dict.naver.com/search.dict?dicQuery=%EA%B0%80%EB%82%98&query=%EA%B0%80%EB%82%98&target=dic&ie=utf8&query_utf=&isOnlyViewEE=";
		// 위 URL 문자열을 기반으로 URL의 각 구성요소를 추출해야 한다
		/**
		 * 프로토콜(스키마) : https 
		 * 도메인 : search.naver.com 
		 * 경로 : search.naver 
		 * 파라미터 : where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=가나다 (쿼리스트링이라고도 함)
		 * 
		 * 쿼리스트링 : 5쌍의 키/값 쌍을 출력
		 */

		System.out.println("===============================");

		String protocolSep = "://";
		int protocolSepIdx = url.indexOf(protocolSep);
		String schema = url.substring(0, protocolSepIdx);

		System.out.println(schema);

		int domainStartIdx = protocolSepIdx + 3;
		int domainEndIdx = url.indexOf("/", domainStartIdx);

		String domain = url.substring(domainStartIdx, domainEndIdx);

		System.out.println(domain);

		int routeStartIdx = domainEndIdx;
		int routeEndIdx = url.indexOf("?", routeStartIdx);
		
		// 쿼리스트링이 없는 경우도 있기에 여기에 if문을 추가해준다
		if(routeEndIdx == -1) { // 쿼리스트링이 없는 경우
			String route = url.substring(routeStartIdx);

			System.out.println(route);
			
			System.out.println("파라미터는 없음");
		}else {

			String route = url.substring(routeStartIdx, routeEndIdx);

			System.out.println(route);

			String parameter = url.substring(routeEndIdx + 1);

			System.out.println(parameter);
			
			int queryStartIdx = routeEndIdx + 1;
			int queryCount = 1;
			
			while (true) {
				
				int queryEndIdx = url.indexOf("&", queryStartIdx);
				
				int equalIdx = url.indexOf("=", queryStartIdx);
				
				String parameterKey = url.substring(queryStartIdx, equalIdx);
				String parameterValue = null;
				
				boolean isEnd = false;
				
				if(queryEndIdx != -1) {
					parameterValue = url.substring(equalIdx + 1, queryEndIdx);
					
				}else {
					parameterValue = url.substring(equalIdx + 1);

					isEnd = true;
				}
				
				System.out.println(String.format("파라미터 %d: 키 %s / 값 %s", queryCount, parameterKey, parameterValue));

				if(isEnd) {
					break;
				}
				
				queryCount++;
				queryStartIdx = queryEndIdx + 1;
			}
		}

		
	}
}



