package pkg04_HashSet;

import java.util.HashSet;
import java.util.Set;

import pkg03_ArrayList.Webtoon;

public class HashSetEx {

  /*
   * Collection<E> (Interface)
   * ↑
   * Set<E>       (Interface)
   * ↑
   * HashSet<E>  (Class)
   */
  
  /*
   * < Set >
   * 1. 저장된 요소들의 순서를 관리하지 않는다.(인덱스가 없다.)
   * 2. 저장된 요소들의 중복이 없다.(모든 요소는 unique 하다)
   * 3. 집합 처리가 가능하다. (교집합, 합집합 차집합 등)
   */
  public static void ex1() {
  
    //HashSet<E> 선언과 생성
    Set<String> hobbies = new HashSet<String>();
    
    //요소 추가 (add 메소드)
    hobbies.add("뜨개질");
    hobbies.add("레고");
    hobbies.add("그림");
    hobbies.add("뜨개질"); 
    hobbies.add("레고"); //중복 저장이 안되는지 확인
    // Set<E> 은 toString() 메소드가 오버라이드 되어있다.
    
    System.out.println(hobbies);
   }
    
  public static void ex2() {
    
    Set<Webtoon> webtoons = new HashSet<Webtoon>();
    
    Webtoon webtoon1 = new Webtoon(1, "웹툰1", 4.0, "24-05-23" );
    Webtoon webtoon2 = new Webtoon(1, "웹툰1", 4.0, "24-05-23" );
    webtoons.add(webtoon1);
    webtoons.add(webtoon2);
    
    
    // 일반 for문 은 사용 불가, 향상 for 문 사용 가능.
    for(Webtoon webtoon : webtoons) { 
      System.out.println(webtoon);
    }
    
  }
  
  
  
  public static void main(String[] args) {
    ex2();
  }

}
