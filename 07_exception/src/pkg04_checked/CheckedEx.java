package pkg04_checked;

// import java.util.Objects; 

public class CheckedEx {

  public static void main(String[] args) {

    /*
     * 클래스 호출 방식
     * 1. 패키지와 클래스를 함께 작성해야 한다.
     * 2. 패키지를 생략할 수 있는 경우가 있다.
     *   1) 같은 패키지에 저장된 클래스들 (위치가 같은 경우)
     *   2) java.lang 패키지에 저장된 클래스들( System, String 등..)
     * 3. 패키지를 생략할 수 없다면 패키지를 작성해야한다 (java.lang 패키지 아닌경우)
     *   1) import 구문을 사용하기 (import 패키지.클래스)형식 => 한 번만 작성해도됨
     *   2) 패키지.클래스                                     => 매 번 작성해야함
     *   
     */
    // 클래스 이름은 자동완성하기!
    // Objects 를 자동완성으로 생성하면 import(3번줄 참고!)가 자동으로 추가된다.
    
    /*
    * < checked exception >
    * 1. 예외처리구문( try-catch, throws)이 없으면 동작하지 않는 예외를 의미한다.
    * 2. 실행 전에 미리 예외 처리를 해야한다.
    * 3. RuntimeException 클래스가 아닌 예외 클래스들이다.
    *    (ㄴ RuntimeException < Exception < Throwable ) 
    */
    try {
      Class.forName("oracle.jdbc.OracleDriver");
      
    } catch(ClassNotFoundException e) {
      System.out.println("해당 클래스를 찾을 수 없습니다.");
    }
    
  }

}
