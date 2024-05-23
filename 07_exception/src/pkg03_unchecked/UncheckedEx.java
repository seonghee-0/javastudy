package pkg03_unchecked;

public class UncheckedEx {

  public static void main(String[] args) {
    
    /*
     * < unchecked exception >
     * 1. 예외처리구문( try-catch, throws)이 없어도 동작하는 예외를 의미
     * 2. 실행 후에 예외 발생 여부를 확인할 수 있다.
     * 3. RuntimeException 클래스와 그 하위 클래스를 의미한다.
     */
    
    //참고예제
    int[] numbers = new int[5];
    System.out.println(numbers[5]);
    
  }

}
