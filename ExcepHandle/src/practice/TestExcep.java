package practice;

public class TestExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int a,b;
		      a = 12;
		      b = 5;
		      System.out.println(a/b);
		}catch(ArithmeticException ar) {
				System.out.println("Arithmetic " + ar.getMessage());
		}catch(Exception e) {
				System.out.println("Number can not be" +  e.getMessage());
		}	
	}

}
