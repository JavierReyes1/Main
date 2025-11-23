public class Triangle extends TwoDShape{
		private double base;
		private double height;
		public Triangle(String name, String colour, double base, double height){
				super(name, colour);
				this.base = base;
				this.height = height;
		}
		public double area(){
				return 0.5 * base* height;
		}

}
