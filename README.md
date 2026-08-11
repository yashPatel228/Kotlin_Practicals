# Kotlin Practical-1

A collection of basic Kotlin programming concepts implemented in a **single Kotlin program** for Practical-1.

This practical demonstrates variables, type conversion, user input, control flow, functions, recursion, arrays, ArrayList, classes, constructors, operator overloading, and matrix operations.

## 📚 Practical-1

### Topics Covered

| No. | Practical | Concepts |
|---|---|---|
| 1.1 | Store & Display Values in Different Variables | Integer, Double, Float, Long, Short, Byte, Char, Boolean, String |
| 1.2 | Type Conversion | Integer → Double, String → Integer, String → Double |
| 1.3 | Scan Student's Information | User input and displaying student information |
| 1.4 | Check Odd or Even Numbers | `if-else` and control flow inside `println()` |
| 1.5 | Display Month Name | `when` expression |
| 1.6 | User-Defined Function | Addition, subtraction, multiplication, division |
| 1.7 | Factorial Calculation with Recursion | Recursive function |
| 1.8 | Working with Arrays | Arrays, loops, sorting, `joinToString()`, `deepToString()` |
| 1.9 | Find Maximum Number from ArrayList | ArrayList and maximum value |
| 1.10 | Class and Constructor Creation | Classes, constructors, properties, member functions |
| 1.11 | Operator Overloading and Matrix Operations | Operator overloading, matrix addition, subtraction, multiplication, `toString()` |

---

## 📁 Project Structure

The complete Practical-1 is implemented in **one Kotlin source file**.

```text
kotlin_pra/
│
├── README.md
│
└── Practical1.kt
```

The `Practical1.kt` file contains all programs from **1.1 to 1.11**.

---

# 🛠️ Requirements

To run this project, install:

- Kotlin
- JDK 8 or later
- IntelliJ IDEA or another Kotlin-supported IDE

Kotlin provides official IDE support through tools such as IntelliJ IDEA and Android Studio. The Kotlin command-line compiler can also be used to compile and run JVM programs.

---

# ⚙️ Setup

## 1. Clone the Repository

```bash
git clone https://github.com/yashPatel228/kotlin_pra.git
```

Navigate to the project directory:

```bash
cd kotlin_pra
```

## 2. Open the Project

You can open the project using **IntelliJ IDEA**.

1. Open IntelliJ IDEA.
2. Select **Open**.
3. Select the `kotlin_pra` folder.
4. Open `Practical1.kt`.
5. Click the **Run** button.

---

# ▶️ Running from Command Line

If the Kotlin command-line compiler is installed, compile the Kotlin file using:

```bash
kotlinc Practical1.kt -include-runtime -d Practical1.jar
```

Then run the generated JAR:

```bash
java -jar Practical1.jar
```

The `-include-runtime` option packages the Kotlin runtime into the generated JAR, making it directly runnable with Java.

---

# 💻 Practical Details

## 1.1 Store & Display Values in Different Variables

Demonstrates declaration and display of different Kotlin data types:

- `Int`
- `Double`
- `Float`
- `Long`
- `Short`
- `Byte`
- `Char`
- `Boolean`
- `String`

Example:

```kotlin
val integerValue: Int = 10
val doubleValue: Double = 10.50
val floatValue: Float = 10.5f
val longValue: Long = 100000L
val shortValue: Short = 100
val byteValue: Byte = 10
val charValue: Char = 'A'
val booleanValue: Boolean = true
val stringValue: String = "Kotlin"
```

---

## 1.2 Type Conversion

Demonstrates conversion between different data types.

Examples:

```kotlin
val number: Int = 10
val doubleNumber: Double = number.toDouble()

val stringNumber = "100"
val integerNumber = stringNumber.toInt()

val stringDouble = "25.50"
val doubleValue = stringDouble.toDouble()
```

---

## 1.3 Scan Student's Information

The program accepts student information from the user and displays it.

Example information:

- Student Name
- Enrolment Number
- Branch
- Semester
- Division
- College Name

Example:

