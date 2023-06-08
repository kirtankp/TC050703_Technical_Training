
public class Rectangle implements Shape{
	int area;
	Rectangle(int l,int b){
		area = l*b;
	}
	public void getArea() {
		System.out.println("area of Rectangle : "+area);
	}
}
