
public class BankClass {
	String name;
	int balance;
	public BankClass() {
		name = "ram";
		balance = 10000;
	}
	
	public BankClass(String s,int b) {
		name = s;
		balance = b;
	}
	
	public void statment() {
		System.out.println("name: "+name+" and balance: "+balance);
	}
}
