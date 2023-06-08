
public class Triangle implements Shape{
	double area;
	Triangle(int h,int b){
		area = 0.5 * h * b;
	}
	public void getArea() {
		System.out.println("area of Triangle : "+area);
	}
}
