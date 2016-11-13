import java.io.*;
import java.util.*;

class Calculator {
    public static void main (String args[]){
        Scanner numReader = new Scanner(System.in);
        System.out.print("Enter an integer here. ");
        int num = numReader.nextInt();
        System.out.println(3* num);
    }
}
