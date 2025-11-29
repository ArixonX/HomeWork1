import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("הכנס מספר שלם חיובי: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("שגיאה: יש להזין מספר חיובי בלבד.");
            return;
        }

        if (isFibonaci(n)) {
            System.out.println(n + " הוא מספר פיבונאצ'י.");
        } else {
            System.out.println(n + " אינו מספר פיבונאצ'י.");
        }

        scanner.close();
    }

    public static boolean isFibonaci(int num) {
        if (num == 0 || num == 1) return true;

        int a = 0;
        int b = 1;

        while (b < num) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b == num;
    }
}
