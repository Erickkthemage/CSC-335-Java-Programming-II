class Item {
  private String name;
  private double price;
  private int quantity;
  private double subtotal;

  public Item(String n, double p, int q) {
    name = n;
    price = p;
    quantity = q;
    subtotal = 0;
  }

  public void calculateSubtotal() {
    subtotal = price * quantity;
  }

  public double getSubtotal() {
    calculateSubtotal();
    return subtotal;
  }

  public int getQuantity() {
    return quantity;
  }

  public String toString() {
    return getClass().getName() + "[name=" + name + ", price=" + price + ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
  }
}
