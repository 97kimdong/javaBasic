package sec3;

public class StringBuilderEx1 {
	public static void main(String[] args) {
		String kim ="김동협";
		String lee ="이동협";
		System.out.println(kim+","+lee);
		StringBuilder sb = new StringBuilder();
		sb.append("Java");
		sb.append("Web");
		sb.append("Programming");
		System.out.println(sb);
		
		sb.insert(4, "6"); //특정 위치에 삽입 insert
		System.out.println(sb);
		
		sb.setCharAt(4, '8');	//특정 위치의 문자를 변경
		System.out.println(sb);
		
		sb.replace(8, 20, "Programmer");//특정 번째 문자열들을 바꾸기
		System.out.println(sb);
		
		sb.delete(4, 5);	//특정 범위에 있는 글자들을 삭제
		System.out.println(sb);
		
		System.out.println("글자수 : "+sb.length()); //글자수
		//StringBuilder를 String으로 변환
		String res = sb.toString();
		System.out.println("문자열로 변환된 결과 : "+res);
		
		
	}
}
