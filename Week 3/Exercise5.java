//add class definitions below this line

class SodaMachine {
  private String[] sodas = {"coke", "pepsi", "sprite", "dr. pepper"};
  private int cokeInventory;
  private int pepsiInventory;
  private int spriteInventory;
  private int drPepperInventory;
  private int money;

  public SodaMachine() {
    cokeInventory = 20;
    pepsiInventory = 20;
    spriteInventory = 20;
    drPepperInventory = 20;
    money = 10;
  }

  public String[] getSodas() {
    return sodas;
  }

  public void setSodas(int index, String newSoda) {
    if (index >= 0 && index < sodas.length) {
      sodas[index] = newSoda;
    } else {
      System.out.println("Index out of bounds.");
    }
  }

  public int getCokeInventory() {
    return cokeInventory;
  }

  public void setCokeInventory(int newCokeInventory) {
    cokeInventory = newCokeInventory;
  }

  public int getPepsiInventory() {
    return pepsiInventory;
  }

  public void setPepsiInventory(int newPepsiInventory) {
    pepsiInventory = newPepsiInventory;
  }

  public int getSpriteInventory() {
    return spriteInventory;
  }

  public void setSpriteInventory(int newSpriteInventory) {
    spriteInventory = newSpriteInventory;
  }

  public int getDrPepperInventory() {
    return drPepperInventory;
  }

  public void setDrPepperInventory(int newDrPepperInventory) {
    drPepperInventory = newDrPepperInventory;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int newMoney) {
    money = newMoney;
  }

  public void buySoda(String soda, int insertedMoney) {
    boolean isValidSoda = false;
    boolean enoughMoney = false;
    int sodaPrice = 2;

    for (String s : sodas) {
      if (s.equals(soda)) {
        isValidSoda = true;
        break;
      }
    }

    if (!isValidSoda) {
      System.out.println("That soda is not sold in this machine.");
      return;
    }

    if (insertedMoney < sodaPrice) {
      System.out.println("You did not insert enough money.");
      return;
    }

    switch (soda) {
      case "coke":
        if (cokeInventory > 0) {
          enoughMoney = true;
          cokeInventory--;
        } else {
          System.out.println("There are no cans of Coke.");
        }
        break;
      case "pepsi":
        if (pepsiInventory > 0) {
          enoughMoney = true;
          pepsiInventory--;
        } else {
          System.out.println("There are no cans of Pepsi.");
        }
        break;
      case "sprite":
        if (spriteInventory > 0) {
          enoughMoney = true;
          spriteInventory--;
        } else {
          System.out.println("There are no cans of Sprite.");
        }
        break;
      case "dr. pepper":
        if (drPepperInventory > 0) {
          enoughMoney = true;
          drPepperInventory--;
        } else {
          System.out.println("There are no cans of Dr. Pepper.");
        }
        break;
    }

    if (enoughMoney) {
      money += sodaPrice;
    }
  }
}
    

  
//add class definitions above this line

public class CodingExercise5 {
  public static void main(String[] args) {
    
    //add code below this line

    SodaMachine myMachine = new SodaMachine();
    myMachine.setDrPepperInventory(0);
    myMachine.buySoda("dr. pepper", 2);
    System.out.println(myMachine.getMoney());
    System.out.println(myMachine.getDrPepperInventory());

    //add code above this line
  }
}
