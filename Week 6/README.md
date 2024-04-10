# Exercise 1

The Vehicle interface has already been defined in the IDE to the left. Create the Car, RideShare, and Subway classes that inherit from Vehicle. The table below describes the constructor for each class.

| Constructor | Arguments                                       |
|-------------|-------------------------------------------------|
| Car         | One double that represents miles traveled.     |
| RideShare   | Two doubles; one for miles traveled and the other for the fee per mile. |
| Subway      | One double that represents the fare of a subway ticket. |

Create an instance for each class and call the travel method.

```java
    //add code below this line

    Car c = new Car(10);
    RideShare rs = new RideShare(20, 0.5);
    Subway s = new Subway(7.25);
    
    System.out.println(c.travel());
    System.out.println(rs.travel());
    System.out.println(s.travel());

    //add code above this line
```

Your code should produce the following output:

```java
There is no extra fee to travel 10.00 miles.
It costs $10.00 to travel 20.00 miles.
$7.25 will get you unlimited use for one day.
```

# Exercise 2

You have been given the class Band. Extend the class such that it will produce a string representation of a Band object.

## Expected Output

Initialize an object of the Band class as follows:

```java
    //add code below this line
    
    String[] members = {"Jerry", "Bob", "Mickey", "Bill", "Phil", "Pigpen"};
    Band dead = new Band("The Grateful Dead", "rock'n roll", members);

    //add code above this line
```

When you print the dead object you should see the following output:

```java
Band[name=The Grateful Dead, genre=rock'n roll, members=[Jerry, Bob, Mickey, Bill, Phil, Pigpen]]
```

# Exercise 3

Create the Dog class with the string attributes for name and breed. These attributes need to have getter methods. Then create the method makeDogs that returns an ArrayList of five Dog objects according to the following table:

| Dog | Name      | Breed             |
|-----|-----------|-------------------|
| 1   | Marceline | German Shepherd   |
| 2   | Cajun     | Belgian Malinois  |
| 3   | Daisy     | Border Collie     |
| 4   | Rocky     | Golden Retriever  |
| 5   | Bella     | Irish Setter      |

## Expected Output

Verify that the name and breed of the dogs in the list match the order of the table. If you create a toString method for the Dog class, you can see the contents of the ArrayList.

```java
    //add code below this line

    ArrayList<Dog> dogs = makeDogs();
    System.out.println(dogs);

    //add code above this line
```

The above code should produce the following output:

```java
[Dog[name=Marceline, breed=German Shepherd], Dog[name=Cajun, breed=Belgian Malinois], Dog[name=Daisy, breed=Border Collie], Dog[name=Rocky, breed=Golden Retriever], Dog[name=Bella, breed=Irish Setter]]
```

# Exercise 4

You are given code for the Library class (in its own file). This is a composite class. You are going to create the Book class (the component class) in Book.java file. Look over the Library class carefully to determine what attributes are needed for the Book class. In addition, the table of output contains a hint as to what method the Book class needs.

## Expected Output

To check your work, open the Exercise4.java file and enter the following code samples. Be sure your output matches the given output for each scenario.

### Check 1

Return all of the books in the library. Change the code in Exercise4.java to look like this:

```java
    //add code below this line

    Library library = new Library();
    Book book1 = new Book("Three Musketeers", "Alexandre Dumas", "fiction");
    Book book2 = new Book("The Count of Monte Cristo", "Alexandre Dumas", "fiction");
    Book book3 = new Book("Educated", "Tara Westover", "nonfiction");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.sortBooks();
    System.out.println(library.getBooks());

    //add code above this line
```

Java should print the following output:

```java
[[Book[title=Three Musketeers, author=Alexandre Dumas, genre=fiction], Book[title=The Count of Monte Cristo, author=Alexandre Dumas, genre=fiction], Book[title=Educated, author=Tara Westover, genre=nonfiction]]
```

### Check 2

Return just the fiction books. Change the code in Exercise4.java to look like this:

```java
    //add code below this line

    Library library = new Library();
    Book book1 = new Book("Three Musketeers", "Alexandre Dumas", "fiction");
    Book book2 = new Book("The Count of Monte Cristo", "Alexandre Dumas", "fiction");
    Book book3 = new Book("Educated", "Tara Westover", "nonfiction");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.sortBooks();
    System.out.println(library.getFiction());

    //add code above this line
```

Java should print the following output:

```java
[Book[title=Three Musketeers, author=Alexandre Dumas, genre=fiction], Book[title=The Count of Monte Cristo, author=Alexandre Dumas, genre=fiction]]
```

### Check 3

Return just the nonfiction books. Change the code in Exercise4.java to look like this:

```java
    //add code below this line

    Library library = new Library();
    Book book1 = new Book("Three Musketeers", "Alexandre Dumas", "fiction");
    Book book2 = new Book("The Count of Monte Cristo", "Alexandre Dumas", "fiction");
    Book book3 = new Book("Educated", "Tara Westover", "nonfiction");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.sortBooks();
    System.out.println(library.getNonfiction());

    //add code above this line
```

Java should print the following output:

```java
[Book[title=Educated, author=Tara Westover, genre=nonfiction]]
```

### Check 4

Return a list of books by an author in the library. Change the code in Exercise4.java to look like this:

