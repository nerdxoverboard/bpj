import java.io.*;
import java.util.*;
import java.lang.*;

class Calculator {
    public static void main (String args[]) throws java.lang.Exception{
        Scanner functionChoice = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println(" ");
        System.out.println("What function would you like to access?");
        System.out.println(" ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println(" ");
        System.out.println(" Enter your selection._");
        int function = functionChoice.nextInt();

        switch (function){
            case 1:{
                    Scanner firstNumber = new Scanner(System.in);
                    System.out.print("Enter the first number in your addition problem._");
                    double firstNum = firstNumber.nextDouble();
                    Scanner secondNumber = new Scanner(System.in);
                    System.out.print("Enter the second number in your addition problem._");
                    double secondNum = secondNumber.nextDouble();
                    double addition = firstNum + secondNum;
                    System.out.println(firstNum + " plus " + secondNum + " equals " + addition);
                    break;
                }
            case 2:{
                    Scanner firstNumber = new Scanner(System.in);
                    System.out.print("Enter the first number in your subtraction problem._");
                    double firstNum = firstNumber.nextDouble();
                    Scanner secondNumber = new Scanner(System.in);
                    System.out.print("Enter the second number in your subtraction problem._");
                    double secondNum = secondNumber.nextDouble();
                    double subtraction = firstNum - secondNum;
                    System.out.println(firstNum + " minus " + secondNum + " equals " + subtraction);
                    break;
                }
            case 3:{
                    Scanner firstNumber = new Scanner(System.in);
                    System.out.print("Enter the first number in your multiplication problem._");
                    double firstNum = firstNumber.nextDouble();
                    Scanner secondNumber = new Scanner(System.in);
                    System.out.print("Enter the second number in your multiplication problem._");
                    double secondNum = secondNumber.nextDouble();
                    double multiplication = firstNum * secondNum;
                    System.out.println(firstNum + " multiplied by " + secondNum + " equals " + multiplication);
                    break;
                }
            case 4:{
                    Scanner firstNumber = new Scanner(System.in);
                    System.out.print("Enter the first number in your division problem._");
                    double firstNum = firstNumber.nextDouble();
                    Scanner secondNumber = new Scanner(System.in);
                    System.out.print("Enter the second number in your division problem._");
                    double secondNum = secondNumber.nextDouble();
                    double division = firstNum / secondNum;
                    System.out.println(firstNum + " minus " + secondNum + " equals " + division);
                    break;
                }
            default :
                System.out.println(" ");
                System.out.println("Invalid selection.");
                System.out.println("Please re-run the program.");
                System.out.println("Make a valid selection.");
                break;
        }
    }
}
