package ch03;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150; // ������ gameScore 150���� �ʱ�ȭ
		
		int lastScore1 = ++gameScore; // lastScore1 = 151, gameScore = 151
		System.out.println(lastScore1); // 151
		
		int lastScore2 = --gameScore; // lastScore2 = 150
		System.out.println(lastScore2); // 150
	} // End of main method
} // end of class
