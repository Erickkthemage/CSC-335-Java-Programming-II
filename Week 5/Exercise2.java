abstract class Vehicle {
  public abstract double travel(double time);
}

//add class definitions below this line

class Airplane extends Vehicle {
  private double distance;
  private double time;

  public Airplane(double d) {
    setDistance(d);
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double newDistance) {
    distance = newDistance;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double newTime) {
    time = newTime;
  }

  public double travel(double time) {
    setTime(time);
    double result = getTime() * getDistance();
    return result;
  }
}


//add class definitions above this line

public class Exercise2 {  
  public static void main(String[] args) {
    
    //add code below this line

    Airplane a = new Airplane(550.0);
    System.out.println(a.travel(2));
    System.out.println(a.travel(3.15));
    System.out.println(a.travel(10.63));
    
    //add code above this line
  }
}
