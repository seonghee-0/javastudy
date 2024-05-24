package pkg03_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

  /*
   * Collection<E> (Interface)
   * ↑
   * List<E>       (Interface)
   * ↑
   * ArrayList<E>  (Class)
   * 
   */
  
  public static void ex1(){
    // ArrayList<E> 선언
    List<Integer> numbers;
    
    //numbers 인스턴스 생성
    numbers = new ArrayList<Integer>(); // 기본 capacity = 10 (길이가 10인 배열)
  
    //요소 추가하기 (0부터 자동으로 들어감)
    numbers.add(10); // index 위치 0 자리에 들어감
    numbers.add(20); // index 위치 1 자리에 들어감
    
    //요소 확인하기
    System.out.println(numbers.get(0)); // index 0에 저장된 데이터를 가지고옴
    System.out.println(numbers.get(1)); // index 1에 저장된 데이터를 가지고옴
  }

  public static void ex2() {
    
    // ArrayList<E> 선언과 생성
    List<String> movies = new ArrayList<String>();
    
    // 요소 저장
    movies.add("범죄도시");
    movies.add("밀수");
    
    // 저장된 요소의 개수
    int size = movies.size();
    
    // for 문 활용한  ArrayList<E> 순회
    for(int i = 0; i < size; i++) {
      System.out.println(movies.get(i));
    }
    
    // 위와 같이 동작하지만 메소드 호출이 여러번 진행되기 때문에 좋지 않다.
    //    for(int i = 0; i < size; i++) {
    //      System.out.println(movies.get(i));
    //    }
  }
  
  public static void ex3() {
    // ArrayList<E> 초기화하기(배열/가변인자) 
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    
    // List <E>는 toString 오버라이드 되어있다.
     System.out.println(numbers);
    
    // ArrayList<E> 초기화하기(배열)
     String[] array = {"game", "study", "sleep"};
     List<String> todos = Arrays.asList(array);
     System.out.println(todos);
     /* 주의사항 */
     // 가변인자와 배열을 이용해 생성한 List 는 크기를 변경할 수 없다.
     // 요소를 추가하거나, 삭제할 수 없다.
      
     numbers.add(4); // UnsupportedOperationException 예외 발생
  }
  
  public static void ex4() {
    List<String> menu = new ArrayList<String>();
    menu.add("찌개");
    menu.add("삼겹살");
    menu.add("계란찜");
    
    // 요소 수정
    menu.set(0, "상추");// set(인덱스위치, 수정할 값);
    
    // 요소 삭제
    String removed = menu.remove(0); // 지워진 아이템이 반환된다.
    System.out.println(removed);
    
    String target = "계란찜";
    if( menu.remove("계란찜")) {
      System.out.println(target + "삭제성공");
    }else {
      System.out.println(target + "삭제성공");
    } 
   System.out.println(menu);
  }
  
  public static void ex5() { // int num, String title, double star, String createDt 

    List<Webtoon> webtoons = new ArrayList<Webtoon>();
    
    
    webtoons.add( new Webtoon(1, "웹툰1", 4.0, "24-05-23" ));
    webtoons.add( new Webtoon(2, "웹툰2", 5.0, "24-05-24" ));

    // for(요소 : 배열 / 리스트)
    for(Webtoon webtoon : webtoons) {
      System.out.println(webtoon);
    }
  }
  
  public static void main(String[] args) {
    ex5();
  }

}
