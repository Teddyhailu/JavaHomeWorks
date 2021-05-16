
public class Polygon {
//Q1
	private int sides;
	private String color;
	//Q2
	public Polygon (int sides, String color) {
		this.sides=sides;
		this.color=color;
		
	}
	public void getSides() {
		System.out.println(this.sides);
	}
		public void getColor() {
		System.out.println(this.color);
		
	}

}