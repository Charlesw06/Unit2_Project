// Imports Decimal format
import java.text.DecimalFormat;

public class LinearEquation {
    // Sets decimal format to two decimal places
    DecimalFormat twoDForm = new DecimalFormat("#.00");

    // Creates instance variables x1, x2, y1, y2 to represent x-y coordinate values
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    // Constructor that initializes instance variables to corresponding values
    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    // Calculates and returns distance between two points
    public double distance() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Calculates and returns slope of line created by two points
    public double slope() {
        return Double.parseDouble(twoDForm.format(((double) (y2 - y1)) / (x2 - x1)));
    }

    // Calculates and returns y-intercept of line created by two points
    public double yIntercept() {
        return Double.parseDouble(twoDForm.format(y1 - (slope() * x1)));
    }

    // Returns equation of the line created by two points
    public String equationOfLine() {
        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + twoDForm.format(yIntercept());
    }

    // Returns information about the line created between two points
    public String toString() {
        String firstPoint = "First point: (" + x1 + "," + y1 + ")";
        String secondPoint = "Second point: (" + x2 + "," + y2 + ")";
        String slope = "Slope of line: " + twoDForm.format(slope());
        String yIntercept = "Y-Intercept: " + twoDForm.format(yIntercept());
        String lineEquation = "Equation of line: " + equationOfLine();
        String distance = "Distance between points: " + twoDForm.format(distance());
        return firstPoint + "\n" + secondPoint + "\n" + slope + "\n" + yIntercept + "\n" + lineEquation + "\n" + distance;
    }

    // Calculates and returns coordinates corresponding to x-value inputted
    public String newPoint(double userX) {
        double userY = slope() * userX + yIntercept();
        return "(" + twoDForm.format(userX) + "," + twoDForm.format(userY) + ")";
    }
}