```text
Enter Student Name: Yash Patel
Enter Enrolment Number: 123456789
Enter Branch: Computer Engineering
Enter Semester: 4

Student Information
-------------------
Name: Yash Patel
Enrolment No: 123456789
Branch: Computer Engineering
Semester: 4
```

---

## 1.4 Check Odd or Even Numbers

Determines whether a number is odd or even.

Example:

```kotlin
val number = 10

println(if (number % 2 == 0) "Even Number" else "Odd Number")
```

Output:

```text
Even Number
```

---

## 1.5 Display Month Name

Uses a Kotlin `when` expression to display the month name based on the month number.

Example:

```kotlin
when (month) {
    1 -> println("January")
    2 -> println("February")
    3 -> println("March")
    // ...
    12 -> println("December")
    else -> println("Invalid month")
}
```

Example:

```text
Enter month number: 8
Month: August
```

---

## 1.6 User-Defined Function

A user-defined function performs basic arithmetic operations on two numbers.

Operations:

- Addition
- Subtraction
- Multiplication
- Division

Example:

```kotlin
fun arithmeticOperations(a: Double, b: Double) {
    println("Addition: ${a + b}")
    println("Subtraction: ${a - b}")
    println("Multiplication: ${a * b}")

    if (b != 0.0) {
        println("Division: ${a / b}")
    } else {
        println("Division by zero is not allowed")
    }
}
```

---

## 1.7 Factorial Calculation with Recursion

Calculates the factorial of a number using recursion.

Example:

```kotlin
fun factorial(n: Int): Long {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
```

Example:

```text
Enter number: 5
Factorial: 120
```

---

# 1.8 Working with Arrays

This section demonstrates several Kotlin array operations.

### Array Display

```kotlin
val array = arrayOf(1, 2, 3, 4, 5)

println(array.contentDeepToString())
```

### `Arrays.deepToString()`

Used for displaying nested arrays.

```kotlin
println(java.util.Arrays.deepToString(nestedArray))
```

### `contentDeepToString()`

```kotlin
println(nestedArray.contentDeepToString())
```

### `IntArray.joinToString()`

```kotlin
val numbers = intArrayOf(10, 20, 30, 40)

println(numbers.joinToString(", "))
```

Output:

```text
10, 20, 30, 40
```

### Different Loop Types

The program demonstrates:

```kotlin
for (i in 0..4)
```

```kotlin
for (i in 5 downTo 1)
```

```kotlin
for (i in 0 until 5)
```

These loops are used to traverse and manipulate arrays.

---

## Sorting an Array Without Built-in Functions

A simple sorting algorithm such as Bubble Sort can be used:

```kotlin
for (i in 0 until array.size - 1) {
    for (j in 0 until array.size - i - 1) {
        if (array[j] > array[j + 1]) {
            val temp = array[j]
            array[j] = array[j + 1]
            array[j + 1] = temp
        }
    }
}
```

## Sorting Using Built-in Functions

Kotlin provides built-in sorting functions:

```kotlin
array.sort()
```

---

# 1.9 Find Maximum Number from ArrayList

Uses an `ArrayList<Int>` to find the maximum number.

Example:

```kotlin
val numbers = arrayListOf(10, 25, 5, 50, 30)

var maximum = numbers[0]

for (number in numbers) {
    if (number > maximum) {
        maximum = number
    }
}

println("Maximum Number: $maximum")
```

Output:

```text
Maximum Number: 50
```

---

# 1.10 Class and Constructor Creation

A `Car` class is created with properties such as:

- Type
- Model
- Price
- Owner
- Miles Driven

The class contains functions to:

- Get car information
- Get original car price
- Calculate current car price
- Display car information

Example structure:

```kotlin
class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    val milesDriven: Double
) {

    fun getCarInformation() {
        println("Type: $type")
        println("Model: $model")
        println("Price: $price")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }

    fun getOriginalCarPrice(): Double {
        return price
    }

    fun getCurrentCarPrice(): Double {
        return price - (milesDriven * 0.1)
    }

    fun displayCarInformation() {
        getCarInformation()
        println("Original Price: ${getOriginalCarPrice()}")
        println("Current Price: ${getCurrentCarPrice()}")
    }
}
```

