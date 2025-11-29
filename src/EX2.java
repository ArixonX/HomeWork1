import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("כנס מספר ראשון בסדרה בבקשה");
        int first = scanner.nextInt();

        System.out.println("הכנס את ההפרש בין האיברים בבקשה");
        int diff = scanner.nextInt();

        System.out.println("הכנס את כמות האיברים בסדרה בבקשה");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("קיימת שגיאה: כמות האיברים חייבת להיות מספר שלם וחיובי");
            return;
        }
        System.out.println("הסדרה החשבונית היא:");

        int current = first;

        for (int i = 1; i <= count; i++) {
            System.out.println(current);
            if (i < count-1) {
                System.out.print(" , ");
            }
                current += diff;
            }
        System.out.println();
        }
    }

