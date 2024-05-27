package pkg08_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {


  /*
   * Map<K,V> (Interface)
   * ↑
   * HashMap<E>  (Class)
   */
  
  /*
   * < Map >
   * 1. 인스턴스(객체)를 대신할 수 있는 자료구조이다.
   *   1) Entry : Map 을 구성하는 데이터의 기본단위로 'key(키)와 value(값)' 로 구성한다. 
   *   2) Key   : 식별자. 데이터를 꺼낼 때 사용하는 고유의 식별자. - 값을 가지고 있어야함
   *             (중복 불가.절대 같은값을 가질 수 없음 => Set 로 구성되어있다)
   *   3) Value : 값. 데이터 자체. (키값이 다르다면 중복이 있을 수 있음) - 빈값일 수 있음. 
   * 
   */
  /*
   * entrySet() 메서드는 key 와 value 의 값 모두 반환
   * keySet() 메서드는 key 의 값만 출력
   */
  
  public static void ex1() {
    // Mutable ( 저장된 Entry 가 바뀔 수 있다.)
    
    // Map 타입 선언
    Map<String, String> book; 
    
    // HashMap인스턴스 생성
    // new 키워드를 이용한 생성
    book = new HashMap<String, String>(); 
    
    // Entry 추가(Key 와 Value 모두 추가)
    book.put("title", "어린왕자"); //value 타입이 object
    int price = 10000;
    book.put("price", price + "원"); // 빈문자열을 + " " 해주면 값이 문자열로 변경됨
    
    // key 를 이용해서 Value 확인하기
    System.out.println("제목 : " + book.get("title"));
    System.out.println("가격 : " + book.get("price"));
    
  }
  
  public static void ex2() {
     // Immutable (저장된 Entry 가 바뀔 수 없다.)
     // 클래스 메소드 of를 이용한 생성
     Map<String, Object> book = Map.of("title", "어린왕자", "price", 10000);  // Map.of 메소드로 맵 데이터를 초기화

     // Entry 구성을 바꾸려는 시도 해보기 (예외 발생)
     book.put("publisher", "좋은출판사"); //데이터 추가
     
  }
  
  public static void ex3() {
    
    Map<String, Object> book = Map.of("title", "소나기", "author", "황순원", "price", 1000);
    Set<String> keys = book.keySet(); // keySet() 메소드를 사용하여 Map 의 전체 key 값을 반환
    
    for(String key : keys) {
      Object value = book.get(key); 
      System.out.println(key + ":" + value); // set 은 순서가 없음 
    }
}
  
  public static void ex4() {
    Map<String, Object> book = Map.of("title", "소나기", "author", "황순원", "price", 2000);
      Set<Entry<String, Object>> entires = book.entrySet();
      for(Entry<String, Object> entry : entires) {
        String key = entry.getKey(); 
        Object value = entry.getValue();
        System.out.println(key + ":" + value); // set 은 순서가 없음 
      }
      
      
    }
  
  public static void ex5() {
    
    // Mutable 한 Map 생성 (저장된 Entry 가 바뀔 수 있다.)
    Map<String, Object> person = new HashMap<String, Object>();
    
    // 처음 사용된 key 는 Map 에 추가된다.
    person.put("name", "제시카");
    person.put("age", 30);
    person.put("isMarried", true);
    
    // Map 확인 (toString()오버라이드 되어 있다.)
    System.out.println("기존 내용"  + person);
    
    // 수정하기( 추가메소드 put() 을 그대로 사용한다.
    // 이미 사용 된 key 는 기존 내용을 수정한다.
    person.put("age", 40);
    System.out.println("나이 수정" + person);
    
    //삭제하기 (remove() 를 이용한다.
    person.remove("isMarried");
    System.out.println("married 삭제" + person);
  }
  
  public static void main(String[] args) {
    ex5();
    
  }

}
