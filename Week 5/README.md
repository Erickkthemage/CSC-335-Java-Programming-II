# Exercise 1

Use the Lottery class to the left as the superclass. Create the PowerBall class as a subclass of Lottery. Override the shuffle method so that it returns an ArrayList of six random integers up to but not including 100.

# Exercise 2

Vehicle is an abstract class. Create the Airplane class as a subclass of Vehicle. Extend and override Airplane as necessary to meet the criteria below. The travel method should return the distance traveled by the Airplane object.

## Expected Output

Instantiate an Airplane object as shown below.

```java
    //add code below this line

    Airplane a = new Airplane(550.0);
    
    //add code above this line
```

The table indicates the expected return values when calling travel with three different arguments.

| Method Call      | Return Value |
|------------------|--------------|
| a.travel(2)     | 1100.0       |
| a.travel(3.15)  | 1732.5       |
| a.travel(10.63) | 5846.5       |

# Exercise 3

The Temperature class is an abstract class with two abstract methods. Create the Conversion class which inherits from Temperature. Use the formulas below to help with the temperature conversions.

### Convert Fahrenheit to Celsius

 &deg;C = (&deg;F - 32)/1.8

### Convert Celsius to Fahrenheit

&deg;F = &deg;C * 1.8 + 32

## Expected Output

Instantiate a Conversion object.

```java
    //add code below this line

    Conversion c = new Conversion();
    
    //add code above this line
```

Calling the convertTo method with the following arguments should produce the return values in the table below. Note, capitalization for the string argument should not affect the output.

| Method Call                       | Return Value                 |
|-----------------------------------|------------------------------|
| c.convertTo("Celsius", 212.0)    | 100                          |
| c.convertTo("CELSIUS", 78.0)      | 25.555555555555554           |
| c.convertTo("celsius", 23.0)      | -5.0                         |
| c.convertTo("Fahrenheit", 0.0)    | 32.0                         |
| c.convertTo("FAHRENHEIT", 29.0)   | 84.2                         |
| c.convertTo("fahrenheit", 112.0)  | 233.6                        |

# Exercise 4

Create the Median class that has the method calculateMedian that calculates the median of the integers passed to the method. Use method overloading so that this method can accept anywhere from two to five parameters.

| Method Call                           | Return Value |
|---------------------------------------|--------------|
| m.calculateMedian(3, 5, 1, 4, 2)     | 3.0          |
| m.calculateMedian(8, 6, 4, 2)        | 5.0          |
| m.calculateMedian(9, 3, 7)           | 7.0          |
| m.calculateMedian(5, 2)              | 3.5          |

# Exercise 5

The Substitute class reads a text file and replaces every fifth word with the string HELLO.

Create the class Stars which is a subclass of Substitute. Then override the swapWords method so that in each sentence every third word is replaced by a series of *. If the word has three letters then it should be replaced with ***. The number of * should match the number of characters in the word. Write the new string to answerFile.

## Important

Keep the following things in mind as you write your code. Changes should only be made to the Stars class; do not alter the source and answer variables or the code for the Substitute class.
- The sourceFile attribute represents the file you will read.
- The answerFile attribute represents the file to which you will write your new text.
- The stringToList method converts the string (the text file) into an ArrayList of arrays of strings. Each inner array represents a sentence. The elements of each inner array are the words that make up that sentence.
- The listToString method converts the ArrayList of arrays of strings list back into a string.
- When you override the swapWords method, be sure to start with stringToList and use listToString before writing to the file.
- The text used for this activity are the first four sentences of Jane Austen’s Pride and Prejudice.

## Expected Output

```java
It is * truth universally ************* that a ****** man in ********** of a **** fortune, must ** in want ** a wife.
However little ***** the feelings ** views of **** a man *** be on *** first entering * neighbourhood, this ***** is so **** fixed in *** minds of *** surrounding families, **** he is ********** the rightful ******** of some *** or other ** their daughters.
“My dear *** Bennet,” said *** lady to *** one day, ***** you heard **** Netherfield Park ** let at ******
Mr. Bennet ******* that he *** not.
```
