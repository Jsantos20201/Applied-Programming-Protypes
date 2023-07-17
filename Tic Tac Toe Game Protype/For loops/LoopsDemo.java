public class LoopsDemo {
    public static void main(String[] args) {
        // 1. For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. While loop
        System.out.println("While loop:");
        int counter = 1;
        while (counter <= 5) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

        // 3. Do-While loop
        System.out.println("Do-While loop:");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 5);
        System.out.println();

        // 4. Enhanced for loop (for-each loop)
        System.out.println("Enhanced For loop:");
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
