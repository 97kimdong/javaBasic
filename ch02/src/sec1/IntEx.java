package sec1;

public class IntEx {

	public static void main(String[] args) {
		int i1 =32;
		int i2 =0b010111; // 0b�� �����ϸ� 2���� -> 10111 => 23
		int i3 =0342;     // 0���� �����ϸ� 8���� -> 3421 => 226
		int i4 =0x3f;     // 0x�� �����ϸ� 16���� -> 3f => 63
		System.out.println("2���� 10111:" +i2);
		System.out.println("8���� 342 : " + i3);
		System.out.println("16���� 3f : " + i4);
		
		//short s1 = i1; //�Ұ���
		//long I1 = i1; //����
		//byte b1 i1; // �Ұ���
		//8������ Ȱ���ϴ� �о� -���Ѻο�
		//2���� -�ý��� ����
		//16���� -�޸��� �ּ�

	}

}
