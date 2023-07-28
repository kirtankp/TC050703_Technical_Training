package practice;

public class FinallyReturn {

	public static int finall() {
		int a = 5;
		int b = 0;
		try {
			return a/b;
		}catch (ArithmeticException e){
			System.out.println(e);
		}finally {
			System.out.println("this finally block");
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(finall());
	}

}
