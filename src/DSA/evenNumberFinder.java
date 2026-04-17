package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class evenNumberFinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int a = arr[i];
            if(a%2==0){
                count++;
            }
        }

        System.out.print("There are "+count+" even numbers.");
    }
}
