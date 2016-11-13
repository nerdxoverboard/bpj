//Program Name: Number Converter
//Programmer Name: Joseline Vega
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.util.*;
import java.lang.*;
import java.io.*;

public class Converter{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner menuChoice = new Scanner(System.in);
        System.out.println("Number Converter");
        System.out.println("");
        System.out.println("Which number system are you converting from?");
        System.out.println("1 - Decimal - Base 10");
        System.out.println("2 - Binary - Base 2");
        System.out.println("3 - Octal - Base 8");
        System.out.println("4 - Hexadecimal - Base 16");
        System.out.println("");
        System.out.print("Enter Your Selection_ ");
        int menu = menuChoice.nextInt();
        
        switch (menu) {
            case 1:
                {
                    Scanner myNumber = new Scanner(System.in);
                    System.out.print("Enter Your Decimal (Base 10) Number_ ");
                    int myDecimalNumber = myNumber.nextInt();
                    String myDecimalNumberBin = (Integer.toString(myDecimalNumber, 2));
                    String myDecimalNumberOct = (Integer.toString(myDecimalNumber, 8));
                    String myDecimalNumberHex = (Integer.toString(myDecimalNumber, 16));
                    System.out.println("The Decimal Number " + myDecimalNumber + " is equal to the following:");
                    System.out.println("");
                    System.out.println("Binary (Base 2) = " + myDecimalNumberBin);
                    System.out.println("Octal (Base 8) = " + myDecimalNumberOct);
                    System.out.println("Hexadecimal (Base 16) = " + myDecimalNumberHex);
                    break;
                }
            case 2:
                {
                    Scanner myNumber = new Scanner(System.in);
                    System.out.print("Enter Your Binary (Base 2) Number_ ");
                    String myBinaryNum = myNumber.nextLine();
                    int myBinaryNumber = (Integer.parseInt(myBinaryNum, 2));
                    String myBinaryNumberDec = (Integer.toString(myBinaryNumber, 10));
                    String myBinaryNumberOct = (Integer.toString(myBinaryNumber, 8));
                    String myBinaryNumberHex = (Integer.toString(myBinaryNumber, 16));
                    System.out.println("The Binary Number " + myBinaryNumber + " is equal to the following:");
                    System.out.println("");
                    System.out.println("Decimal (Base 10) = " + myBinaryNumberDec);
                    System.out.println("Octal (Base 8) = " + myBinaryNumberOct);
                    System.out.println("Hexadecimal (Base 16) = " + myBinaryNumberHex);
                    break;
                }
            case 3:
                {
                    Scanner myNumber = new Scanner(System.in);
                    System.out.print("Enter Your Octal (Base 8) Number_ ");
                    String myOctalNum = myNumber.nextLine(); 
                    int myOctalNumber = (Integer.parseInt(myOctalNum, 8));
                    String myOctalNumberDec = (Integer.toString(myOctalNumber, 10));
                    String myOctalNumberBin = (Integer.toString(myOctalNumber, 2));
                    String myOctalNumberHex = (Integer.toString(myOctalNumber, 16));
                    System.out.println("The Octal Number " + myOctalNumber + " is equal to the following:");
                    System.out.println("");
                    System.out.println("Decimal (Base 10) = " + myOctalNumberDec);
                    System.out.println("Binary (Base 2) = " + myOctalNumberBin);
                    System.out.println("Hexadecimal (Base 16) = " + myOctalNumberHex);
                    break;
                }
            case 4:
                {
                    Scanner myNumber = new Scanner(System.in);
                    System.out.print("Enter Your Hexadecimal (Base 16) Number_ ");
                    String myHexadecimalNum = myNumber.nextLine(); 
                    int myHexadecimalNumber = (Integer.parseInt(myHexadecimalNum, 16));
                    String myHexadecimalNumberDec = (Integer.toString(myHexadecimalNumber, 10));
                    String myHexadecimalNumberBin = (Integer.toString(myHexadecimalNumber, 2));
                    String myHexadecimalNumberOct = (Integer.toString(myHexadecimalNumber, 8));
                    System.out.println("The Hexadecimal Number " + myHexadecimalNumber + " is equal to the following:");
                    System.out.println("");
                    System.out.println("Decimal (Base 10) = " + myHexadecimalNumberDec);
                    System.out.println("Binary (Base 2) = " + myHexadecimalNumberBin);
                    System.out.println("Octal (Base 8) = " + myHexadecimalNumberOct);
                    break;
                }
            default:
                System.out.println("Invalid Selection");
                break;
        }
    }
}