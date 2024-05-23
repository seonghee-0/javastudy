package pkg02_finally;

public class FinallyEx {

  public static void main(String[] args) {
    
    /* finally 블록 : try-catch 구문의 마지막에 추가할 수 있는 선택 블록으로 항상 마지막에 실행된다. */
    
    
    try {
      String name1 = "alice";
      String name2 = "alice";
      
      System.out.println(name1.equals(name2) ? "같은 이름" : "다른 이름"); 
                     // name2.equals(name1) : name2는 null 값이 아니기때문에 메소드를 호출할 수 있어서 NullPointerException이 떨어지지 않는다.    
    } catch(NumberFormatException e) {
      System.out.println("null값이 메소드를 호출합니다.");
    } finally { // 어떤 예외가 발생하던 안하던 무조건 실행함.
      System.out.println("종료되었습니다.");
    }
    
    
  }

}
