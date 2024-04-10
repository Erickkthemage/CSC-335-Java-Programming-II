# Exercise 1

To the left, you should see code for the Fruit class. This class uses the default access modifier. Convert this code so that it uses encapsulation.

## Expected Output

You should be able to access and modify each of the attributes.

# Exercise 2

Create the Watch class following the conventions of encapsulation. The class should have the following attributes:
- manufacturer - string that represents who makes the watch
- model - string that represents the specific watch
- diameter - integer that represents (in millimeters) the diameter of the watch
- waterResistance - integer that represents (in meters) the water resistance of the watch
- material - string that represents what the watch is made of

Each attribute has a getter and a setter. In addition, the method printWatch will return a multiline string that is a summary of the Watch instance.

## Expected Output

The code below instantiates a Watch object. It then calls the printWatch method.

```java
    //add code below this line

    Watch myWatch = new Watch("omega", "speedmaster", 42, 50, "steel");
    System.out.println(myWatch.summary());

    //add code above this line
```

Your code should produce the following output:

```java
Manufacturer: Omega
Model: Speedmaster
Diameter: 42 mm
Water Resistance: 50 m
Material: Steel
```

# Exercise 3

Create the Song class which represents a song on a streaming service. The class should have the following attributes:
- artist - string representing who sings the song
- title - string representing the name of the song
- album - string representing the album on which the song appears
- playCount - integer representing how many times the song has been played
- payRate - a constant double that represents how much money the artist receives each time a song is played
- moneyEarned - a double representing how much money the song has earned the artist

All attributes should have a getter method, and all attributes except for payRate and moneyEarned should have a setter method. Use the Java convention for naming the getters and setters. Users should be able to call the play method which updates the playCount and moneyEarned attributes.

## Expected Output

Instantiate a Song object and play the song one time. Print the money earned. Then play it another 10,000 times and print how much the song has earned. Note, the moneyEarned attribute only updates when the play method is called. Using the setPlayCount method will update playCount but it will not update moneyEarned. That is why the for loop is used.

```java
    //add code below this line

    Song mySong = new Song("led zeppelin", "ten years gone", "physical graffiti", 0.001);
    mySong.play();
    System.out.println(mySong.getMoneyEarned());
    for (int i = 0; i < 10000; i++) {
      mySong.play();
    }
    System.out.println(mySong.getMoneyEarned());

    //add code above this line
```

Your program should produce the following output:

```java
0.001
10.001
```

# Exercise 4

Create the Atm class. This class has the attribute money that gets its value as an argument from the constructor.
- money - double that represents the amount of money in the account

This attribute should have a getter method, but not a setter. The class should have two method, deposit and withdrawal. The deposit method should contain data validation to check if the amount of money deposited is positive. Print a message if the data validation fails. The withdrawal method should check the data to see if there is enough money to withdraw and that the amount is positive. Print a message to the user if data validation fails.

## Expected Output

Verify that your program works for each of the following scenarios.

- **Scenario 1** - Deposit and withdraw valid amounts of money

```java
    //add code below this line

    Atm myAtm = new Atm(1000);
    myAtm.deposit(50);
    System.out.println(myAtm.getMoney());
    myAtm.withdraw(925);
    System.out.println(myAtm.getMoney());    

    //add code above this line
```

This code should produce the following output:

```java
1050.0
125.0
```

- **Scenario 2** - Deposit amount is not positive

```java
    //add code below this line

    Atm myAtm = new Atm(1000);
    myAtm.deposit(-50);
    System.out.println(myAtm.getMoney());    

    //add code above this line
```

This code should produce the following output:

```java
You cannot deposit a negative amount of money.
1000.0
```

- **Scenario 3** - Withdrawal amount is too large

```java
    //add code below this line

    Atm myAtm = new Atm(1000);
    myAtm.withdraw(5000);
    System.out.println(myAtm.getMoney());    

    //add code above this line
```

