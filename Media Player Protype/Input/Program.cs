// See https://aka.ms/new-console-template for more information
using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter your name: ");
        string name = Console.ReadLine();

        Console.Write("Enter your age: ");
        int age = int.Parse(Console.ReadLine());

        // Generate ID based on name and age
        string id = GenerateID(name, age);

        Console.WriteLine("Your ID: " + id);
    }

    static string GenerateID(string name, int age)
    {
        string nameInitials = GetInitials(name);
        string ageString = age.ToString();

        // Concatenate initials and age to form the ID
        string id = nameInitials + ageString;

        return id;
    }

    static string GetInitials(string name)
    {
        string[] nameParts = name.Split(' ');
        string initials = "";

        foreach (string part in nameParts)
        {
            if (!string.IsNullOrWhiteSpace(part))
            {
                initials += char.ToUpper(part[0]);
            }
        }

        return initials;
    }
}
