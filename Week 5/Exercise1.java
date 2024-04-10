import java.util.ArrayList;
import java.util.Random; 

class Lottery {
  public ArrayList<Integer> shuffle() {
    Random r = new Random();
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++) {
      int num = r.nextInt(20);
      nums.add(num);
    }
    return nums;
  }
}

class PowerBall extends Lottery {
  public ArrayList<Integer> shuffle() {
    Random r = new Random();
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for (int i = 0; i < 6; i++) {
      int num = r.nextInt(100);
      nums.add(num);
    }
    return nums;
  }
}

//add class definitions below this line



//add class definitions above this line

public class Exercise1 {  
  public static void main(String[] args) {
    
    //add code below this line
    PowerBall pb = new PowerBall();
    ArrayList<Integer> numbers = pb.shuffle();
    for (int num : numbers) {
      System.out.println(num);
    }

    
    
    //add code above this line
  }
}
