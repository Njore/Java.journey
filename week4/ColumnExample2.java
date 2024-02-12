public class ColumnExample2{
    public static void main(String [] args){
        for(int i=1;i<=167;i++){
            if (i % 2 == 1){
                System.out.print(i+ "  ");
            }
            if(i % 14 == 0){
                System.out.println();
            }//end of if
        }//end of loop
    }//end of main
}//end of class