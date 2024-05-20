package pkg07_constructor;

public class Person {

  /*
   * 생성자
   * 1. 인스턴스를 생성할 때 호출되고 동작하는 메소드이다.
   * 2. 주로 new 키워드 뒤에서 호출된다
   * 3. 주요 특징
   *   1) 메소드 명이 클래스 명과 같다.(임의로 변경할 수 없다)
   *   2) 반환의 개념이 없다.(반환타입이 void 라는 의미가 아니다.
   *   3) 매개변수 처리 방법은 일반 메소드와 같다.
   * 4. 필드 초기화를 위한 용도를 주로 사용한다!!
   * */
  // 생성자도 메서드이기 때문에 리턴 값이 없다는 의미의 void 를 붙여야 하지만,
  // 모든 생성자가 리턴 값이 없으므로 void 를 생략
  /*
   * 디폴트 생성자  (기본생성자)
   * 1. 생성자가 없는 클래스는 자동으로 디폴트 생성자가 사용된다.
   * 2. 매개변수와 메소드 본문이 없는 형식을 가진다.
   *   <형식>
   *    클래스명 (){
   *    }
   * 3. 생성자가 있는 클래스는 디폴트생성자가 사용되지않는다.
   * */
  
  // 이름필드
  String name;
  
  // 생년월일 필드(8자리)
  String birthday;
  
  // 디폴트 형식의 생성자
  Person(){
    System.out.println("Person() 생성자 호출");
  }
  
  //name 필드의 초기화를 하는 생성자
  Person(String paramName){ // paramName = 제니퍼 들어있음
    System.out.println("Person(String paramName) 생성자 호출");
    name = paramName;    
  }
  
 //name 필드의 초기화를 하는 생성자
  Person(String pName , String pBirthday){ 
    System.out.println("Person(String pName , String pBirthday) 생성자 호출");
    name = pName;
    birthday = pBirthday;
        
  }
  
  
  // 이름, 생년월일 출력
  void print() {
    System.out.println("이름 :"+ name + ", " + "생일 : "+ birthday);
  }
}






