import java.util.Scanner;

public class Hom5 {
    public static void main(String[] args)
    { int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        a = scanner.nextInt();
        if (a<=0){
            System.out.println("Отрицательное");

        } else{
            System.out.println("Положительное");
        }

    }
}

