/*
 * Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat*/
public class Employee {
	String name;
	int year;
	String address;
	
	public Employee(String s,int y,String add) {
		name = s;
		year = y;
		address = add;
	}
	
	public void display() {
		System.out.println(name+" "+year+" "+address);
	}
}
