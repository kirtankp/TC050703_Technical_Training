
class A {
	//final method display
	final void display() {
		System.out.println("this is class A");
	}
}
//final class B
final class B extends A {
	//cannot override final method from class A
	//void display() {
	//	System.out.println("this is class B");
	//}
}
//cannot extends the final class
//class C extends B {
//	
//}


public class FinalKeyword {
	public static void main(String[] args) {
		//final variable
		final int a = 10;
		System.out.println("value of a :"+a);
		//The final local variable is cannot re-assigned, now a has fixed value which cannot be changed.
		//a = 20;
		
	}	
}
