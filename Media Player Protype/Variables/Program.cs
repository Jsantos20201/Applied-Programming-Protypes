// See https://aka.ms/new-console-template for more information
using System;

class Program
{
    static void Main()
    {
        // Integer variable
        int age = 25;
        Console.WriteLine("age: " + age);

        // Floating-point variable
        double salary = 5000.50;
        Console.WriteLine("salary: " + salary);

        // Character variable
        char grade = 'A';
        Console.WriteLine("grade: " + grade);

        // Boolean variable
        bool isStudent = true;
        Console.WriteLine("isStudent: " + isStudent);

        // String variable
        string name = "John Doe";
        Console.WriteLine("name: " + name);

        // DateTime variable
        DateTime currentDate = DateTime.Now;
        Console.WriteLine("currentDate: " + currentDate);

        // Array variable
        int[] numbers = { 1, 2, 3, 4, 5 };
        Console.Write("numbers: ");
        foreach (int number in numbers)
        {
            Console.Write(number + " ");
        }
        Console.WriteLine();

        // Object variable
        object obj = "Hello, World!";
        Console.WriteLine("obj: " + obj);
    }
}

