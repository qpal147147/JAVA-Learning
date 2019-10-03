import java.util.*;
 
class Test {
	public static void main(String[] args) {
		Point p1 = new Point(5,6);
		Point p2 = new Point(5,6);
		Point p3 = new Point(6,7);
		System.out.println("p1 = p2: " + p1.equals(p2));
		System.out.print("p1 = p3: " + p1.equals(p3));
	}
}
class Point{
	int x,y;
 
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "[" + this.x + "," + this.y + "]";
	}
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			return (this.x == p.x) && (this.y == p.y); 
		}
		return false;
	}
}
/*
stdout
p1 = p2: true
p1 = p3: false
*/