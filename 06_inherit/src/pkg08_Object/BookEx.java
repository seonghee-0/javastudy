package pkg08_Object;

public class BookEx {

  public static void main(String[] args) {
    
    // Book 클래스 타입의 인스턴스 생성
    Book book1 = new Book("홍길동전", "허균");
    Book book2 = new Book("홍길동전", "허균");
    
    // 참조 타입의 인스턴스 동등 비교
    System.out.println(book1.equals(book2));
    
    // 인스턴스의 문자열 확인
    System.out.println(book1); // toString 은 직접 호출"(book1.toString());" 할 필요가 없음
    System.out.println(book2); //  => 인스터스만 적어도 자동으로 호출 됨

    /* 
     * Object 에 기능을 저장할 수 있다. 
     *  => (Object)부모타입으로 저장하면 부모타입의 것만 보이기때문에,
     *     기능을 불러서 쓰기위해서는 캐스팅을 한번 해야 함
     */
    
    
  }

}
