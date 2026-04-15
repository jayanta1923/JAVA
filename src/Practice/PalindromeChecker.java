package Practice;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int n = 0;
        int rev=0;
        int temp = num;

        while(temp!=0){
            n = temp%10;
            rev = rev*10+n;
            temp= temp/10;
        }

        if(rev == num){
            System.out.println("The number "+num+" is a Palindrome");
        } else{
            System.out.println("The number "+num+" is not a Palindrome");
        }


    }
}
