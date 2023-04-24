import java.io.IOException;
import java.util.Scanner;

public class Entry {

	public static void main(String[] args) throws IOException {

		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the First number:");
			int num1 = sc.nextInt();
			
			System.out.print("Enter the Second number:");
			int num2 = sc.nextInt();
			
			System.out.print("Enter which operation:\n1-Addition\n2-Substract\n3-Multiply\n4-Divide\nUser Choice:");
			int operation = sc.nextInt();
			
			Math m = new Math();
			if (operation == 1) {
				int result = m.add(num1, num2);
				System.out.println("Sum of Two numbers is:" + result);
			}

			else if (operation == 2) {
				int result = m.substract(num1, num2);
				System.out.println("Substraction of Two numbers is:" + result);
			}

			else if (operation == 3) {
				int result = m.multiply(num1, num2);
				System.out.println("Multiplication of Two numbers is:" + result);
			}

			else if (operation == 4) {
				int result = m.divide(num1, num2);
				System.out.println("Divide of Two numbers is:" + result);
			}

	}

}
