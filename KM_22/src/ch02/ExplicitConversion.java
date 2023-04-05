package ch02;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2; // 64비트(8바이트) 실수형 1.2 초기화
		float fNum2 = 0.9F; // 32비트(4바이트) 실수형 0.9 초기화 (default값이 double형이라서 값 뒤에 F붙임)
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 1 + 0 = 1
		int iNum4 = (int)(dNum1 + fNum2); // 1.2 + 0.9 = 2.1 == 2
		System.out.println(iNum3); // 1
		System.out.println(iNum4); // 2
	}
}
