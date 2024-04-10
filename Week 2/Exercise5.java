import java.util.ArrayList;
import java.util.Arrays;

//add class definitions below this line

class Subway {
  static double fare = 2.4;
  String[] stops;
  String currentStop;
  String direction;
  int passengers;
  double totalFares;
  
  Subway() {
    stops = new String[]{"Alewife", "Davis", "Porter", "Harvard", "Central", "Kendall"};
    currentStop = "Alewife";
    direction = "south";
    passengers = 0;
    totalFares = 0;
  }

  void board(int p) {
    passengers += p;
    calculate_fares(p);
  }

  void disembark(int p) {
    passengers = Math.max(0, passengers - p);
  }

  void advance() {
    int currentIndex = Arrays.asList(stops).indexOf(currentStop);
    if (direction.equals("south")) {
      if (currentIndex < stops.length - 1) {
        currentStop = stops[currentIndex + 1];
      } else {
        currentStop = stops[currentIndex - 1];
        direction = "north";
      }
    } else {
      if (currentIndex > 0) {
        currentStop = stops[currentIndex - 1];
      } else {
        currentStop = stops[currentIndex + 1];
        direction = "south";
      }
    }
  }

  int distance(String s) {
    int currentIndex = Arrays.asList(stops).indexOf(currentStop);
    int targetIndex = Arrays.asList(stops).indexOf(s);
    return Math.abs(targetIndex - currentIndex);
  }

  static void changeFare(double f) {
    fare = f;
  }

  void calculate_fares(int p) {
    totalFares += p * fare;
  }
}
//add class definitions above this line

public class Exercise5 {  
  public static void main(String[] args) {
    
    //add code below this line


    


    //add code above this line
  }
}
