public class EX7 {
    public static void main(String[] args) {

        System.out.println("המספרים הנרקיסיסטיים עד 1000:");

        for (int num = 1; num <= 1000; num++) {
            if (isNarcissistic(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isNarcissistic(int n) {

        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            int powerNum = 1;
            for (int i = 0; i < digits; i++) {
                powerNum *= digit;
            }

            sum += powerNum;
            temp /= 10;
        }

        return sum == n;
    }
}
