package sec1;

public class Operator1 {

	public static void main(String[] args) {
		//������
		//��������� : +, -, *, /, %
		//���������� : &&, ||, !, &, |, ^
		//�񱳿����� : >, >=, <, <=, ==, !=
		//���Կ����� : =, +=, -=, *=, /= 
		//���������� : ++, --
		//��Ʈ������ : &, |, ^, >>, <<, >>>, <<<(x)
		//�Է� �� ���ϴ� ��(��)�� : ����, ����, ����
		//a = true
		//b = !a; - ����
		
		//a = 20;
		//b = 30;
		//c = a + b; - ����
		
		//�񱳽� ? �� : ���� - ����
		int a = 20;
		int b = 30;
		String pass = a>b ? "a�� �� ũ��" : "b�� �� ũ��"; //����
		System.out.println("�񱳰�� : "+pass);
		boolean c = true;
		System.out.println("c�� �ݴ� : "+(!c)); //����
		int ras = a + b;	//����
		System.out.println("a+b = "+ras);
		//�������� �켱���� : ���� > ��� > �� > ���� > ����
		//a = 30; b = 20; c = 10;
		//a>b && b>c : a�� b���� ũ��, b�� c���� Ŭ �� -> true
		//���������ڿ� ��������ڴ� ���� �ƴϸ�, ���ڰ� �������
		//�񱳿����ڿ� ���������ڴ� true �ƴϸ� false�� �������� ����
		
	}

}