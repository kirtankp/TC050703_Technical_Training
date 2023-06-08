
public class Bank2 extends RBI{
	Bank2() {
		name = "bank2";
		interest = 4.5;
	}
	@Override
	void display() {
		System.out.println(name+" interest is "+interest);
	}
}
