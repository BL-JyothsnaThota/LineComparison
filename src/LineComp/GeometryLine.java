package LineComp;

public class GeometryLine {

	public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Line line1 = new Line(2, 3, 5, 7);
        double length = line1.calculateLength();

        System.out.println("Length of the line: " + length);
   
    }
}