```java
    //add code below this line

    Library library = new Library();
    Book book1 = new Book("Three Musketeers", "Alexandre Dumas", "fiction");
    Book book2 = new Book("The Count of Monte Cristo", "Alexandre Dumas", "fiction");
    Book book3 = new Book("Educated", "Tara Westover", "nonfiction");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.sortBooks();
    System.out.println(library.searchAuthor("Alexandre Dumas"));

    //add code above this line
```

Java should print the following output:

```java
[Book[title=Three Musketeers, author=Alexandre Dumas, genre=fiction], Book[title=The Count of Monte Cristo, author=Alexandre Dumas, genre=fiction]]
```

### Check 5

Return a list of books by an author not in the library. Change the code in Exercise4.java to look like this:

```java
    //add code below this line

    Library library = new Library();
    Book book1 = new Book("Three Musketeers", "Alexandre Dumas", "fiction");
    Book book2 = new Book("The Count of Monte Cristo", "Alexandre Dumas", "fiction");
    Book book3 = new Book("Educated", "Tara Westover", "nonfiction");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.sortBooks();
    System.out.println(library.searchAuthor("Herman Melville"));

    //add code above this line
```

Java should print the following output:

```java
[]
```

### Check 6

Return a boolean for a title in the library. Change the code in Exercise4.java to look like this:

```java
    //add code below this line

    Library library = new Library();
    Book book1 = new Book("Three Musketeers", "Alexandre Dumas", "fiction");
    Book book2 = new Book("The Count of Monte Cristo", "Alexandre Dumas", "fiction");
    Book book3 = new Book("Educated", "Tara Westover", "nonfiction");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.sortBooks();
    System.out.println(library.searchTitle("Educated"));

    //add code above this line
```

Java should print the following output:

```java
true
```
### Check 7

Return a boolean for a title not in the library. Change the code in Exercise4.java to look like this:

```java
    //add code below this line

    Library library = new Library();
    Book book1 = new Book("Three Musketeers", "Alexandre Dumas", "fiction");
    Book book2 = new Book("The Count of Monte Cristo", "Alexandre Dumas", "fiction");
    Book book3 = new Book("Educated", "Tara Westover", "nonfiction");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.sortBooks();
    System.out.println(library.searchTitle("Moby Dick"));

    //add code above this line
```
Java should print the following output:

```java
false
```

# Exercise 5

You are going to write a program that simulates an online shopping cart. Create the composite class ShoppingCart in the ShoppingCart.java file, and create the component class Item in the Item.java file. The tables below indicate which attributes and methods your classes will need to create.

### The Shopping Cart Class

**Important**, the ShoppingCart class should initialize the attributes to either a 0 or an empty ArrayList. Your ShoppingCart class should have the following attributes:

| Attribute | Explanation                                           |
|-----------|-------------------------------------------------------|
| items     | ArrayList of Item elements                            |
| total     | Total value (double) of all of the items in the shopping cart |

It should also have the following methods:

| Method          | Explanation                                                   |
|-----------------|---------------------------------------------------------------|
| public ShoppingCart | The constructor should not take any arguments             |
| addItem         | Add an item to the shopping cart and then calls the calculateTotal method |
| calculateTotal  | Assigns the total value of the shopping cart to the total attribute  |
| getTotal        | Returns the total value of the shopping cart                     |
| getNumItems     | Returns the number of items in the shopping cart                  |
| toString        | Returns a human-readable string; see the Expected Output section for the format |

### The Item Class

**Important**, the subtotal attribute is not passed to the constructor. Initialize this attribute with a 0. Your Item class should have the following attributes:

| Attribute | Explanation                                              |
|-----------|----------------------------------------------------------|
| name      | Name (string) of the item                                |
| price     | How much (double) the item costs                         |
| quantity  | How many (int) items you have                            |
| subtotal  | Value (double) of all of the items                       |

It should also have the following methods:

| Method              | Explanation                                                               |
|---------------------|---------------------------------------------------------------------------|
| public Item         | The order of the parameters should be name, price, and then quantity      |
| calculateSubtotal   | Assigns the total value of the items to the subtotal attribute            |
| getSubtotal         | Returns the subtotal attribute                                            |
| toString            | Returns a human-readable string; see the Expected Output section for the format |

## Expected Output

You can check your work by opening the Exercise5.java file. Instantiate the three Item objects and a ShoppingCart object. Then add the items to the cart.

```java
    //add code below this line

    Item item1 = new Item("milk", 1.5, 1);
    Item item2 = new Item("apple", 0.75, 5);
    Item item3 = new Item("bread", 2.25, 2);
    ShoppingCart cart = new ShoppingCart();

    cart.addItem(item1);
    cart.addItem(item2);
    cart.addItem(item3);

    //add code above this line
```

Next, add some print statements to the main method to make sure you code is working as intended.

```java
    System.out.println(cart.getTotal());
    System.out.println(cart.getNumItems());
    System.out.println(cart);
```

You should see the following output:

```java
9.75
8
ShoppingCart[items=[Item[name=milk, price=1.5, quantity=1, subtotal=1.5], Item[name=apple, price=0.75, quantity=5, subtotal=3.75], Item[name=bread, price=2.25, quantity=2, subtotal=4.5]], total=9.75]
```
