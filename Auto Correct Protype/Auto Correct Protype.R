# Load necessary libraries
library(stringdist)
library(tm)

# Function to load and preprocess the dictionary
load_dictionary <- function(dictionary_file) {
  dictionary <- readLines(dictionary_file)
  dictionary <- tolower(dictionary)
  dictionary <- unique(dictionary)
  dictionary
}

# Function to preprocess and tokenize the input text
preprocess_text <- function(text) {
  # Preprocessing steps such as converting to lowercase, removing punctuation, etc.
  # Tokenize the text into individual words
  words <- strsplit(text, "\\s+")
  unlist(words)
}

# Function to calculate the Levenshtein distance between two strings
calculate_distance <- function(word1, word2) {
  stringdist::stringdist(word1, word2, method = "lv")
}

# Function to find the most similar word from the dictionary for a given word
find_similar_word <- function(word, dictionary) {
  distances <- sapply(dictionary, calculate_distance, word)
  closest_word <- dictionary[which.min(distances)]
  closest_word
}

# Function to perform auto-correction on a given text
auto_correct <- function(text, dictionary) {
  corrected_text <- character()
  
  # Preprocess and tokenize the input text
  words <- preprocess_text(text)
  
  for (word in words) {
    if (word %in% dictionary) {
      # If the word is in the dictionary, keep it as is
      corrected_text <- c(corrected_text, word)
    } else {
      # If the word is not in the dictionary, find the similar word
      similar_word <- find_similar_word(word, dictionary)
      corrected_text <- c(corrected_text, similar_word)
    }
  }
  
  # Join the corrected words into a single string
  corrected_text <- paste(corrected_text, collapse = " ")
  corrected_text
}


# Main program

# Specify the path to the dictionary file
dictionary_file <- "C:\\Users\\Josep\\Desktop\\Applied-Programming-Protypes\\Auto Correct Protype\\dictionary.txt"

# Load the dictionary
dictionary <- load_dictionary(dictionary_file)

# Prompt the user for input text
cat("Enter your text:\n")
input_text <- readline()

# Perform auto-correction on the input text
corrected_text <- auto_correct(input_text, dictionary)

# Write the corrected text to a file
output_file <- "C:\\Users\\Josep\\Desktop\\Applied-Programming-Protypes\\Auto Correct Protype\\output.txt"
writeLines(corrected_text, output_file)

# Write the file path to a separate file
path_file <- "C:\\Users\\Josep\\Desktop\\Applied-Programming-Protypes\\Auto Correct Protype\\path.txt"
writeLines(dictionary_file, path_file)