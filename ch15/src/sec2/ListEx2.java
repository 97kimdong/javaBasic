package sec2;

import java.util.Date;
//Vector : List의 종류이며, ArrayList와 동일한 자료구조, 차이점은 쓰레드에 적용하며,
// 하나의 객체 처리가 모두 끝나면, 다른 쓰레드의 객체 처리를 하기 위해 활용

class Board{
	private String subject;
	private String content;
	private String writer;
	private Date regdate;
	public Board(String subject, String content, String writer, Date regdate) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
}
public class ListEx2 {
	public static void main(String[] args) {
		
	}
}
