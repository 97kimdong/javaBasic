package ch6;

public class MemberEx {

	public static void main(String[] args) {
		Ex13Member user1 = new Ex13Member("홍길동", "hong");
		Ex13Member user2 = new Ex13Member("강자바", "java");
		System.out.println(user1.name+user1.id);
		System.out.println(user2.name+user2.id);

	}

}
