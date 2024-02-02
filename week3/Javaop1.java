public class Javaop1 {
    public static void main(String[]args ){
        int sum = 0;
        int num = 1;

        while (num <= 100){
            sum += num; //equivalent to sum = sum + num
            num ++;
        }
        System.out.println("The sum of numbers 0 to 100 is " +sum);
    }
}