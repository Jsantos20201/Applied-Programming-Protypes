# Program to demonstrate arrays

# Create an array of integers
numbers <- c(2, 4, 6, 8, 10)

# Accessing elements in the array
cat("Array elements:", numbers[1], numbers[3], numbers[5], "\n")

# Modify an element in the array
numbers[2] <- 12

# Adding new elements to the array
numbers <- c(numbers, 14, 16)

# Length of the array
length_of_array <- length(numbers)
cat("Length of the array:", length_of_array, "\n")

# Sum of array elements
sum_of_array <- sum(numbers)
cat("Sum of array elements:", sum_of_array, "\n")

# Average of array elements
average_of_array <- mean(numbers)
cat("Average of array elements:", average_of_array, "\n")

# Program to collect and display user information using an array

# Create an empty array to store user information
user_info <- character(length = 3)

# Prompt the user for name, age, and city
user_info[1] <- readline("Enter your name: ")
user_info[2] <- readline("Enter your age: ")
user_info[3] <- readline("Enter your city: ")

# Display the collected information
cat("Name:", user_info[1], "\n")
cat("Age:", user_info[2], "\n")
cat("City:", user_info[3], "\n")


# Program to display elements in an array

# Create an array of foods
foods <- c("Pizza", "Burger", "Sushi", "Pasta", "Steak")

# Display the first element
cat("First food:", foods[1], "\n")

# Display the last element
cat("Last food:", foods[length(foods)], "\n")

# Determine the middle index
middle_index <- ceiling(length(foods) / 2)

# Display the middle element
cat("Middle food:", foods[middle_index], "\n")

# Display the whole array
cat("All foods:", foods, "\n")
