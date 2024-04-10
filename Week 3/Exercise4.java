//add class definitions below this line

class Atm {
  private double money;

  public Atm(double m) {
    money = m;
  }

  public double getMoney() {
    return money;
  }

  public void deposit(double m) {
    if (m >= 0) {
      money += m;
    } else {
      System.out.println("You cannot deposit a negative amount of money.");
    }
  }

  public void withdraw(double m) {
    if (money >= m && m >= 0) {
      money -= m;
    } else if (money < m) {
      System.out.println("You do not have enough funds to withdraw that amount.");
    } else {
      System.out.println("You cannot withdraw a negative amount of money.");
    }
  }
}
    

  
//add class definitions above this line

public class CodingExercise4 {
  public static void main(String[] args) {
    
    //add code below this line

    Atm myAtm = new Atm(1000);
    myAtm.withdraw(-50);
    System.out.println(myAtm.getMoney());    

    //add code above this line
  }
}
