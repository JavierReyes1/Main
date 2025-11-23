public class Rectangle extends TwoDShape{
		private double length;
		private double width;

		public Rectangle(String name, String colour, double length, double width){
				super(name, colour);
				this.length = length;
				this.width = width;
		}
		public double area(){
				return length * width;
		}
}
