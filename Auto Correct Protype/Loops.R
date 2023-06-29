# Program demonstrating loops in R

#In this program, we demonstrate different types of loops in R.

#The for loop iterates over the sequence 1 to 5 and prints each value.

#The while loop continues to execute as long as the condition j <= 5 is true. It initializes j to 1 and increments it by 1 in each iteration. The loop prints the value of j until j becomes greater than 5.

#The repeat loop executes an infinite loop that prints the value of k and increments it by 1 in each iteration. The loop is terminated by a break statement when k becomes greater than 5.

#Finally, we demonstrate a vectorized operation using a loop. We initialize a vector numbers and an empty vector squared_numbers. The loop calculates the square of each number in numbers using the * operator and assigns the result to the corresponding position in squared_numbers. The final result is printed.


# For loop
print("For loop:")
for (i in 1:5) {
  print(i)
}

# While loop
print("While loop:")
j <- 1
while (j <= 5) {
  print(j)
  j <- j + 1
}

# Repeat loop with break statement
print("Repeat loop:")
k <- 1
repeat {
  print(k)
  k <- k + 1
  if (k > 5) {
    break
  }
}

# Vectorized operation with a loop
print("Vectorized operation:")
numbers <- c(1, 2, 3, 4, 5)
squared_numbers <- numeric(length(numbers))

for (i in 1:length(numbers)) {
  squared_numbers[i] <- numbers[i] * numbers[i]
}

print(squared_numbers)
