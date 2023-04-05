package ch02;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2; // 64��Ʈ(8����Ʈ) �Ǽ��� 1.2 �ʱ�ȭ
		float fNum2 = 0.9F; // 32��Ʈ(4����Ʈ) �Ǽ��� 0.9 �ʱ�ȭ (default���� double���̶� �� �ڿ� F����)
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 1 + 0 = 1
		int iNum4 = (int)(dNum1 + fNum2); // 1.2 + 0.9 = 2.1 == 2
		System.out.println(iNum3); // 1
		System.out.println(iNum4); // 2
	}
}
