public class LinearEquation {
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
        return Math.sqrt(Math.pow(x2 - x1, 2) - Math.pow(y2 -y1, 2));
    }

    public double slope() {
        return (y2 - y1) / (x2 - x1);
    }

    public double yIntercept() {
        return y1 - (slope() * x1);
    }

    public String equationOfLine() {
        return "y = " + slope() + "x + " + yIntercept();
    }

    public String toString() {
        String firstPoint = "First point: (" + x1 + "," + y1 + ")";
        String secondPoint = "Second point: (" + x2 + "," + y2 + ")";
        String slope = "Slope of line: " + slope();
        return firstPoint + "\n" + secondPoint + "\n";
    }
}
