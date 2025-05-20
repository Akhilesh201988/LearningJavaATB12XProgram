package Tasks;
import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: lengths of the sides
        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();

        // Check if the sides form a valid triangle using the triangle inequality theorem
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {

            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }

        } else {
            System.out.println("The input values do not form a valid triangle.");
        }

        scanner.close();
    }
}