---

# 1.11 Operator Overloading and Matrix Operations

## Operator Overloading

Operator overloading allows operators such as `+` and `-` to be given custom behavior for user-defined classes.

For example:

```kotlin
operator fun plus(other: Matrix): Matrix
```

allows two `Matrix` objects to be added using:

```kotlin
matrix1 + matrix2
```

Similarly:

```kotlin
operator fun minus(other: Matrix): Matrix
```

allows:

```kotlin
matrix1 - matrix2
```

---

## Matrix Class

The `Matrix` class demonstrates:

- Matrix addition
- Matrix subtraction
- Matrix multiplication
- Operator overloading
- Customized `toString()`

Example:

```kotlin
class Matrix(
    private val data: Array<IntArray>
) {

    operator fun plus(other: Matrix): Matrix {
        // Matrix addition
    }

    operator fun minus(other: Matrix): Matrix {
        // Matrix subtraction
    }

    operator fun times(other: Matrix): Matrix {
        // Matrix multiplication
    }

    override fun toString(): String {
        return data.joinToString("\n") {
            it.joinToString(" ")
        }
    }
}
```

The customized `toString()` function makes it possible to print a matrix directly:

```kotlin
println(matrix)
```

---

# 🧪 Expected Learning Outcomes

After completing Practical-1, the student should understand:

- Kotlin variable declarations
- Kotlin primitive data types
- Type conversion
- Console input and output
- Conditional statements
- `when` expressions
- Functions
- Recursion
- Arrays
- ArrayList
- Loops and ranges
- Sorting algorithms
- Classes and constructors
- Member functions
- Operator overloading
- Matrix operations
- `toString()` customization

---

# 📌 How to Use the Program

Run:

```text
Practical1.kt
```

The program can execute the different practical concepts sequentially.

For interactive sections, enter the requested values when prompted.

Example:

```text
========== KOTLIN PRACTICAL-1 ==========

1.1 Data Types
1.2 Type Conversion
1.3 Student Information
1.4 Odd or Even
1.5 Month Name
1.6 Arithmetic Operations
1.7 Factorial
1.8 Arrays
1.9 ArrayList Maximum
1.10 Car Class
1.11 Matrix Operations
```

---

# 📝 Practical List

### Practical 1.1
**Store & Display Values in Different Variables**

Create and display variables of different data types including Integer, Double, Float, Long, Short, Byte, Char, Boolean and String.

### Practical 1.2
**Type Conversion**

Perform Integer-to-Double, String-to-Integer and String-to-Double conversions.

### Practical 1.3
**Scan Student's Information**

Accept student information from the user and display all entered information.

### Practical 1.4
**Check Odd or Even Numbers**

Determine whether a number is odd or even using control flow inside the `println()` method.

### Practical 1.5
**Display Month Name**

Display the month name according to the number entered by the user using a `when` expression.

### Practical 1.6
**User-Defined Function**

Create a function to perform addition, subtraction, multiplication and division on two numbers.

### Practical 1.7
**Factorial Calculation with Recursion**

Calculate the factorial of a number using a recursive function.

### Practical 1.8
**Working with Arrays**

Demonstrate array operations including `Arrays.deepToString()`, `contentDeepToString()`, `IntArray.joinToString()`, ranges, `downTo`, `until`, loops and array sorting.

### Practical 1.9
**Find Maximum Number from ArrayList**

Find the maximum number from an `ArrayList` of integers.

### Practical 1.10
**Class and Constructor Creation**

Create a `Car` class with type, model, price, owner and miles-driven properties and implement functions for car information and price calculations.

### Practical 1.11
**Operator Overloading and Matrix Operations**

Implement matrix addition, subtraction and multiplication using operator overloading and customize matrix output using `toString()`.

---

# 🔗 Repository

**GitHub Repository:**  
https://github.com/yashPatel228/kotlin_pra

---

# 👨‍💻 Author

**Yash Patel**

Kotlin Practical-1

---

# 📄 License

This project is created for educational and practical learning purposes.
