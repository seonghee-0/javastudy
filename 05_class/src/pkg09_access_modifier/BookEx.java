package pkg09_access_modifier;

public class BookEx {

  public static void main(String[] args) {
  
    // book 타입의 인스턴스 생성 (생성자가 호출되는 부분)
    Book book1 = new Book("콩쥐와팥쥐", 100);
    Book book2 = new Book("좋은생각", "누군가");
    Book book3 = new Book("소나기", "황순원", 200);
    
    // book1.title = "이름바꿀래"; => private 로 처리했기때문에 Book 이외의 클래스에서 사용 불가 
                                   // 변경하려면 아래와 같이 새로운 이름으로 
                                   // book 에 메소드를 만들어서 사용해야함

    // setter 를 이용한 필드 값 변경 (저장)
    book1.setTitle("신)콩쥐와팥쥐");
    book1.setWriter("김작가");
    book1.setPrice(150);
    
    // getter 를 이용한 필드 값 변경 (출력)
    System.out.println(book1.getTitle());  // System.out.println(book1.title);이 안되니까 대신 사용
    System.out.println(book1.getWriter()); // System.out.println(book1.writer);이 안되니까 대신 사용
    System.out.println(book1.getPrice());  // System.out.println(book1.price);이 안되니까 대신 사용
    
    // 인스턴스 정보 출력
    book1.print();
    book2.print();
    book3.print();
    
    
  }
  
}
