package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println(String.format("%.1f", c.calcArea()));
		System.out.println(t.calcArea());
		System.out.println(r.calcArea());
		System.out.println();
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		System.out.println();
		
		System.out.println("--�߽���ǥ �̵� (x, y�� 5��)");
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
	}
}
