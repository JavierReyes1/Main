package lab5;
public class MyFirstCircle{
	public static void main(String[]args){
		Point myPoint = new Point(10,20);
		Circle myCircle = new Circle(15,30,5);
		System.out.println("Point details: " + myPoint.toString());
		System.out.println("Circle details: " + myCircle.toString());
	}
}
