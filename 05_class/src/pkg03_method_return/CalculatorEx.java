package pkg03_method_return;

public class CalculatorEx {

  public static void main(String[] args) {
    
    Adder adder = new Adder();
    int sum = adder.plus(1, 2); // plus 메소드의 호출결과는 int 타입의 값이다.
    System.out.println(sum);
    
    Subtractor subtractor = new Subtractor();
    int result = subtractor.minus(3, 2);
    System.out.println(result);
 
  }

}
