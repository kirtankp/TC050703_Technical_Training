
public class BankInterest {
	public static void main(String[] args) {
		RBI r = new RBI();
		r.display();
		
		RBI u1 = new Bank1();
		//System.out.println(u1.name+" interest is "+u1.interest);
		u1.display();
		RBI u2 = new Bank2();
		//System.out.println(u2.name+" interest is "+u2.interest);
		u2.display();
		
	}
}
