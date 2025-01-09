//Q28Explain how to use Scanner class for user input. Discuss
//different methods for taking user input of Scanner class. WAP to
//demonstrate it.


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }
}