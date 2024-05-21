package pkg02_constructor;

public class Car {

  private String model; // 필드는 private
  
  public Car() {
    
  }
  
  public Car(String model) {
    this.model = model;
  }
  
  public void printCar() {
    System.out.println(model);
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
  
}