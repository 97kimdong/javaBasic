package sec1;

public class IfEx01 {

	public static void main(String[] args) {
		String name = "김동협";
		int kor = 90;
		int eng = 80;
		int mat = 70;
		int tot = kor + eng + mat;
		String pass = "합격";
			if (tot>=270); {
				pass = "불합격";
				System.out.println("합격여부 : "+pass);
				
		if (kor>=90 || eng>=90 || mat>=90 ) {
			System.out.println("우수자");
		}else {
			System.out.println("일반");
		}if (kor>=90 && eng>=90 && mat>=90 ) {
			System.out.println("장학생");
		}else {
			System.out.println("대상아님");
		}System.out.print("학점 : "); {
			System.out.print("A");
			if(tot>=270) {
				System.out.println("+");
			}
			}
		}
	}
}