package pkg01_one_dim;

public class ArrayEx {
  // JVM 은 main 메소드만 호출한다.
  public static void ex1() {
  
    /*
     * 배열
     * 1. 여러개의 변수를 하나의 이름으로 관리하는 자료구조이다.
     * 2. 각 변수의 구분을 위해서 인덱스를 활용한다.
     * 3. 용어
     *   1) 배열이름 : 모든 변수의 이름
     *   2) 배열길이 : 변수의 개수
     *   3) 배열요소 : 각각의 변수
     *   4) 인덱스   : 배열요소를 구분하는 숫자 (0부터 시작하는 정수값)
     */
    
    /*
     * 배열의 선언과 생성
     * 1. 배열은 선언과 생성과정이 필요하다.
     * 2. 배열의 선언
     *   1) 배열을 사용하겠다고 알리는 것이다.
     *   2) 배열은 참조 타입의 변수로 생성된다.
     *   3) 형식
     *     (1) 자료형[] 배열이름; (추천!!)
     *     (2) 자료형 배열이름[];
     * 3. 배열의 생성
     *   1) 배열의 길이를 정하고 실제 변수를 만드는 것이다.
     *   2) 배열의 모든 요소(변수)는 자동으로 초기화된다. (0, 0.0, false, null)
     *   3) 형식
     *      new 자료형[배열길이];
     */

    /*
     *    ┌--------------┐
     * arr│  0x10000000  │ 참조타입의 배열이름
     *    │--------------│
     *    │     ...      │
     *    │--------------│
     *    │       0      │ 0x10000000  :  arr[0]
     *    │--------------│
     *    │       0      │ 0x10000004  :  arr[1]
     *    │--------------│
     *    │       0      │ 0x10000008  :  arr[2]
     *    └--------------┘
     */
    
    // 배열의 선언
    int[] arr;   
    // 배열의 생성
    arr = new int[3];
    
    // 배열의 요소 확인
    System.out.println(arr[0]); //0부터 시작해야함
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
  
  public static void ex2() {
    /*
     * 배열의 길이
     * 1. 생성된 배열의 길이는 수정할 수 없다.
     * 2. 배열의 길이는 length 필드를 통해서 확인할 수 있다.
     * 3. 형식
     *    배열이름.length
     */
    
    // 배열의 선언과 생성을 동시에 진행
    int[] arr = new int[3];
    
    // 배열의 길이 확인
    System.out.println(arr.length); // 3이 출력 됨
    
    // 배열의 길이를 활용한 배열 요소의 접근 (index 를 변수 i 로 사용)
    for(int i = 0; i < arr.length; i++) { // 0부터 길이 전까지 반복
      System.out.println(arr[i]);
    }
    
    // 배열의 마지막요소는 항상 인덱스가 "길이 - 1" 로 정해져있음!
    System.out.println(arr[arr.length - 1]);// 배열의 마지막요소 출력
  }
  
  
  public static void ex3() {
    /*
     * 배열의 초기화
     * 1. 배열을 생성할 때 초기값을 전달할 수 있다.
     * 2. 중괄호 {}를 이용해서 초기 값들을 한번에 전달한다.
     * 3. 형식
     *   1) 배열의 선언과 반드시 함께 하는 초기화
     *      자료형[] 배열이름 = {값1, 값2, 값3}
     *   2) 배열의 선언과 분리할 수 있는 초기화
     *      자료형[] 배열이름;
     *      배열이름 = new 자료형[]{값, 값2, 값3};
     */
    
    // 배열의 선언과 반드시 함게 해야하는 초기화
    String[] seasons = {"spring","summer","autumn","winter"};
    for (int i = 0; i < seasons.length; i++) {
      System.out.println(seasons[i]);
    }
    
    // 배열의 선언과 분리할 수 있는 초기화
    String[] hobbies;
    hobbies = new String[] {"game","movie","swim"};
    for(int i = 0; i < hobbies.length; i++) {
      System.out.println(hobbies[i]);
    }
  }
  
  public static void ex4() {
    /*
     * advanced for
     * 1. 향상 for 문이다.
     * 2. 인덱스를 지정하지않는 for 문이다.
     * 3. 형식
     *    for(배열요소:배열){ }
     */
    
    // 배열의 생성 및 초기화
    String[] movies = {"범죄도시","파묘"};
    
    // advanced for
    for(String movie : movies) { // movies 에 있는 영화들을 movie 로 옮겨라
      System.out.println(movie);
    }
    
        
  }
  public static void main(String[] args) { // JVM 은 main 메소드만 호출!!!
    // 메소드를 실행하기위해선 호출을해줘야함 => 메소드();
    ex4();
    
    
    /*
    int request = 1;
    switch(request) {
    case 1:
      ex1();
      break;
    case 2:
      ex2();
      break;
    }
    
    ex1(); 
    //5번 반복시키기
    for(int a=1; a <=5; a++) {
      ex1();
    }
    */
    
  }
  

}
