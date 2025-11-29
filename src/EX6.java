import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("הכנס מספר חיובי, אי-זוגי וגדול מ-3: ");
            n = scanner.nextInt();
        } while (n <= 3 || n % 2 == 0);

        int mid = n / 2;

        for (int i = 0; i <= mid; i++) {

            for (int s = 0; s < mid - i; s++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = mid - 1; i >= 0; i--) {

            for (int s = 0; s < mid - i; s++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
