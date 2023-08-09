package task3;
//Calculate the sum of odd numbers from 0 to n. N is the number that the user enters through the scanner.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the above value: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++){
            if (i %2 != 0){
                sum += i;
            }
        }
        System.out.println("The sum of odd the numbers from 0 to n is: " +  sum  + "." );

    }
}
