package pkg01_arithmetic;

public class ArithmeticEx {

  public static void main(String[] args) {

    // 산술 연산
    int a = 5;
    int b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b); 
    System.out.println(a / b); //나누기 결과의 '몫'을 반환
    System.out.println(a % b); //나누기 결과의 '나머지'를 반환
    
    /* 5 나누기 2 결과를 2.5로 만드는 방법 => 5.0 / 2.0으로 처리하면 된다 (casting)*/
    
    System.out.println( (double)a / (double)b ); //int를 double로 변경
    System.out.println( a / (double)b ); // => 5 / 2.0 연산은 5.0 / 2.0 연산으로 변환된 뒤 계산된다.
    
    //증감(증가, 감소) 연산
    int x = 10;
    System.out.println(x++); // 10 : x를 사용한 뒤, x를 증가시킨다. (후위 연산)
    System.out.println(x);   // 11
    
    int y = 10;
    System.out.println(++y); // 11 : y를 증가시킨 뒤, y를 사용한다. (전위 연산)
    
    int i = 10;
    System.out.println(i--); // 10 : i를 사용한 뒤, i를 감소시킨다. (후위 연산)
    System.out.println(i);   // 9
    
    int j = 10;
    System.out.println(--j); // 9 : j를 사용한 뒤, j를 감소시킨다. (후위 연산)
    
    
  }

}
