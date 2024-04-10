# Exercise 1

The code below creates the CelestialBody class as well as the external method comparedToEarth. Transform the comparedToEarth method so that it becomes an instance method of the CelestialBody class.

```java
//add class definitions below this line

class CelestialBody {
  String name;
  double diameter;
  long distance;
  int moons;
  
  CelestialBody(String n, double diam, long dist, int m) {
    name = n;
    diameter = diam;
    distance = dist;
    moons = m;
  }
}
 
//add class definitions above this line

public class Exercise1 {  
  public static void main(String[] args) {
    
    //add code below this line
    

    CelestialBody planet = new CelestialBody("Jupiter", 142984, 778360000L, 79);
    System.out.println(comparedToEarth(planet));

    //add code above this line
  }
  
  //add method definitions below this line
  
  public static double comparedToEarth(CelestialBody planet) {
    double earth = 12765.3;
    double relativeSize = planet.diameter / earth;
    return relativeSize;
  }
  
  //add method definitions above this line
}
```

## Expected Output

Printing the comparedToEarth instance method should return 11.200990184327827.

# Exercise 2

Using the same CelestialBody class, write a static method closerToSun that compares two CelectialBody objects and returns the name of the object that is closes to the sun.

```java
//add class definitions below this line

class CelestialBody {
  String name;
  double diameter;
  long distance;
  int moons;
  
  CelestialBody(String n, double diam, long dist, int m) {
    name = n;
    diameter = diam;
    distance = dist;
    moons = m;
  }
}
 
//add class definitions above this line

public class Exercise2 {  
  public static void main(String[] args) {
    
    //add code below this line
    
    CelestialBody mercury = new CelestialBody("Mercury", 4879.4, 57909000, 0);
    CelestialBody venus = new CelestialBody("Venus", 12103.6, 108160000, 0);

    //add code above this line
  }
}
```

## Expected Output

If the objects mercury and venus are compared, then the method would return Mercury.

# Exercise 3

The class Mass is comprised of instance methods. None of these methods change object attributes. Convert these instance methods to static methods. Note, all comparisons are done in grams.

## Expected Output

The combinedWeight method should return 5506.532 when used with the following Mass objects.

```java
    //add code below this line
    
    Mass m1 = new Mass(800, 17, 3);
    Mass m2 = new Mass(732, 488, 2);
    System.out.println(Mass.combinedWeight(m1, m2));

    //add code above this line
```

The heavier method should return The second object is heavier when used with the following Mass objects.

```java
    //add code below this line
    
    Mass m1 = new Mass(80, 1, 3);
    Mass m2 = new Mass(1920, 1000, 2);
    System.out.println(Mass.heavier(m1, m2));

    //add code above this line
```

The averageWeight method should return 1146.51 when used with the following Mass objects.

```java
    //add code below this line
    
    Mass m1 = new Mass(3, 321, 0);
    Mass m2 = new Mass(17, 972, 1);
    System.out.println(Mass.averageWeight(m1, m2));

    //add code above this line
```

# Exercise 4

Use the Library class below for this coding exercise.

```java
//add class definitions below this line

class Library {
  ArrayList<String> available;
  ArrayList<String> onLoan;
  
  Library() {
    available = new ArrayList<String>();
    onLoan = new ArrayList<String>();
  }
}
 
//add class definitions above this line
```

Create the following instance methods for the Library class:
- addBooks - takes an list of book titles (strings) and adds each title to the ArrayList of available books
- borrowBook - takes a book title (string) and moves it from the available ArrayList to the ArrayList of books on loan
- returnBook - takes a book title (string) and moves it from the ArrayList of books on loan to the ArrayList of available books

## Expected Output

Assume you have an instance of the Library class called myLibrary. Add some books to object, and then print the list of available books.

```java
    Library myLibrary = new Library();
    String[] books = {"Four Seasons", "Say Nothing", "Milkman", "Harry Potter and the Order of the Phoenix"};
    myLibrary.addBooks(books);
    System.out.println(myLibrary.available);
```

You should see the following output:

```java
[Four Seasons, Say Nothing, Milkman, Harry Potter and the Order of the Phoenix]
```

Now borrow “Harry Potter and the Order of the Phoenix” and "Say Nothing". Then print the lists of available books and books on loan.

```java
    myLibrary.borrowBook("Harry Potter and the Order of the Phoenix");
    myLibrary.borrowBook("Say Nothing");
    System.out.println(myLibrary.available);
    System.out.println(myLibrary.onLoan);
```

You should see the following output:

```java
[Four Seasons, Milkman]
[Harry Potter and the Order of the Phoenix, Say Nothing]
```

Finally, return “Say Nothing” and print the lists of the books on loan and the available books.

```java
    myLibrary.returnBook("Say Nothing");
    System.out.println(myLibrary.available);
    System.out.println(myLibrary.onLoan);
```

You should see the following output:

```java
[Four Seasons, Milkman, Say Nothing]
[Harry Potter and the Order of the Phoenix]
```

# Exercise 5

Use the Subway class below to help solve these problems.

```java
//add class definitions below this line

class Subway {
  static double fare = 2.4;
  String[] stops;
  String currentStop;
  String direction;
  int passengers;
  double totalFares;
  
  Subway() {
    stops = new String[]{"Alewife", "Davis", "Porter", "Harvard", "Central", "Kendall"};
    currentStop = "Alewife";
    direction = "south";
    passengers = 0;
    totalFares = 0;
  }
}
//add class definitions above this line
```

Create the following methods for the Subway class:
- board - Accepts an integer that represents the number of passengers boarding the subway.
- disembark - Accepts an integer that represents the number of passengers exiting the subway. There cannot be a negative number of passengers on a subway. The fewest number of passengers on a subway is 0.
- advance - Moves the subway to the next stop. If direction is "south" the subway moves from Alewife to Kendall. If direction is "north" the subway moves from Kendall to Alewife. When the subway has reached its final stop, direction should change.
- distance - Accepts a string that represents a stop and returns the number of stops between the subway and the desired stop. The distance should be a positive number.
- changeFare - Accepts a float and changes the fare for all instances of the Subway class.
- calculate_fares - Calculates the fare for each passenger boarding the subway and adds it to totalFares.

## Expected Output

Use the examples below to test if your program is working as expected.
- Boarding the Subway
  If passengers is 220 and 45 people board the subway, then passengers would be 265.
- Total Fares
  If 100 passengers, in total, have boarded the train, the totalFares would be 240.
- Exiting the Subway
  If passengers is 113 and 23 people exit the subway, then passengers would be 90.
- Advancing the Subway
  If the subway is currently at Kendall and is traveling South, advancing the subway would change currentStop to "Central" and direction would become "north". If the subway is currently at Porter and is traveling South, advancing the subway would change currentStop to Harvard and direction would remain "south".
- Calculating Distance
  If the subway is currently at Davis and the desired stop is Central, the distance between them is 3 stops.
- Changing the Fare
  If the subway fare increased to $2.75, then fare should be 2.75 for all instances of the Subway class.
