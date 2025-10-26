package lab5;
public class Point{
	protected double x;
	protected double y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	protected void setX(double x){
		this.x = x;
	}
	protected void setY(double y){
		this.y = y;
	}
	protected double getX(){return x;}
	protected double getY(){return y;}

	public String toString(){
		return "[ x value = " + x + ", y value = " + y + " ]"; 
	}
}
