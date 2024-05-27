package ex3;

import java.util.ArrayList;
import java.util.List;

public class Bus {
  
  private List<Seat> seats; //여러개의 좌석을 가진 seat List
  
  public static final int LIMIT = 5; //final 은 초기화가 바로 이루어져야함.
  
  private int numOfPerson;
  
  public Bus() {
    // 구현
    seats = new ArrayList<Seat>();
    for(int i = 0; i < LIMIT; i++) { //0부터 LIMIT(25)까지 좌석생성
      seats.add(new Seat());
      
    } numOfPerson = 0; //탄사람이 없다.
    
    
  }
  
  // 버스 타기 (항상 앞자리부터 채운다.)
  public void on(Person person) throws RuntimeException{
    if(numOfPerson == LIMIT) { 
      throw new RuntimeException("만석입니다."); 
    }
    for(int i=0; i < LIMIT; i++) {
      Seat seat = seats.get(i);// 좌석
      Person p = seat.getPerson(); //앉아있는사람
      if( p == null) { // p(앉아있는사람)이 null 값이면 (비어있는자리)
        seat.setPerson(person); // 그 자리에 person 을 채워줘라
        numOfPerson++;
        break;
      }
    }
  }
  
  // 버스 내리기( 내리는 사람의 좌석 번호가 전달된다
  public void off(int seatNo) throws RuntimeException{
    // 구현
    if(seatNo <= 0 || seatNo > LIMIT) { // 좌석이 0이랑 같거나 작을경우 , 25보다 클경우
      throw new RuntimeException("없는 좌석입니다."); 
      
    }
    int i = seatNo - 1;
    Seat seat = seats.get(i);
    Person p = seat.getPerson();
    if(p != null) {
      seat.setPerson(null);
      numOfPerson--;
    }
 
  }
  
  // 탑승자 명단
  public void passengerList() {
    // 01번 좌석 : 홍길동
    // 02번 좌석 : 김두한
    // 03번 좌석 : 비어있음
    //...
    // 25번 좌석 : 비어있음
    for(int i = 0; i < LIMIT; i++) {
      Person p = seats.get(i).getPerson();
      String seatNo = String.format("%02d",i+1); // 인덱스보다 하나 더 큰게 시트번호이기때문에 +1
      System.out.println(seatNo + "번 좌석 :");
      if(p == null) {
        System.out.println("비어있음");
      }else {
        System.out.println(p.getName());
      }
    }
  }
  
}
