
public class Account {
	String name;
	int balance;
		
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int b) {
		balance = b;
	}
	
	public void deposit(int amount) {
		balance += amount;
		//System.out.println("New balance: "+balance);
	}
	
	public void widthraw(int amount) {
		if(balance-amount >= 1000) {
			balance -= amount;
			System.out.print(amount+" successfully deducted ");
			//System.out.println("New balance: "+balance);
		}else {
			System.out.print("insufficient ");
		}		
	}
}
