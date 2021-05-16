
public class MainPolygon {

	public static void main(String[] args) {
		//Q1,3
		Polygon triangle = new Polygon (3,"Red");
		Polygon rectangle = new Polygon(4,"White");
		Polygon polygon = new Polygon(8,"Blue");
		//Q3
		triangle.getSides();
		triangle.getColor();
		
		rectangle.getSides();
		rectangle.getColor();
		
		polygon.getSides();
		polygon.getColor();
	//Q5
		ThreeDimentaional threeD = new ThreeDimentaional(4, "Black" , 8);
		
		threeD.getSides();
		threeD.getColor();
		threeD.getHeight();
		}

	}



