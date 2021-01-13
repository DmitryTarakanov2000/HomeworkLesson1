import java.util.Scanner;

public class Hom6 {
    public static void main(String[] args) {

        public static boolean hw6 (int a) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("введите число");
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("отрицательное false");
                return true;
            } else {
                System.out.println("положительное true");
                return false;
            }

        }
    }
}
