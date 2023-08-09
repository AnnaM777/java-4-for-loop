package task2;

import java.util.Scanner;

//Calculate the sum of numbers from 0 to n. N is the number that the user enters through the scanner.
public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the above value: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of the numbers from 0 to n is: " +  sum + ".");

    }
}
