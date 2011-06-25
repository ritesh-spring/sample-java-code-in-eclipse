package ritesh;

class Line {
	public class Point {
		public int x, y;
	}

	public Point getPoint() {
		return new Point();
	}
}

class Triangle {
	public Triangle() {
		Line.Point p = (new Line()).getPoint();
	}
	public static void main(String[] arg)
	{
	Triangle tr=new Triangle();	
	}
}