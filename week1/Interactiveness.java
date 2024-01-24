/*
An Interactive program is one that accepts input from and displays output to a user
Scanner class is used to accept input from the user and is located in the java.util package
To use it you must import it into your program
*/

import java.util.Scanner;
public class Interactiveness {//class name should be the name of the file

    public static void main(String[] args) {//master this method
        System.out.println("Enter the value of the length of the rectangle");
        Scanner myinput = new Scanner(System.in);
        short l = myinput.nextShort();
        System.out.println("Enter the value of the width of the rectangle");
        short w = myinput.nextShort();
        int area = l * w;
        int perimeter = 2 * (l + w);

        System.out.println("The area of the rectangle is :\t" + area);
        System.out.println("The area of the rectangle is :\t" + perimeter);
    }
}

