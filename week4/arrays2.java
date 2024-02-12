public class arrays2 {
    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying array elements
        numbers[1] = 10;
        System.out.println("Modified second element: " + numbers[1]);

        // Getting the length of the array
        int length = numbers.length;
        System.out.println("Length of the array: " + length);

        // Iterating over the array using a for loop
        System.out.print("Array elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Declaring and initializing an array of strings
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Alice";

        // Iterating over the array using a for-each loop
        System.out.print("Array elements: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}