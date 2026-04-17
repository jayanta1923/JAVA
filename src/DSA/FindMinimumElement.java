package DSA;

import java.util.Scanner;

public class FindMinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}