/*
In this example the method is declared after the main
*/
public class method2{
    public static void main(String[] args){
        int a = 11;
        int b = 6;
        int c = minFunction(a,b); //calling the method
        System.out.println("Minimum Value = " + c);
    }
    //returns the minimum of two numbers
    public static int minFunction(int a, int b){
        int min;
        if (a > b)
            min = b;
        else
            min = a;
        return min;
    }
}// end of class