package pkg04_upcasting;

public class CarEx {

  public static void main(String[] args) {

    // 부모타입 Car 클래스로 자식 인스턴스 Bus / Truck 생성하기
    Car car1 = new Bus();
    Car car2 = new Truck();
    
    // 부모타입 Car 클래스로 저장된 자식 인스턴스는 부모타입 Car 클래스의 메소드만 호출할 수 있다.
    car1.drive();
    car1.bell(); // car 의 bell 은 호출만 해주기때문에 실제로는 bus 의 bell 이 불러와짐
   
    car2.drive();
    car2.load(); // car 의 load 은 호출만 해주기때문에 실제로는 truck 의 load 이 불러와짐
    
  }
}
