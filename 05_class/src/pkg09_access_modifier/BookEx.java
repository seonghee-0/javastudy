package pkg09_access_modifier;

public class BookEx {

  public static void main(String[] args) {
  
    // book 타입의 인스턴스 생성 (생성자가 호출되는 부분)
    Book book1 = new Book("콩쥐와팥쥐", 100);
    Book book2 = new Book("좋은생각", "누군가");
    Book book3 = new Book("소나기", "황순원", 200);
    
    // book1.title = "이름바꿀래"; => private 로 처리했기때문에 Book 이외의 클래스에서 사용 불가 
    
    // 인스턴스 정보 출력
    book1.print();
    book2.print();
    book3.print();
    
    
  }
  
}
