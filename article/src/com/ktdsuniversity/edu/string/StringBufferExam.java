package com.ktdsuniversity.edu.string;

public class StringBufferExam {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("asdasdasdasdaffasd");
		sb.append("asdasdasdasdaffasd");
		sb.append("asdasdasdasdaffasd");
		sb.append("asdasdasdasdaffasd");
		sb.append("asdasdasdasdaffasd");
		sb.append("asdasdasdasdaffasd");
		sb.append("asdasdasdasdaffasd");
		sb.append("asdasdasdasdaffasd");
		sb.append("asdasdasdasdaffasd");
		
		String str = sb.toString();
		
		System.out.println(sb);
		// 인스턴스를 출력하면 타입@ 이렇게 나오는데 결과가 그대로 출력
		System.out.println(str);
		
		StringBuffer longString = new StringBuffer();
//		for(int i = 0; i<100; i++) {
//			longString.append("asfgafasfgaqweqtr");
//		}
		appendString(longString);
		String resultString = longString.toString();
		System.out.println("<<" + resultString);
	}
	
	public static void appendString(StringBuffer buffer) {
		buffer.append("123123");
	}

}
