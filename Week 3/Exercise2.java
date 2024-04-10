//add class definitions below this line

class Watch {
  private String manufacturer;
  private String model;
  private int diameter;
  private int waterResistance;
  private String material;

  public Watch(String man, String mo, int d, int wr, String mat) {
    manufacturer = man;
    model = mo;
    diameter = d;
    waterResistance = wr;
    material = mat;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String newManufacturer) {
    manufacturer = newManufacturer;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String newModel) {
    model = newModel;
  }

  public int getDiameter() {
    return diameter;
  }

  public void setDiameter(int newDiameter) {
    diameter = newDiameter;
  }

  public int getWaterResistance() {
    return waterResistance;
  }

  public void setWaterResistance(int newWaterResistance) {
    waterResistance = newWaterResistance;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String newMaterial) {
    material = newMaterial;
  }

  public String summary() {
    return "Manufacturer: " + capitalize(manufacturer) + "\n" + "Model: " + capitalize(model) + "\n" + "Diameter: " + diameter + " mm\n" + "Water Resistance: " + waterResistance + " m\n" + "Material: " + capitalize(material);
  } 

  private String capitalize(String s) {
    return s.substring(0,1).toUpperCase() + s.substring(1);
  }
}

  
//add class definitions above this line

public class CodingExercise2 {
  public static void main(String[] args) {
    
    //add code below this line
    Watch myWatch = new Watch("omega", "speedmaster", 42, 50, "steel");
    System.out.println(myWatch.summary());

    

    //add code above this line
  }
}
