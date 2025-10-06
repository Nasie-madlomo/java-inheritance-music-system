# Java Inheritance: Music System 🎵

This project demonstrates core Object-Oriented Programming concepts in Java through a music-themed inheritance hierarchy. Developed as a university assignment that earned 98%.

## 📋 Project Overview

A Java application that models a music system using:
- **Abstract classes** for code reusability
- **Inheritance** to create specialized music types  
- **Polymorphism** to treat different objects uniformly
- **Method overriding** for customized behavior

## 🏗️ Class Structure

### Abstract Superclass: `Music`
- **Variables**: `title`, `length` (private with getters/setters)
- **Constructor**: Initializes common properties using `this` keyword
- **toString()**: Overridden to provide meaningful string representation
- **Abstract methods**: Force implementation in subclasses

### Subclass: `Song`
- **Extends** `Music` superclass
- **Additional variable**: `releaseYear`
- **Overrides** `toString()` using `super.toString()` for code reuse
- **Constructor**: Uses `super()` to initialize parent class

### Subclass: `Genre`
- **Extends** `Music` superclass  
- **Additional variable**: `popular` (boolean)
- **Overrides** `toString()` with ternary operator for "Yes"/"No" display
- **Constructor**: Uses `super()` for parent initialization

### Test Class: `MusicTest`
- Demonstrates **polymorphism** by storing `Song` and `Genre` in `Music[]` array
- Shows **implicit vs explicit toString()** calls
- Validates inheritance and method overriding

## 🎯 Key Concepts Demonstrated

### 1. Inheritance & Constructor Chaining
```java
public Song(String title, int length, int releaseYear) {
    super(title, length);  // Parent handles its own initialization
    this.releaseYear = releaseYear;
}



2. Polymorphism in Action:
Music[] music = new Music[2];
music[0] = new Song("Forever", 4, 2007);  // Treated as Music
music[1] = new Genre("R&B", 1940, true);  // Treated as Music

3. Method Overriding & Code Reuse:
@Override
public String toString() {
    return super.toString() + ", Year: " + releaseYear;  // Reuse + extend
}

4.Abstract Methods:
-Define contract in superclass

-Force implementation in subclasses

-Ensure consistent interface

How to run:
1.Clone this repository:
git clone https://github.com/YOUR_USERNAME/java-inheritance-music-system.git

2. compile all java files:
javac *.java

3. run the test program:
java MusicTest

Sample Output:
Title: Forever, Length: 4, Year: 2007
Explicit toString: Title: Forever, Length: 4, Year: 2007

Title: R&B, Length: 1940, popular: Yes  
Explicit toString: Title: R&B, Length: 1940, popular: Yes

Learning Journey:
-This project represents my deep dive into Java OOP concepts:

-Mastered super() for constructor chaining

-Understood polymorphism through practical implementation

-Applied method overriding with @Override annotation

-Learned the difference between implicit vs explicit toString() calls

-Grasped abstract classes and methods for designing extensible systems

Technologies Used:
-Java
- BlueJ IDE
- Object-Oriented Programming
- GitHub & Version Control

Assignment 2: Enhanced Features

### New Capabilities Added:
- **Random Instance Generation**: Dynamic creation of Song/Genre objects
- **Array Sorting**: Implements `Comparable<Music>` for natural ordering by title
- **Time Complexity Analysis**: Benchmarks algorithm performance with Big O notation
- **Professional Benchmarking**: Measures execution time with nanosecond precision

### Technical Implementation:
- **Comparable Interface**: Enables `Arrays.sort()` with custom comparison logic
- **Polymorphic Sorting**: Different object types sorted in same array
- **Algorithm Analysis**: O(n log n) time complexity demonstrated
- **Dynamic Generation**: Random properties for realistic test data

### Learning Outcomes:
- Understanding sorting algorithms and their efficiency
- Practical application of time complexity concepts
- Professional code benchmarking techniques
- Enhanced OOP design with interface implementation
