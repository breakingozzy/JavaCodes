import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int prod = num * i;
            System.out.println(num + " * " + i + " = " + prod);
            sum += prod;
        }

        System.out.println("Sum = " + sum);
    }
}