This code should produce the following output:

```java
You do not have enough funds to withdraw that amount.
1000.0
```

- **Scenario 4** - Withdrawal amount is not positive

```java
    //add code below this line

    Atm myAtm = new Atm(1000);
    myAtm.withdraw(-50);
    System.out.println(myAtm.getMoney());    

    //add code above this line
```

This code should produce the following output:

```java
You cannot withdraw a negative amount of money.
1000.0
```

# Exercise 5

Create the class SodaMachine which sells soda. Assume that this machine only takes bills and that each can of soda costs $2. The class has the following attributes:
- sodas - array of strings that represents the types of soda sold. It should be initialized as {"coke", "pepsi", "sprite", "dr. pepper"}.
- cokeInventory - integer representing how many cans of Coke are in the machine. Start with 20.
- pepsiInventory - integer representing how many cans of Pepsi are in the machine. Start with 20.
- spriteInventory - integer representing how many cans of Sprite are in the machine. Start with 20.
- drPepperInventory - integer representing how many cans of Dr. Pepper are in the machine. Start with 20.
- money - integer representing how much money is in the machine. Start with $10.

Each attribute should have a getter and a setter. In addition, buySoda is a public method. This method takes a string that represents the type of soda to purchase and the amount of money inserted in the machine. The buySoda method should add the value of the soda ($2) to the money attribute and update the inventory the particular soda. It also needs to provide the following data validation:
- Validate that the soda is sold by the machine; provide a message to the user.
- Validate that the user inserted enough money; provide a message to the user.
- Validate that there is enough cans of soda to be sold; provide a message to the user.

## Expected Output

Verify that your program works for each of the following scenarios.

- **Scenario 1** - Select a valid soda and a valid amount of money

```java
    //add code below this line

    SodaMachine myMachine = new SodaMachine();
    myMachine.buySoda("coke", 4);
    System.out.println(myMachine.getMoney());
    System.out.println(myMachine.getCokeInventory());

    //add code above this line
```

This code should produce the following output. The money attribute is increased by the price of the soda, and cokeInventory has decreased by 1.

```java
12
19
```

- **Scenario 2** - Select an invalid soda and a valid amount of money

```java
    //add code below this line

    SodaMachine myMachine = new SodaMachine();
    myMachine.buySoda("diet coke", 4);
    System.out.println(myMachine.getMoney());
    System.out.println(myMachine.getCokeInventory());
    System.out.println(myMachine.getSpriteInventory());
    System.out.println(myMachine.getPepsiInventory());
    System.out.println(myMachine.getDrPepperInventory());

    //add code above this line
```

This code should produce the following output. There should be a message about the soda not being sold. The money attribute should not change, and none of the inventory attributes should change either.

```java
That soda is not sold in this machine.
10
20
20
20
20
```

- **Scenario 3** - Select a valid soda and not enough money

```java
    //add code below this line

    SodaMachine myMachine = new SodaMachine();
    myMachine.buySoda("sprite", 1);
    System.out.println(myMachine.getMoney());
    System.out.println(myMachine.getSpriteInventory());

    //add code above this line
```

This code should produce the following output. There should be a message about not inserting enough money. Because this is not a valid transaction, the money and spriteInventory attributes should not change.

```java
You did not insert enough money.
10
20
```

- **Scenario 4** - The machine ran out of a particular soda

```java
    //add code below this line

    SodaMachine myMachine = new SodaMachine();
    myMachine.setDrPepperInventory(0);
    myMachine.buySoda("dr. pepper", 2);
    System.out.println(myMachine.getMoney());
    System.out.println(myMachine.getDrPepperInventory());

    //add code above this line
```

This code should produce the following output. There should be a message about not having any cans for a particular soda. The money attribute should not change, and the drPepperInventory attribute should remain at 0.

```java
There are no cans of Dr. Pepper.
10
0
```
