package ch6;

public class Ex15MemberServiceExample {

	public static void main(String[] args) {
		Ex14MemberService Ex14memberService = new Ex14MemberService();
		boolean result = Ex14memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			Ex14memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
