package com.perscholas.java_basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
      /*  Write a program that declares 1 integer variable x, and then assigns 7 to it.
      Write an if statement to print out “Less than 10” if x is less than 10.
      Change x to equal 15 and notice the result (console should not display anything).
       */
        int x;
        x = 7;
        if (x < 10)
            System.out.println("Less than 10");

       /* Write a program that declares 1 integer variable x, and then assigns 7 to it.
       Write an if-else statement that prints out “Less than 10” if x is less than 10 and “Greater than 10” if x is greater than 10.
       Change x to 15 and notice the result.
        */
        int x1;
        x1 = 15;
        if (x1 < 10)
            System.out.println("Less than 10");
        else
            System.out.println("Greater than 10");

        /*Write a program that declares 1 integer variable x, and then assigns 15 to it.
        Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
        “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20”
        if x is greater than or equal to 20. Change x to 50 and notice the result.     */

        int x2;
        x2 = 50;
        if (x2 < 10)

            System.out.println("Less than 10");

        else if (x2 > 10 && x2 < 20)
            System.out.println("Between 10 and 20");

        else if (x2 >= 20)
            System.out.println("Greater than or equal to 20");

        /*Write a program that declares 1 integer variable x, and then assigns 15 to it.
         Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20
          and prints “In range” if between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
         */
        int y;
        y = 5;
        if (y < 10 || y > 20)
            System.out.println("Out of range");
        else if (y >= 10 && y <= 20)
            System.out.println("In Range");

        /* Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60
Use the Scanner class to accept a number score from the user to determine the letter grade.
 Print out “Score out of range.” if the score is less than 0 or greater than 100.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks");

        int M = input.nextInt();

        if (M >= 90 && M <= 100)
            System.out.println("Grade A");
        else if (M >= 80 && M <= 89)
            System.out.println("Grade B");
        else if (M >= 70 && M <= 79)
            System.out.println("Grade C");
        else if (M >= 60 && M <= 69)
            System.out.println("Grade D");
        else if (M < 60)
            System.out.println("Grade F");
        else
            System.out.println("Score Out Of Range");

        /*Write a program that accepts an integer between 1 and 7 from the user.
         Use a switch statement to print out the corresponding weekday.
         Print “Out of range” if the number is less than 1 or greater than 7.
         Don’t forget to include “break” statements in each of your cases.
         */


        Scanner inputWeek = new Scanner(System.in);
        System.out.println("Enter the Number between 1 to 7");

        int day = inputWeek.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Out of range. Enter values only between 1 to 7");
        }


    }
}
