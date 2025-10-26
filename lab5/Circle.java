package lab5;
public class Circle extends Point{
	protected double radius;
	public Circle(double x, double y, double radius){
		super(x, y);
		this.radius = radius;	
	}	
	protected void setRadius(double radius){
		this.radius = radius;
	}
	protected double getRadius(){return radius;}
	@Override
	public String toString(){
		return super.toString()	+ "[radius = " + radius + " ] ";
	}
}
