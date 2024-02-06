public class Javaop3 {
    public static void main(String[] args) {
        int num = 200;
        int count = 0;

        do {
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                break;
            }
        } while (num != 0 && num != 1);

        System.out.println("The number of times 2 is divides 200  is; " + count);
    }
}
