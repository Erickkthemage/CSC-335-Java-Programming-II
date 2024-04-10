class Parent1 {
  public String identify() {
    return "This method is called from Parent1";
  }
}

class Parent2 extends Parent1 {
  public String identify() {
    return "This method is called from Parent2";
  }

  public String p1Identify() {
    return super.identify();
  }
}

//add class definitions below this line

class Child extends Parent2 {
  public String identify() {
    return "This method is called from Child";
  }

  public String identify2() {
    return super.identify();
  }

  public String identify3() {
    return super.p1Identify();
  }
}



//add class definitions above this line

public class Exercise3 {
  public static void main(String[] args) {
    
    //add code below this line
  
    Child childObject = new Child();

    System.out.println(childObject.identify());
    System.out.println(childObject.identify2());
    System.out.println(childObject.identify3());
  
    //add code above this line  
  }
}
