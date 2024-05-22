package pkg01_try_catch;

public class TryCatchEx {

  public static void ex1() { // main 이 static 이기 때문에 static 만 호출가능하다
    // 아래 예외가 발생하는 상황을 만들어 봄
    String s = "1.5";
    int iNumber = Integer.parseInt(s);
    System.out.println(iNumber);
  }
  
  public static void ex2() {
    /*
     * 예외처리란?
     * 1. 예외가 발생했을 때 프로그램이 비정상 종료되지 않도록 적절히 처리하는 것을 의미한다.
     * 2. 예외 발생을 막는 것은 애초에 불가능하다.
     */
    
    /*
     * 예외 처리 구문
     * 1. try 블록 : 실행할 코드를 작성하는 블록으로 이 곳에서 예외가 발생할 수 있다.( 블록 : "{}"을 의미)
     * 2. catch 블록 :try 블록에서 예 발생한 경우 해당 예외를 처리하는 블록
     * 3. 형식
     *    try { 
     *        실행 코드
     *     }catch(매개변수) {
     *        예외 처리 코드 
     *     }
     */
    // NumberFormatException < RuntimeException < Exception < Throwable 
    
    String s = "1.5";
    try {
      int iNumber = Integer.parseInt(s);
      System.out.println(iNumber);
    } catch(NumberFormatException e){ // 일반적으로는 Exception 으로 잡음 (이름은 대부분 e 로 작성한다.)
      System.out.println( s + "정수만 변환할 수 있습니다.");
    }
  } 
  
  public static void main(String[] args) {
    ex2();
    
  }

}
