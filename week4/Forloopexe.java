/*
For nested for loops once the outer loop is executed once the inner loop is iterated to completion before going back to the outer loop
*/
public class Forloopexe{
    public static void main(String [] args){
//simple fo loop exe
        for(int i=1;
            i<=10;i++){
            System.out.println(i);}
//nested loops
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1; j<=3;j++){
                if(i==2 && j==2){
                    break aa;}
                System.out.println(i+ "   " +j);
            }
        }
    }
}