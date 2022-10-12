import java.text.DecimalFormat;
public class LinearEquation {
    DecimalFormat twoDForm = new DecimalFormat("#.00");
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public double slope() {
        return Math.round((y2 - y1) / (x2 - x1));
    }

    public double yIntercept() {
        return Math.round(y1 - (slope() * x1));
    }

    public String equationOfLine() {
        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + twoDForm.format(yIntercept());
    }

    public String toString() {
        String firstPoint = "First point: (" + x1 + "," + y1 + ")";
        String secondPoint = "Second point: (" + x2 + "," + y2 + ")";
        String slope = "Slope of line: " + twoDForm.format(slope());
        String yIntercept = "Y-Intercept: " + twoDForm.format(yIntercept());
        String lineEquation = "Equation of line: " + equationOfLine();
        String distance = "Distance between points: " + twoDForm.format(distance());
        return firstPoint + "\n" + secondPoint + "\n" + slope + "\n" + yIntercept + "\n" + lineEquation + "\n" + distance;
    }

    public String newPoint(double userX) {
        double userY = slope() * userX + yIntercept();
        return "(" + userX + "," + userY + ")";
    }
}
