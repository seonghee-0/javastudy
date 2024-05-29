package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {
  /* Stream 이란?  
   * - 데이터 흐름 
   * - 프로그램은 외부에서 데이터를 읽거나 외부로 데이터를 출력하는 작업이 빈번하게 일어나는데,
   *    이때 데이터는 어떠한 통로를 통해서 데이터가 이동된다. 이 통로를 Stream 이라고 한다.
   */
  
  /*
   * < 메소드(Method) >                             < 설명 >
   * void close()                               OutputStream을 닫는다.
   * void flush()                               버퍼에 남아있는 출력 스트림을 출력한다.
   * void write(byte[] b)                       버퍼의 내용을 출력한다. 
   * void write(byte[] b, int off, int len)     b 배열 안에 있는 시작 off 부터 len 만큼 출력한다.
   */
  
  /*
   * < java.io.OutputStream >
   * 1. ★바이트★ 기반의 출력 스트림이다.
   * 2. 모든 바이트 기반 출력 스트림의 슈퍼 클래스이다.
   * 3. 출력 단위
   *    1) int
   *    2) byte[] 
   *    - 바이트단위 입출력 스트림 : 그림, 멀티미디어, 문자 등 모든 종류의 데이터들을 주고받을 수 있다.
   *    - 문자단위 입출력 스트림 : 오로직 문자만 주고받을 수 있게 특화되어 있다.
   */

  public static void ex1() {
    
    // File dir
    File dir = new File("/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    //File file
    File file = new File(dir, "1.dat");
    
    
    // FileOutputStream : 바이트 파일(이진 파일)을 만드는 스트림
    FileOutputStream out = null; // 초기화 null
    
    try {
      
      // 출력 스트림 생성(모드 : 생성 모드 - 항상 파일을 새로 만든다.)
      out = new FileOutputStream(file);
      
      // 출력할 데이터 ( 파일로 보낼 데이터)
      int c ='H';  
      String s = "ello world";
      byte[] b = s.getBytes();      
      
      //출력
      out.write(c);
      out.write(b);
      
       // (선택 작업 : 플러싱)
      out.flush();///선택구문
      
      // 파일 만들기 결과 출력
      System.out.println(file.getPath() + "파일이 생성되었습니다.");
      System.out.println(file.length() + "바이트 크기의 생성되었습니다.");
      
      // 스트림 닫기 
      out.close();
      
    } catch (FileNotFoundException e) {
        e.printStackTrace();
     } catch (IOException e) {
        e.printStackTrace();
    } finally {
        
      // 스트림 닫기 (finally가 안전한 위치이지만 보통 try 안에 넣음 -- 56번줄)
//      try {
//        if(out != null)
//        out.close();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
    }
    
  }

  public static void ex2() {
    File dir = new File("/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "1.dat");
    FileOutputStream out = null;
    
    try {
      // 출력 스트림 생성(모드 : 추가 모드 - 기존 파일에 추가하기)
      out = new FileOutputStream(file, true);
      out.write('\n');
      out.write("nice to meet you".getBytes());
      
      out.flush();///선택구문
      
      out.close();
    
    }catch (IOException e) {
      e.printStackTrace();
   }
    
  }
  
  
  public static void ex3() {
    // BufferedOutputStream : 내부 버퍼를 가지고 있어 출력 속도가 향상된 바이트 출력 스트림
    
    File dir = new File("/storage");
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "2.dat");
    
    BufferedOutputStream out = null;
    try {
       //출력 스트림 생성(BufferedOutputStream 은 보조 스트림이라서 단독 사용이 불가능)
       out = new BufferedOutputStream(new FileOutputStream(file));
       
       String s = "hello world";
       byte[] b = s.getBytes();
       out.write(b, 0, 5) ; //index b 에서 0~5까지 "hello"를 파일에 출력
       
       out.flush(); ///선택구문
       
       out.close();
      
    }catch(IOException e){
      e.printStackTrace(); //캐치블록은 비우면 안됨 !!
    }
    
  }
  public static void main(String[] args) {
    ex3();
  }

}
