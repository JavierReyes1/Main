public class Cylinder extends ThreeDShape{
		private double radius;
		private double height;
		public Cylinder(String name, String colour, double radius, double height){
				super(name, colour);
				this.radius = radius;
		}
		public double volume(){
				return Math.PI * (radius * radius) * height;
		}
		public double area(){
				return (2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius));
		}
}
