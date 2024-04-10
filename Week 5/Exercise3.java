abstract class Temperature {
  public abstract double celsius(double temp);
  public abstract double fahrenheit(double temp);
}

//add class definitions below this line

class Conversion extends Temperature {
  private String scale;
  private double degree;

  public String getScale() {
    return scale;
  }

  public void setScale(String newScale) {
    scale = newScale;
  }

  public double getDegree() {
    return degree;
  }

  public void setDegree(double newDegree) {
    degree = newDegree;
  }

  public double celsius(double temp) {
    return (temp - 32) / 1.8;
  }

  public double fahrenheit(double temp) {
    return temp * 1.8 + 32;
  }

  public double convertTo(String s, double temp) {
    String scale = s.toLowerCase();
    double result = 0.0;

    if (scale.equals("celsius")) {
      result = celsius(temp);
    } else if (scale.equals("fahrenheit")) {
      result = fahrenheit(temp);
    }
    return result;
  }
}


//add class definitions above this line

public class Exercise3 {  
  public static void main(String[] args) {
    
    //add code below this line

    Conversion c = new Conversion();
    System.out.println(c.convertTo("Celsius", 212.0));
    System.out.println(c.convertTo("CELSIUS", 78.0));
    System.out.println(c.convertTo("celsius", 23.0));
    System.out.println(c.convertTo("Fahrenheit", 0.0));
    System.out.println(c.convertTo("FAHRENHEIT", 29.0));
    System.out.println(c.convertTo("fahrenheit", 112.0));
    
    //add code above this line
  }
}
