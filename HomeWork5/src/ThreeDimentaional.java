
public class ThreeDimentaional extends Polygon {
	
	private int  height;
	
	public ThreeDimentaional(int sides, String color, int height) {
		super(sides, color);
		this.height = height;
}

	public void getHeight() {
		System.out.println(this.height);
	}
}
