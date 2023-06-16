// See https://aka.ms/new-console-template for more information
using System;

class Car
{
    public string Make { get; set; }
    public string Model { get; set; }
    public int Year { get; set; }

    public void StartEngine()
    {
        Console.WriteLine("Engine started for {0} {1}", Make, Model);
    }

    public void StopEngine()
    {
        Console.WriteLine("Engine stopped for {0} {1}", Make, Model);
    }
}

class Program
{
    static void Main()
    {
        Console.WriteLine("Welcome to the Car Demo Program!");

        // Creating an instance of the Car class
        Car myCar = new Car();
        myCar.Make = "Ford";
        myCar.Model = "Mustang";
        myCar.Year = 2022;

        // Calling methods of the Car class
        myCar.StartEngine();
        myCar.StopEngine();

        // Calling a function that uses the Car class
        CarDemoFunction(myCar);

        Console.WriteLine("Thank you for using the Car Demo Program!");
    }

    static void CarDemoFunction(Car car)
    {
        Console.WriteLine("Car Demo Function");
        Console.WriteLine("Make: {0}", car.Make);
        Console.WriteLine("Model: {0}", car.Model);
        Console.WriteLine("Year: {0}", car.Year);
    }
}


