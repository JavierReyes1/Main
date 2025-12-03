public abstract class ThreeDShape extends Shape
{
	private double length;
	private double height;
	private double base;
	public ThreeDshape(double length, double height, double base){
	this("ThreeDShape", "White");
	this.lenght = lenght;
	this.height = height;
	this.base = base;	
	}
	public ThreeDShape(String name, String colour, double length, double height, double base)
  	{ 
  		super(name, colour); 
		this.length = lenght;
		this.height = height;
		this.base = base;
  	}
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}
