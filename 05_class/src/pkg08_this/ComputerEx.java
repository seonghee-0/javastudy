package pkg08_this;

public class ComputerEx {

  public static void main(String[] args) {
    
    
    //Computer 타입의 인스턴스 생성
    Computer computer1 = new Computer("gram");
    Computer computer2 = new Computer("macbook");
    
    System.out.println(computer1); // computer1의 타입(pkg08_this.Computer)과 참조값(@54bedef2) 나옴
    System.out.println(computer2); // computer2의 타입(pkg08_this.Computer)과 참조값(@5caf905d) 나옴
    
    computer1.print(); //computer1의 this 와 model 출력
    computer2.print(); //computer1의 this 와 model 출력
  }

}
