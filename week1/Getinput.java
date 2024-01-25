package week1;
import java.util.Scanner;

class Getinput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your student num");
        int stnum=sc.nextInt();
        System.out.println("Enter your first name");
        String name =sc.next();
        System.out.println("Enter your school fees");
        double fee=sc.nextDouble();
        System.out.println("Student number "+stnum+" name "+name+" School Fees "+fee);
        sc.close();
    }
}