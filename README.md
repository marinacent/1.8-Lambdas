# Task 8 - Lambdas

## 📄 Description

### Level 1

#### Exercise 1

From a list of strings, write a method that returns a list of all strings containing the letter 'o'. Print the result.

#### Exercise 2

Do the same as in the previous exercise, but now the method must return a list of strings that not only contain the letter 'o' but also have more than 5 letters. Print the result.

#### Exercise 3

Create a list with the names of the months of the year. Print all the elements of the list using a lambda.

#### Exercise 4

Do the same printing as in the previous exercise, but using a method reference instead.

#### Exercise 5

Create a Functional Interface with a method called ```getPiValue()``` that must return a double. From the ```main()``` method of the main class, instantiate the interface and assign it the value 3.1415. Call the ```getPiValue()``` method and print the result.

#### Exercise 6

Create a list with numbers and text strings, and sort the list by the strings from shortest to longest.

#### Exercise 7

With the list from the previous exercise, now sort it in reverse—from the longest string to the shortest.

#### Exercise 8

Create a Functional Interface with a method called ```reverse()``` that takes and returns a string. In the ```main()``` method of the main class, use a lambda to define the method body so it returns the reversed version of the input string. Call the interface instance with a string and check if the result is correct.

### Level 2

#### Exercise 1

Create a list of strings with proper names. Write a method that returns a list of all strings that start with the uppercase letter 'A' and have exactly 3 letters. Print the result.

#### Exercise 2

Write a method that returns a comma-separated string based on a list of integers. Each element should be prefixed with "e" if the number is even, or "o" if it's odd. Print the result.

#### Exercise 3

Create a Functional Interface with a method named ```operation()``` that returns a float. Use a lambda to implement the method so it can perform addition, subtraction, multiplication, and division operations.

#### Exercise 4

Create a list containing some text strings and numbers (as strings). Then:

- Sort the list alphabetically by the first character.
- Put strings containing the letter "e" first, followed by the rest.
- Modify all elements that contain the letter 'a' by replacing 'a' with '4'.
- Display only the elements that are numeric (even if stored as strings).

## 💻 Technologies used

Java 21

Maven 4.0.0

## 📋 Requirements

Java 21

Maven 4.0.0

## 🛠️ Set up

1. Clone repository: ```git clone```
2. Access project repository: ```cd 1.8-Lambdas```
3. Compile files: ```mvn compile```

## ▶️ Run

Run the following commands to execute each one of the Main classes:

```java -cp target/classes level_1.exercise_1_2.Main```

```java -cp target/classes level_1.exercise_3_4.Main```

```java -cp target/classes level_1.exercise_5.Main```

```java -cp target/classes level_1.exercise_6_7.Main```

```java -cp target/classes level_1.exercise_8.Main```

```java -cp target/classes level_2.exercise_1.Main```

```java -cp target/classes level_2.exercise_2.Main```

```java -cp target/classes level_2.exercise_3.Main```

```java -cp target/classes level_2.exercise_4.Main```

