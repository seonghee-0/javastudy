package pkg02_generic_type;

public class BoxEx {

  public static void main(String[] args) {

    // 정수를 저장할 수 있는 box1
    Box<Integer> box1 = new Box<Integer>();
    
    box1.setData(10); //set 으로 데이터 저장
    System.out.println(box1.getData()); //get 으로 데이터 가져오기
    
    // 문자열을 저장할 수 있는 box2  
    Box<String> box2 = new Box<>(); // 생성자의 구체화 타입은 생략 가능하다. <String> 뒤에만 생략가능!! (앞은 불가능)
    box2.setData("hello");        //   ㄴ  Box<String> box2 = new Box<String>();  => Box<String> box2 = new Box<>();        
    System.out.println(box2.getData()); 
  }

}
