import java.io.*;
import java.util.*;

class FullName {
    public static void main(String[] args) {
        Scanner firstName = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String first = firstName.nextLine();
        Scanner lastName = new Scanner(System.in);
        System.out.print("What is your last name? ");
        String last = lastName.nextLine();
        String together = first + " " + last;
        System.out.print("Your full name is " + together + ". ");
        //testing since push is not working
    }
}