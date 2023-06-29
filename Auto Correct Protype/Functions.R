# Program to collect and print user information

# /*
# In this program, two functions are defined:

# The get_user_info() function takes a prompt message as an argument and uses the readline() function to prompt the user for input. It returns the user's response.

# The print_user_info() function takes the user's name, age, favorite movie, and favorite food as arguments and uses the cat() function to print the collected information.
# */

# Function to prompt the user for information
get_user_info <- function(prompt_message) {
  readline(prompt_message)
}

# Function to print user information
print_user_info <- function(name, age, movie, food) {
  cat("Name:", name, "\n")
  cat("Age:", age, "\n")
  cat("Favorite Movie:", movie, "\n")
  cat("Favorite Food:", food, "\n")
}

# Prompt the user for information
name <- get_user_info("Enter your name: ")
age <- get_user_info("Enter your age: ")
movie <- get_user_info("Enter your favorite movie: ")
food <- get_user_info("Enter your favorite food: ")

# Print the user information
print_user_info(name, age, movie, food)
