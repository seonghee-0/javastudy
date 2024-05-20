package pkg07_constructor;

public class PersonEx {

  public static void main(String[] args) {
    
    // Person 타입의 인스턴스 생성
    Person person1 = new Person();
    Person person2 = new Person("제니퍼");
    Person person3 = new Person("제니","20240520");
    
    person1.print();
    person2.print();
    person3.print();
  }

}
