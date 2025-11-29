import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("הכנס את a: ");
        double a = scanner.nextDouble();

        System.out.print("הכנס את b: ");
        double b = scanner.nextDouble();

        System.out.print("הכנס את c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("זה לא משוואה ריבועית (a לא יכול להיות 0).");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                // שני פתרונות
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("נמצאו שני פתרונות למשוואה הריבועית:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            } else if (delta == 0) {
                // פתרון יחיד
                double x = -b / (2 * a);

                System.out.println("נמצא פתרון אחד בלבד למשוואה הריבועית:");
                System.out.println("x = " + x);

            } else {
                System.out.println("לא נמצא פתרון ממשי עבור המשוואה הריבועית.");
            }
        }

    }
}
