//The volume is equal to mass divided by density
import java.util.Scanner;
public class mass_density_vol{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mass: ");
        float m = input.nextFloat();
        System.out.println("Enter the density: ");
        float den = input.nextFloat();
        float volume = (m/den);
        System.out.println("The volume of the object is:" + volume );
    }
}