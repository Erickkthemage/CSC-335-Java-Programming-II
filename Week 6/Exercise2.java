import java.util.*;

class Band {
  private String name;
  private String genre;
  private String[] members;
  
  public Band(String n, String g, String[]m) {
    name = n;
    genre = g;
    members = m;
  }
  
  //add method definition below this line
  
  public String toString() {
    return getClass().getName() + "[name=" + name + ", genre=" + genre +", members=" + Arrays.toString(members) + "]";
  }
  
  //add method definition above this line
}
 

public class Exercise2 {  
  public static void main(String[] args) {
    
    //add code below this line
    
    String[] members = {"Jerry", "Bob", "Mickey", "Bill", "Phil", "Pigpen"};
    Band dead = new Band("The Grateful Dead", "rock'n roll", members);

    System.out.println(dead);

    //add code above this line
    
  }
}
