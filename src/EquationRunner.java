import java.util.Scanner;
// Imports scanner utility
public class EquationRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linear Equation calculator.");
        // Welcomes user

        Scanner point1Input = new Scanner(System.in);
        System.out.print("Enter the first x-y coordinate point: ");
        String userPoint1 = point1Input.nextLine();
        // Prompts user using scanner, initializes new String variable to user's input

        int x1 = Integer.parseInt(userPoint1.substring(1, userPoint1.indexOf(",")));
        int y1 = Integer.parseInt(userPoint1.substring(userPoint1.indexOf(",") + 1, userPoint1.length() - 1));
        // Initializes x1 and y1 to corresponding values in user's answer

        Scanner point2Input = new Scanner(System.in);
        System.out.print("Enter the first x-y coordinate point: ");
        String userPoint2 = point2Input.nextLine();
        // Prompts user using scanner, initializes new String variable to user's input

        int x2 = Integer.parseInt(userPoint2.substring(1, userPoint2.indexOf(",")));
        int y2 = Integer.parseInt(userPoint2.substring(userPoint2.indexOf(",") + 1, userPoint2.length() - 1));
        // Initializes x2 and y2 to corresponding values in user's answer

        LinearEquation userEquation = new LinearEquation(x1, x2, y1, y2);
        System.out.println(userEquation.toString());
        // Creates new LinearEquation object and prints out the object's information

        Scanner newX = new Scanner(System.in);
        System.out.print("Enter an x-value: ");
        double userXCord = newX.nextDouble();
        // Prompts user for x-value using scanner, initializes new double variable to user's input

        System.out.println("Solved coordinate point: " + userEquation.newPoint(userXCord));
        // Prints corresponding coordinates to user's x-value
    }
}
