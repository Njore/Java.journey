public class Javaop2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 100;
        do {
            sum -= num; //equivalent to sum = sum - num
            num--;
        } while (num >= 1);
        System.out.println("The sum of numbers 0 to 100 is " + (-sum));
    }
}