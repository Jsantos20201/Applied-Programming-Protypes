// Numeric variables
var age = 25;
var height = 180.5;

// String variables
var name = "John";
var occupation = 'developer';

// Boolean variable
var isStudent = true;

// Array variable
var hobbies = ["reading", "coding", "playing guitar"];

// Object variable
var person = {
  name: "Alice",
  age: 30,
  occupation: "teacher"
};

// Output
console.log("Name: " + name);
console.log("Age: " + age);
console.log("Height: " + height);
console.log("Occupation: " + occupation);
console.log("Is student? " + isStudent);
console.log("Hobbies: " + hobbies);
console.log("Person: ", person);

// For Loop
console.log("For Loop:");
for (var i = 1; i <= 5; i++) {
  console.log("Iteration " + i);
}
console.log("--------------------");

// While Loop
console.log("While Loop:");
var j = 1;
while (j <= 5) {
  console.log("Iteration " + j);
  j++;
}
console.log("--------------------");

// List of Names
var names = ["John", "Alice", "Bob", "Emma", "Michael"];

// For Loop
console.log("For Loop:");
for (var i = 0; i < names.length; i++) {
  console.log("Name: " + names[i]);
}
console.log("--------------------");

// While Loop
console.log("While Loop:");
var j = 0;
while (j < names.length) {
  console.log("Name: " + names[j]);
  j++;
}
console.log("--------------------");


// Function Declaration
function greet(name) {
    console.log("Hello, " + name + "!");
  }
  
  // Function Call
  greet("John");
  
  // Function with Return Value
  function add(a, b) {
    return a + b;
  }
  
  // Function Call with Return Value
  var result = add(3, 4);
  console.log("Result: " + result);

// Class Declaration
class Person {
    constructor(name, age) {
      this.name = name;
      this.age = age;
    }
  
    greet() {
      console.log("Hello, my name is " + this.name + ".");
    }
  
    celebrateBirthday() {
      this.age++;
      console.log("Happy birthday! Now I am " + this.age + " years old.");
    }
  }
  
  // Create Instances of the Class
  var person1 = new Person("John", 25);
  var person2 = new Person("Alice", 30);
  
  // Access Class Properties and Methods
  console.log(person1.name); // Output: John
  person2.greet(); // Output: Hello, my name is Alice.
  person1.celebrateBirthday(); // Output: Happy birthday! Now I am 26 years old.




// Testing my Knowledge.
class Car {
    constructor(make, model, year, color) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.color = color;
      this.isEngineOn = false;
      this.speed = 0;
    }
  
    startEngine() {
      if (this.isEngineOn) {
        console.log("Engine is already running.");
      } else {
        this.isEngineOn = true;
        console.log("Engine started.");
        for (let i = 1; i <= 50; i++) {
          this.speed = i;
          console.log("Speed: " + this.speed + " mph");
        }
      }
    }
  
    stopEngine() {
      if (this.isEngineOn) {
        this.isEngineOn = false;
        this.speed = 0;
        console.log("Engine stopped.");
      } else {
        console.log("Engine is already stopped.");
      }
    }
  }
  
  // Create an Instance of the Car Class
  var myCar = new Car("Toyota", "Camry", 2021, "Silver");
  
  // Access Class Properties and Methods
  console.log(myCar.make); // Output: Toyota
  console.log(myCar.model); // Output: Camry
  console.log(myCar.year); // Output: 2021
  console.log(myCar.color); // Output: Silver
  myCar.startEngine(); // Output: Engine started. Speed: 1 mph ... Speed: 50 mph
  myCar.stopEngine(); // Output: Engine stopped.
  myCar.stopEngine(); // Output: Engine is already stopped.
  


// Testing with console

function askQuestion() {
    const name = prompt("What is your name?");
    console.log(`Hello, ${name}!`);
    askAge();
  }
  
  function askAge() {
    const age = prompt("How old are you?");
    console.log(`You are ${age} years old.`);
  }
  
  console.log("Welcome to the Interactive Console Program!");
  askQuestion();
  