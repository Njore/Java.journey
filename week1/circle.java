import java.util.Scanner;

public class circle{
    public static void main(String[] args) {
        Scanner mycircle = new Scanner(System.in);
        System.out.println("Enter the radius value");
        short radius= mycircle.nextShort();
        int area = (int) (Math.PI * radius * radius);
        System.out.println("The area of the triangle is :\t" + area);

    }
}