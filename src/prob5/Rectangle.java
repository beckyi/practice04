package prob5;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super(4);
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
	public double  getArea() {
		return width * height;
	}

	@Override
	public double  getPerimeter() {
		return 2*(width+height);
	}

	@Override
	public void resize(double rate) {
		width = width * rate;
		height = height * rate;
	}
}
