// Define a simple class named "Person"
class Person {
    // Instance variables (fields)
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane", 25);

        // Using methods to display information about each person
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
