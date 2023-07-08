public class testVariables {
    public static void main(String[] args) throws Exception {
        // Declaration and initialization of variables
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;

        // Printing the values of variables
        System.out.println("num1: " + num1);
        System.out.println("num2 " + num2);
        System.out.println("Sum: " + sum);

        // Updating the value of a variable
        num1 = 7;

        // Recalculating the sum
        sum = num1 + num2;

        // Printing the updated values
        System.out.println("num 1 (Updated): " + num1);
        System.out.println("sum (Updated): " + sum);

        // Integer types
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 30;
        long longVar = 40L;

        // Floating-point types
        float floatVar = 3.14f;
        double doubleVar = 2.71828;

        // Character type
        char charVar = 'A';

        // Boolean type
        boolean booleanVar = true;

        // Printing the values of variables
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);

        // String variable
        String message = "Hello, world!";

        // Printing the value of the string variable
        System.out.println(message);

        // Modifying the string variable
        message = "Welcome to Java!";

        // Printing the modified value
        System.out.println(message);
    }
}
