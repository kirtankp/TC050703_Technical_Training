import java.util.*;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		Account a1 = new Account();
//		a1.setBalance(10000);
//		System.out.println("Current Balance: "+a1.getBalance());
//		a1.widthraw(3000);
//		System.out.println("Current Balance: "+a1.getBalance());
//		a1.deposit(5000);
//		System.out.println("Current Balance: "+a1.getBalance());
		
		Account[] a = new Account[5];
		for(int i=0;i<5;i++) {
			a[i] = new Account();
		}
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter name of user "+(i+1)+": ");
			a[i].setName(s.nextLine());
		}		
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter balance of user "+(i+1)+": ");
			a[i].setBalance(s.nextInt());
		}		
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter amount you want to widthraw from user "+(i+1)+": ");
			a[i].widthraw(s.nextInt());
			System.out.println("from "+a[i].getName());
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Current Balance: "+a[i].getBalance()+" of "+a[i].getName());
		}
	}

}
