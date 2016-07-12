package prob5;

public class RectTriangle extends Shape{
	
	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height / 2;
	}

	@Override
	public double getPerimeter() {
		double perimeter;
		perimeter = Math.sqrt((height*height)+(width*width))+ width + height;
		return perimeter;
	}

}
