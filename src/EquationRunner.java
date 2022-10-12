import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linear Equation calculator.");

        Scanner point1Input = new Scanner(System.in);
        System.out.print("Enter the first x-y coordinate point: ");
        String userPoint1 = point1Input.nextLine();

        int x1 = Integer.parseInt(userPoint1.substring(1, userPoint1.indexOf(",")));
        int y1 = Integer.parseInt(userPoint1.substring(userPoint1.indexOf(",") + 1, userPoint1.length() - 1));

        Scanner point2Input = new Scanner(System.in);
        System.out.print("Enter the first x-y coordinate point: ");
        String userPoint2 = point2Input.nextLine();

        int x2 = Integer.parseInt(userPoint2.substring(1, userPoint2.indexOf(",")));
        int y2 = Integer.parseInt(userPoint2.substring(userPoint2.indexOf(",") + 1, userPoint2.length() - 1));

        LinearEquation userEquation = new LinearEquation(x1, x2, y1, y2);
        System.out.println(userEquation.toString());

        Scanner newX = new Scanner(System.in);
        System.out.print("Enter an x-value: ");
        double userXCord = newX.nextDouble();

        System.out.println("Solved coordinate point: " + userEquation.newPoint(userXCord));
    }
}
