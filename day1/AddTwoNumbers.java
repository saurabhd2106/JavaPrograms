// write a program that prints out the sum of two numbers
// input: 1 2
// output: 3

import java.util.Scanner;   

public class AddTwoNumbers {
    public static void main(String[] args) {
        
        //Scanner is used to take input from the user
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); // 1
        int b = sc.nextInt(); // 2
        
        System.out.println(a + b); // 3

        //Close the scanner at the end of the program to avoid memory leak
        sc.close();
    }
}



