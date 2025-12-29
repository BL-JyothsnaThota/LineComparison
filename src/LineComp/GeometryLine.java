package LineComp;

public class GeometryLine {

	public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        
        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(2, 3, 4, 5);

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are NOT equal");
        }
    }
}
