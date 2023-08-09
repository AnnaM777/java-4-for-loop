package task4;

import java.util.Scanner;

//The athlete planned to run a certain number of kilometers during the 10 days of preparation on the first day,
//  and every next day 10% more than the previous day's norm.
//Show for each day of preparation how many athletes should run and how much they will run in total during the preparation.
public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the km run on the first day: ");
        double km = input.nextDouble();
        double sum = km; //10

        for (int i = 1; i<=10; i++) {
            System.out.println(i + ". day the athlete has to run " + km);
            km = km + km * 10/100.0;
            sum = sum + km;
        }
        System.out.println("Total " + sum + "km.");


    }
}
