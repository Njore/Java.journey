/*
A program to print the integers 1 to 100 in columns of 10
*/
public class ColumnExample1{
    public static void main(String [] args){
        for(int i=1;i<=100;i++){
            System.out.print(i+ "  ");
            if(i % 5  == 0){
                System.out.println();
            }//end of if
        }//end of loop
    }//end of main
}//end of class