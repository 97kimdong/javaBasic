package sec1;

public class Logical1 {

	public static void main(String[] args) {
		//&&, ||, !, &, |, ^
		int a = 30; // 
		int b = 20;	//
		int c = 10;
		
		System.out.println("a�� b�� OR ���� : "+(a & b));
		
		boolean d = true;
		boolean e = true;
		boolean f = false;
		//&&(AND)������ �Է°��� ��� ���� ���� ����� ��
		//�Է�1		�Է�2		���
		//ture		true	true
		//true		false	false
		//false		true	false
		//false		false	false
		
		System.out.println("&& => AND������ ���1 : "+(d && e));
		System.out.println("&& => AND������ ���2 : "+(d && f));
		System.out.println("&& => AND������ ���3 : "+(f && d));
		System.out.println("&& => AND������ ���4 : "+(f && f));
		//||(OR)���� : ��� �ϳ��� �Է��� ���� ������, ��(true)
		//ture		true	true
		//true		false	true
		//false		true	true
		//false		false	false
		System.out.println("|| => AND������ ���1 : "+(d || e));
		System.out.println("|| => AND������ ���2 : "+(d || f));
		System.out.println("|| => AND������ ���3 : "+(f || d));
		System.out.println("|| => AND������ ���4 : "+(f || f));
		//!(not) : �Էµ� ������ true�� false�� false�� true�� �ݴ�� ��ȯ
		//�Է�	���	
		//true false
		//false true
		System.out.println("! => NOT������ ���1 : "+(!d));
		System.out.println("! => NOT������ ���2 : "+(!f));
		
		byte a11 =10;
		float f11 = 2.5f;
		double d11 = 2.5;
		//byte a22 = a11+a11; �����÷ο�
		int i11 = 5 + a11;
		float f22 = 5 + f11;
		double d22 = 5 + d11;
	}

}
