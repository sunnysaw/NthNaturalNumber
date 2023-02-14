import java.util.Scanner;
/*
Question : Write a program to print Nth natural number.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print Nth number :" );
        int a = sc.nextInt();
        System.out.println("Printing the result :");
        int b =0;
        while (b <= a){
            System.out.print(" " + b);
            b++;
        }
    }
}