package pkg01_date_time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTimeEx {

  public static void ex1() {
    java.util.Date date1 = new java.util.Date();
    System.out.println(date1);
    
    java.util.Date date2 = new java.util.Date(1000 * 60 * 60 * 24 * 30L + 123456); // int 범위를 벗어나기때문에 하나를 long 타입으로 변환
    System.out.println(date2);
  }
  
  public static void ex2() {
    // 현재 시간의 Timestamp 알아내기
    long timestamp = System.currentTimeMillis(); //밀리초(1000분의 1초)
    
    // util 의 날짜를 데이터베이스(sql) 날짜/시간 형식에 맞춘 date
    java.sql.Date date = new java.sql.Date(timestamp); 
    
    System.out.println(date);
  }
  
  public static void ex3() {
    Calendar date = Calendar.getInstance();
    System.out.println(date);
    
    int year = date.get(Calendar.YEAR);
    int month = date.get(Calendar.MONTH); //MONTH는 사용 주의) 0 ~ 11로 나옴!!
    int day  = date.get(Calendar.DAY_OF_MONTH); // 달 기준 일수
    
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
  }
  
  public static void ex4() {
     java.util.Date date1 = new java.util.Date();
     java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());
     SimpleDateFormat format1 = new SimpleDateFormat("yy/MM/dd a h:mm:ss.SSS");  //a = 오전 오후
     SimpleDateFormat format2 = new SimpleDateFormat("yyyy-M-d H:mm:ss.SSS"); 
     
     String formatedDate1 = format1.format(date1);
     String formattedDate2 = format2.format(date2);
     
     System.out.println(formatedDate1);
     System.out.println(formattedDate2);
  }
  
  public static void ex5() {
    // 날짜 : java.time.LocalDate
    // 시간 : java.time.LocalDateTime
    // 둘다 : java.time.LocalDateTime
    
    // 현재 날짜와 시간
    LocalDateTime date = LocalDateTime.now();
    System.out.println(date);
    
    // 각 단위 가져오기
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfMonth(); // 달 기준으로 며칠인지
    int hour = date.getHour();
    int minute = date.getMinute();
    int second = date.getSecond();
    
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(hour);
    System.out.println(minute);
    System.out.println(second);
    
    // 원하는 형식 지정하기
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a h시 mm분 ss초");
    String formattedDate = formatter.format(date);
    System.out.println(formattedDate);
  }
  
  public static void main(String[] args) {
    ex3();
  }

}
