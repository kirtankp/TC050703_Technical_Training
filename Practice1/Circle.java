
public class Circle implements Shape{
	double area;
	Circle(int r){
		area = 4*3.14*r;
	}
	public void getArea() {
		System.out.println("area of Circle : "+area);
	}
}
