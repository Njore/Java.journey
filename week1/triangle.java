
 import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        Scanner mytriangle = new Scanner(System.in);
        System.out.println("Enter the base length value");
        short base = mytriangle.nextShort();
        System.out.println("Enter the height of the triangle");
        short height = mytriangle.nextShort();
        int area = (int) (0.5 * base * height);

        System.out.println("The area of the triangle is :\t" + area);

    }
}