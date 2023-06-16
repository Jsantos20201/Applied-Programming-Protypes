// See https://aka.ms/new-console-template for more information
using System;

class Program
{
    static void Main()
    {
        // Loop through numbers
        Console.WriteLine("Looping through numbers:");
        for (int i = 1; i <= 5; i++)
        {
            Console.WriteLine(i);
        }

        Console.WriteLine();

        // Loop through words
        Console.WriteLine("Looping through words:");
        string[] words = { "Hello", "World", "C#", "Programming" };
        foreach (string word in words)
        {
            Console.WriteLine(word);
        }

        Console.WriteLine();

        // Loop through letters
        Console.WriteLine("Looping through letters:");
        string text = "OpenAI";
        for (int i = 0; i < text.Length; i++)
        {
            Console.WriteLine(text[i]);
        }
    }
}
