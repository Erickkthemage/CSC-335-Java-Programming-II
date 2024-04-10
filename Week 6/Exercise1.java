interface Vehicle {
  String travel();
}

//add class definitions below this line
class Car implements Vehicle {
  private double miles;

  public Car(double m) {
    miles = m;
  }

  public String travel() {
    String s = String.format("There is no extra fee to travel %.2f miles.", miles);

    return s;
  }
}

class RideShare implements Vehicle {
  private double miles;
  private double rate;

  public RideShare(double m, double r) {
    miles = m;
    rate = r;
  }

  public String travel() {
    double cost = miles * rate;

    String s = String.format("It costs $%.2f to travel %.2f miles.", cost, miles);

    return s;
  }
}

class Subway implements Vehicle {
  private double fare;

  public Subway(double f) {
    fare = f;
  }

  public String travel() {
    String s = String.format("$%.2f will get you unlimited use for one day.", fare);

    return s;
  }
}

 
//add class definitions above this line

public class Exercise1 {  
  public static void main(String[] args) {
    
    //add code below this line

    Car c = new Car(10);
    RideShare rs = new RideShare(20, 0.5);
    Subway s = new Subway(7.25);
    
    System.out.println(c.travel());
    System.out.println(rs.travel());
    System.out.println(s.travel());

    //add code above this line
    
  }
}
