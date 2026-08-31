import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 10; i++) {
            int val = arr[i];
            sum += val;

            if (val > max) max = val;
            if (val < min) min = val;

            if (val % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double avg = (double) sum / 10;

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
