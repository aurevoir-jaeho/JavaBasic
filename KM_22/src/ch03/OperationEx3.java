package ch03;

public class OperationEx3 {

	public static void main(String[] args) {
		 int num1 = 10;
		 int i = 2;
		 
		 boolean value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10); // false || true = true
		 System.out.println(value); // true
		 System.out.println(num1); // 20
		 System.out.println(i); // 4
	}
}
