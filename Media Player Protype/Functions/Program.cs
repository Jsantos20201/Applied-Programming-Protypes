// See https://aka.ms/new-console-template for more information
Console.WriteLine("Welcome to the Function Demo Program!");

// Calling a function with no parameters and no return value
GreetUser();

// Calling a function with parameters and a return value
int sum = AddNumbers(5, 7);
Console.WriteLine("Sum: " + sum);

// Calling a function with parameters and no return value
PrintMessage("Hello, World!");

Console.WriteLine("Thank you for using the Function Demo Program!");

void GreetUser()
{
    Console.WriteLine("Hello, User!");
}

int AddNumbers(int num1, int num2)
{
    int result = num1 + num2;
    return result;
}

void PrintMessage(string message)
{
    Console.WriteLine("Message: " + message);
}

