package pkg07_interface;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
      super();
      this.radius = radius;
    }

    public double getRadius() {
      return radius;
    }

    public void setRadius(double radius) {
      this.radius = radius;
    }
  
  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public double getCircum() {
    // TODO Auto-generated method stub
    return 0;
  }

}
