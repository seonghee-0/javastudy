package pkg01_wrapper_class;

public class WrapperEx {

  public static void main(String[] args) {
 
    /*
     *   primitive type     reference type(wrapper class)
     *   기본(원시)타입     참조타입
     * 1.byte               Byte
     * 2.short              Short
     * 3.int                Integer
     * 4.long               Long
     * 5.float              Float
     * 6.double             Double
     * 7.char               Character
     * 8.boolean            Boolean
     * 
     * primitive 타입은 null 을 담을 수 없지만 reference 타입은 null 을 가질 수 있다.
     */
    // Boxing (primitive type 데이터를 → reference type 으로 바꾸는것)
    Integer number = 10;  // reference type 이기때문에 null 값을 가질 수 있음
    
    
    // UnBoxing (reference type 데이터를 → primitive type 으로 바꾸는것)
    int number2 = number;
    
    System.out.println(number);
    System.out.println(number2);
    System.out.println(number + number2);
    
    
  }

}
