package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[4];

        System.out.println("The first array contains : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i=0;i<arr2.length;i++){
            System.out.print("Enter number : ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("The second array contains : ");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}