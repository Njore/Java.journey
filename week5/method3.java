/*
import java.util.Scanner;
  public class method3{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the rankpoints: ");
    double rank = input.nextdouble;
    //calling
    Rankpoints(rank);
}
// An example of a void method
  public static void RankPoints(double points) {
    if (points >= 202.5) {
      System.out.println("Rank:A1");
    }
    else if (points >= 122.4) {
      System.out.println("Rank:A2");
    }
    else {
      System.out.println("Rank:A3");
    }
  }
}
*/
import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rank points: ");
        double rank = input.nextDouble();
        // calling
        RankPoints(rank);
    }

    // An example of a void method
    public static void RankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank: A1");
        } else if (points >= 122.4) {
            System.out.println("Rank: A2");
        } else {
            System.out.println("Rank: A3");
        }
    }
}