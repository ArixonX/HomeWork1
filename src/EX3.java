import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("הכנס מספר שלם חיובי: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("שגיאה: מספר חייב להיות חיובי בלבד");
            return;
        }

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("סכום הספרות הוא: " + sum);

    }
}
