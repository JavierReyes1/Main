public class Rectangle{
	private int length;
	private int width;

	public Rectangle(int length, int width){
		if (length == 0) {
			length = 1;
		}else if(length < 1 || length > 40){
			throw new IllegalArgumentException("Enter a valid number.");
		}
		this.length = length;

		if(width == 0){
			width = 1;
		}else if(width < 1 || width > 40){
			throw new IllegalArgumentException("Enter a valid number.");
		}this.width = width;
	}

	public Rectangle(){
		this.length = 1;
		this.width = 1;
	}

	public int getLength(){return length;}
	public int getWidth(){return width;}
	public int getPerimeter(){return (length * 2) + (width * 2);}
	public int getArea(){return length * width;}

	public void setLength(int length){
		if(length < 1 || length > 40){
			throw new IllegalArgumentException("Enter a valid number.");
		}
		this.length = length;
	}

	public void setWidth(int width){
		if(width < 1 || width > 40){
			throw new IllegalArgumentException("Enter a valid number.");
		}this.width = width;
	}

	public void printRectangle(int length, int width) {
	    for (int row = 0; row < length; row++) {
	        for (int col = 0; col < width; col++) {
	            if (row == 0 || row == length - 1 || col == 0 || col == width - 1) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}


	@Override
	public String toString(){
		return "Rectangle [Length = " + getLength() + ", Width = " + getWidth() + ", Perimeter = " + getPerimeter() + ", Area = " + getArea() + " ]";
	}
}