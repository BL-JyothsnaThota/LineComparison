package LineComp;

public class GeometryLine {

	public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        
        Line line1 = new Line(1, 1, 4, 5);
        Line line2 = new Line(2, 2, 6, 7);

        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is smaller than Line 2");
        }
    }
}
