package pkg03_string;
//학습해보기 중요
public class StringBuilderEx {

  /*
   *         | StringBuffer    | StringBuilder
   * --------|-----------------|--------------
   *  since  | JDK 1.0         | JDK 1.5
   *  thread | multiple thread | single thread
   *  speed  | slow            | fast
   */
  
  public static void main(String[] args) {
    
    // StringBuilder 객체 생성
    StringBuilder builder = new StringBuilder();
    
    // 문자열 추가하기
    builder.append("바");
    builder.append("나");
    builder.append("나");
    
    String result = builder.toString(); // builder 는 최종적으로는 string 으로 바꿔서 확인하는게 좋다.
    // StringBuilder 객체를 String 객체로 바꾸는 방법
    // 1. new String(builder)
    // 2. builder.toString()
    System.out.println(result);

  }

}