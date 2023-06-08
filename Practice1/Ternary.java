import java.util.*;

public class Ternary {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = s.nextInt();
		System.out.println("enter b value:");
		int b = s.nextInt();
		int maxSum = (a > b)? a : b;
		System.out.println("max number is "+maxSum);
	}
}
