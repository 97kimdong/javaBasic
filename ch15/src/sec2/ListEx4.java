package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	private String uid;
	private String pw;
	private String email;
	private String tel;
	public Member() {}
	public Member(String uid, String pw, String email, String tel) {
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
public class ListEx4 {
	public static void main(String[] args) {
		//ArrayList를 활용하여 다섯 명의 정보를 저장하기
		List<Member> list1 = new ArrayList<Member>();
		Member m1 = new Member("abcde", "12345", "abcde@naver.com", "010-1111-1111");
		list1.add(m1);
		Member m2 = new Member();
		m2.setUid("fghij");
		m2.setPw("12354");
		m2.setEmail("fghij@naver.com");
		m2.setTel("010-9998-1234");
		list1.add(m2);
		Member m3 = new Member("qwert","11111","11111@naver.com","010-1234-1234");
		list1.add(m3);
		Member m4 = new Member("tyui","12345","45687@naver.com","010-7894-5612");
		list1.add(m4);
		Member m5 = new Member();
		m5.setUid("zxcvb");
		m5.setPw("123123");
		m5.setEmail("zxzx@naver.com");
		m5.setTel("010-7878-5885");
		list1.add(m5);
		System.out.println("아이디\t비밀번호\t이메일\t\t전화번호");
		for(Member m : list1) {
			System.out.print(m.getUid()+"\t");
			System.out.print(m.getPw()+"\t");
			System.out.print(m.getEmail()+"\t");
			System.out.print(m.getTel()+"\n");
		}
	}
}
