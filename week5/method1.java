/*
IN this example the method is declared before the main
*/
public class method1 {
    //Declaring a method
    public static int sum(int x, int y, int z){
        return x+y+z;
    }
    public static void main(String[] args){
//providing needed data
        int x=45, y=67, z=34;
//calling method sum
        int s=sum(x,y,z);
        System.out.println("Sum is "+ s);
    }//End of main
}