package pkg03_compare;

public class CompareEx {

  public static void main(String[] args) {
    // 비교 연산
    // boolean 타입의 결과(true 또는 false)를 반환
    int a = 10;
    int b = 20;
    
    System.out.println(a >  b);
    System.out.println(a >= b); //a 가 b 보다 크거나 같다
    System.out.println(a <  b); 
    System.out.println(a <= b); //a 가 b 보다 작거나 같다
    System.out.println(a == b); //a 와 b 가 같다
    System.out.println(a != b); //a 와 b 가 같지않다
    
    // *주의사항*  문자열은 동등비교(==, !=) 사용을 하지 않는다.(이유는 아래 참고)
   
    String myName = "king";
    String yourName = "king";
    System.out.println(myName == yourName); //true 를 반환하여 맞는 식 같지만 문자열을 비교한게 아닌 값(참조값)을 비교한 것
    
  }

}
