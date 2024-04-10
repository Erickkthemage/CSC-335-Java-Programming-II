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

  double comparedToEarth() {
    double earth = 12765.3;
    double relativeSize = diameter / earth;
    return relativeSize;
  }
}
 
//add class definitions above this line

public class Exercise1 {  
  public static void main(String[] args) {
    
    //add code below this line
    

    CelestialBody planet = new CelestialBody("Jupiter", 142984, 778360000L, 79);
    System.out.println(planet.comparedToEarth());

    //add code above this line
  }
  
  //add method definitions below this line
  
  
  //add method definitions above this line
}
