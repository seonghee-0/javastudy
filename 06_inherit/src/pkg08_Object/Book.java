package pkg08_Object;

import java.util.Objects;

/*
 * 클래스 호출 방식
 * 1. 패키지와 클래스를 함께 작성해야 한다.
 * 2. 패키지를 생략할 수 있는 경우가 있다.
 *   1) 같은 패키지에 저장된 클래스들 (위치가 같은 경우)
 *   2) java.lang 패키지에 저장된 클래스들( System, String 등..)
 * 3. 패키지를 생략할 수 없다면 패키지를 작성해야한다 (java.lang 패키지 아닌경우)
 *   1) import 구문을 사용하기 (import 패키지.클래스)형식 => 한 번만 작성해도됨
 *   2) 패키지.클래스                                     => 매 번 작성해야함
 */

public class Book {
  
  private String title;
  private String writer;
  
  public Book() {
    // TODO Auto-generated constructor stub
  }
  
  public Book(String title, String writer) {
    super();
    this.title = title;
    this.writer = writer;
  }
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }

  @Override
  public int hashCode() {
    return Objects.hash(title);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return Objects.equals(title, other.title);
  }
  
//  @Override
//  public boolean equals(Object obj) {       // 부모타입으로 저장하면 부모타입의 것만 보이기때문에  
//    return title.equals(((Book)obj).title); // book 타입으로 downcasting  해준다 
//  }
  
/* 
 * Object 에 기능을 저장할 수 있다. 
 * => (Object)부모타입으로 저장하면 부모타입의 것만 보이기때문에,
 *    기능을 불러서 쓰기위해서는 캐스팅을 한번 해야 함
 */

  @Override
  public String toString() { // 개발자가 보통 데이터 저장을 확인하기위해 사용한다. 호출할 필요가 없음 
    return "Book [title=" + title + ", writer=" + writer + "]";
  }
  
  
  
  

  
}
