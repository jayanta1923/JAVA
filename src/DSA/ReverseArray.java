package DSA;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int i = 0, j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.print("Reversed array: ");
        for(int k = 0; k < 5; k++){
            System.out.print(arr[k] + " ");
        }
    }
}