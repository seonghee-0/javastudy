package ex3;

public class BusEx {

  public static void main(String[] args) {
    
    try {
      
      Bus bus = new Bus();
      bus.on(new Woman("지수"));  //1번 좌석
      bus.on(new Man("지호"));    //2번 좌석
      bus.on(new Man("민수"));    //3번 좌석
      bus.on(new Woman("민지"));  //4번 좌석
      bus.on(new Woman("수지"));  //5번 좌석
      
      bus.passengerList();
      
      bus.off(3); // 3번 내림
      
      bus.passengerList();
      
      bus.on(new Woman("한율")); //3번에 태우기
     
      bus.passengerList();
      
      
      int numOfPerson = 25;
      if( numOfPerson >= Bus.LIMIT) {
        
      }
    } catch (RuntimeException e) {
      System.out.println(e.getMessage()); //만차입니다, //없는좌석입니다.
      e.printStackTrace();
    }
  }

}
