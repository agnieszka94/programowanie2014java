package pl.edu.uj.tcs.programowanie16.moreoncollections;
/**
 * 
 * A class with a number of equals definitions all lacking at some fronts.
 * 
 * @author kozik
 *
 */
public class Class06IncorrectEqualsAttempts {

	public enum Color {

		RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
	}

	public static class Point {

		private final int x;
		private final int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public boolean equals1(Object o) {
			if (!(o instanceof Point)) {
				return false;
			}
			Point p = (Point) o;
			return p.x == x && p.y == y;
		}

		public boolean equals2(Object o) {
			if (o == null || o.getClass() != getClass()) {
				return false;
			}
			Point p = (Point) o;
			return p.x == x && p.y == y;
		}

		@Override
		public int hashCode() {
			return 31 * x + y;
		}
	}

	public static class ColorPoint extends Point {

		private final Color color;

		public ColorPoint(int x, int y, Color color) {
			super(x, y);
			this.color = color;
		}

		public boolean equals1(Object o) {
			if (!(o instanceof ColorPoint)) {
				return false;
			}
			return super.equals1(o) && ((ColorPoint) o).color == color;
		}

		public boolean equals2(Object o) {
			if (!(o instanceof Point)) {
				return false;
			}
			if (!(o instanceof ColorPoint)) {
				return  ((Point) o).equals1(this);
			}
			return super.equals1(o) && ((ColorPoint) o).color == color;
		}
	}

}
