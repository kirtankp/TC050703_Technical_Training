package practice;

public class ThrowsExcep {

	public static void check(int n) {  
        if(n%2 != 0) {  
            //throw Arithmetic exception if number is odd  
            throw new ArithmeticException("number is odd");    
        }  
        else {  
            System.out.println("number is even");  
        }  
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(501);
	}

}
