package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        exerciseOne();
//        exerciseTwo();
//        exerciseThree();
//        exerciseFour();
//        exerciseFive();
//        exerciseSix();
//        execriseSeven();
        exerciseEight();
    }
    static void exerciseEight(){
//        Objective: find the smallest number in an array while also accounting for negative integers.

        Scanner userInput = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        // Initially I used Integer.MIN_VALUE, I'd thought that I would compare to see if a number was less
        int smallest = Integer.MAX_VALUE;

        // First I'll ask the user for their user input before storing it into the array;
        num1 = userInput.nextInt();
        num2 = userInput.nextInt();
        num3 = userInput.nextInt();
//       Got frustrated and decided to get help....
/*
   My prompt:
      "I'm doing a code warmup: the goal is to attempt to find the smallest number in an array that also accounts for negative values. Until I solve the problem, do not provide any suggestions outside of the following criteria:
         * relating to math (AH! Realizing I gave myself the answer!!)
         * relating to scope"

   The response:
      Good warmup. Before you start writing code, think about this:
         Math hint:
            What is the largest possible number JavaScript can represent?
            If you knew that number, and you started there, what would happen mathematically every time you compared it against any value in the array
            — including negative ones?

*/

        int[] numberArray = {num1, num2, num3};
        for(int i = 0; i < numberArray.length; i++){
            if(smallest > numberArray[i]){
                smallest = numberArray[i];

            }
        }
// In conclusion: That was pretty hard!
// Apparently I'm supposed to use the max value INSTEAD of the min value,
// mathematically I was way overcomplicating it by trying to compare array values to the min value!
// I got some more practice to do!


        System.out.println(smallest);

    }
}

















