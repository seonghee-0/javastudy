package pkg08_this;


/*
 * this
 * 1. 현재 인스턴스의 정보(참조)를 의미한다.
 * 2. 오직 동일한 클래스 내부에서만 사용 가능하다. (외부에서는 인스턴스하여 인스턴스명으로 접근 가능)
 * 3. 현재 인스턴스와 동일하게 사용할 수 있다.
 *   1) this.필드   (this 를 이용하여 필드를 호출할 수 있다)
 *   2) this.메소드()
 * 4. 생성자 내부에서 this() 호출을 이용하여 다른 생성자를 호출할 수 있다.  ----------- 나중에 공부해보기 (book.java 참고)
 * 5. 메소드 체이닝(연속해서 메소드를 호출)을 위해서 return this; 를 활용할 수 있다.--- 나중에 공부해보기 (pkg06_field 참고)     
 */
//=> 매개변수와 필드 이름이 동일한경우 this 를 사용해 구분함


public class Computer {

  // model 필드
  String model;
  
  //생성자
  Computer(String model){
    this.model = model;
  }
  
  //메소드
  void print() {
    System.out.println(this);
    System.out.println(model);
  }
  
  
}
