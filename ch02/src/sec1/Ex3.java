package sec1;

public class Ex3 {

	public static void main(String[] args) {
		// �⺻ �ڷ� Ÿ��
		boolean pass = true; //true �Ǵ� flase�� ����
		byte a = 127; // byte = 8bit (-218 ~ 127)
		//byte a =128; --> �����÷ο�� ���� ���� �ȵ�
		//byte b = -129; --> ����÷ο�� ���� ���� �ȵ�
		
		short b = 32767; //2byte (545536����) -> -32768 ~ 32767
		int c =-2147483648; // 4byte (-2147483648 ~2147483648)
		long d = 473343434; // 8byte (2�� 64�� ������)
		
		//�Ǽ� 
		float f = 32434e-3f; //4byte -> 32.434
		double e = 0.0000345;  ///8byte
		//32434e-3 = 0.32434 * 1/1000 = 32.434
		//�ε��Ҽ����� = �Ǽ� = ��ȣ��+������+������
		
		System.out.println("f=" + f);
		
		//����
		char g = 'k' ; //2byte - �����ڵ�� ����ǹǷ�
		char h = '��';

	}

}
