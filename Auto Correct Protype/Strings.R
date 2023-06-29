# Program to create an ID

# /*
# In this program, the user is prompted to enter their name, age, and city.
# The readline() function is used to read user input, and as.integer() is used to convert the age input into an integer data type.
# */

# Prompt the user for information
name <- readline("Enter your name: ")  # Read user's name
age <- as.integer(readline("Enter your age: "))  # Read user's age and convert it to an integer
city <- readline("Enter your city: ")  # Read user's city

# /*
# Next, the program generates an ID based on the provided information.
# It uses the substr() function to extract the first three characters of the name and city,
# and then concatenates them with the age using the paste() function.
# */

# Generate an ID based on the provided information
id <- paste(substr(name, 1, 3), age, substr(city, 1, 3), sep = "-")  # Extract first three characters of name and city, concatenate with age using "-" separator

# /*
# Finally, the program prints the generated ID using the cat() function.
# */

# Print the generated ID
cat("Your ID:", id, "\n")  # Print the generated ID
