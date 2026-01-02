package LineComp;

public class LineComparison {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        Point p3 = new Point(2, 3);
        Point p4 = new Point(5, 7);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        System.out.println("Length of Line 1: " + line1.length());
        System.out.println("Length of Line 2: " + line2.length());

        // Equality check
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are NOT equal");
        }

        // Comparison
        int result = line1.compareTo(line2);
        if (result > 0) {
            System.out.println("Line 1 is greater");
        } else if (result < 0) {
            System.out.println("Line 1 is smaller");
        } else {
            System.out.println("Both lines are equal");
        }
    }
}
