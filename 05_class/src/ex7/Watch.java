package ex7;

public class Watch {

  private int hour;
  private int minute;
  private int second;
  
  
  public Watch(int hour, int minute, int second) {
    System.out.println("Watch(int hour, int minute, int second) 생성자 호출"); 
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  
  public void addHour(int hour) {
    this.hour += hour - 24;
  }
  public void addMinute(int minute) {
    this.minute += minute - 60;
    if( minute > 60) {
      hour += minute / 60;
    }
  }
  public void addSecond(int second) {
    
  }
  
  public void time() {
    System.out.println( hour + ":" + minute + ":" + second  + " 입니다");
  }
  
  
  
}
