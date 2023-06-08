
public class Member {
	String name,address;
	int age,phNo,salary;
	
	public void printSalary() {
        System.out.println("Salary: " + salary);
    } 
	
	public Member() {
		name = "Ram";
		address = "Ahmedabad";
		age = 21;
		phNo = 1234567890;
		salary = 500000;
	}
}
