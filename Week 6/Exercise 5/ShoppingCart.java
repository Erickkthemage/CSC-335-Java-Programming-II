import java.util.*;

class ShoppingCart {
  private ArrayList<Item> items;
  private double total;

  public ShoppingCart() {
    items = new ArrayList<Item>();
    total = 0;
  }

  public void addItem(Item i) {
    items.add(i);
    calculateTotal();
  }

  public void calculateTotal() {
    double runningTotal = 0;
    for (Item i : items) {
      runningTotal += i.getSubtotal();
    }
    total = runningTotal;
  }

  public double getTotal() {
    return total;
  }

  public int getNumItems() {
    int count = 0;
    for (Item i : items) {
      count += i.getQuantity();
    }
    return count;
  }

  public String toString() {
    return getClass().getName() + "[items=" + items + ", total=" + total + "]";
  }
}
