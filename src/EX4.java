import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("הכנס מספר חיובי N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("שגיאה: N חייב להיות מספר שלם חיובי.");
            return;
        }

        int count = 0;
        int num = 2;

        System.out.print("המספרים הראשוניים הראשונים הם: ");

        while (count < N) {
            if (isPrimeNum(num)) {
                System.out.print(num);
                if (count < N - 1) System.out.print(", ");
                count++;
            }
            num++;
        }

    }

    public static boolean isPrimeNum(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
