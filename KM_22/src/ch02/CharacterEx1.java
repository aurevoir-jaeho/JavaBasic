package ch02;

public class CharacterEx1 {
	public static void main(String[] args) {
		// ASCII Code Exercise1
		char ch1 = 'A';
		System.out.println(ch1); // A
		System.out.println((int) ch1); // 65, 형변환을 할 때에는 (자료형)의 형태로 써야 함 : Casting
		
		char ch2 = 66;
		System.out.println(ch2); // B
		
		int ch3 = 67;
		System.out.println(ch3); // 67
		System.out.println((char)ch3); // C

	}

}
