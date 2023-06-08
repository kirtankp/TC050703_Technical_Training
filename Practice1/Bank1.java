
public class Bank1 extends RBI{
	Bank1() {
		name = "bank1";
		interest = 2.5;
	}
	@Override
	void display() {
		System.out.println(name+" interest is "+interest);
	}
}
