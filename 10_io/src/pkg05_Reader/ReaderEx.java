package pkg05_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderEx {
  
  /*
   * java.io.Reader
   * 1. ★문자★ 기반의 입력 스트림이다. (한글, 영문 모두 동일하게 처리할 수 있다.)
   * 2. 모든 문자 기반 입력 스트림의 슈퍼 클래스이다.
   * 3. 입력 단위
   *   1) int    (한글자를 저장해서 내보냄) 
   *   2) char[] (여러 글자)
   *   3) String
   */
  
  public static void ex1() {
    File dir = new File("/storage");
    File file = new File(dir, "1.txt");
    
    try(FileReader in = new FileReader(file)) {
      
      // 읽어 들인 글자를 쌓아 둘 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // 한번에 3글자 읽기
      char[] cbuf = new char[3];
      
      // 실제로 읽은 글자 수
      int readChar = 0;
      
      // 반복해서 읽어서 StringBuilder 에 보관하기
      while((readChar = in.read(cbuf)) != -1){
        builder.append(cbuf, 0, readChar);
      }
      
      // 확인
      System.out.println(builder.toString());
      // builder 는 최종적으로는 string 으로 바꿔서 확인하는게 좋다.
      // StringBuilder 객체를 String 객체로 바꾸는 방법
      // 1. new String(builder)
      // 2. builder.toString()
      
      
    } catch (IOException e) {
      e.printStackTrace();
     }
    
  }
  
  public static void ex2() {
    File dir = new File("/storage");
    File file = new File(dir, "2.txt");
    
    try(BufferedReader in = new BufferedReader(new FileReader(file))) {
      
      // BufferedReader 클래스의 장점
      // 1. 속도가 빠르다.
      // 2. readLine() 메소드를 이용해 한 줄 단위로 읽을 수 있다.
      
      
      StringBuilder builder = new StringBuilder();
      String line = null;
      // 읽은게없으면 -1이 아닌 null 을 반환한다.(string 이기 때문)
      while((line = in.readLine()) != null) {
        builder.append(line + "\n");
      }
      
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void ex3() {

    //InputStream →  InputStreamReader 를 이용해서 Reader 로 변환하기
    
    File dir = new File("/storage");
    File file = new File(dir, "3.html");
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
      //그 리더에서 버퍼가 끼워진다 <- 리더로 바뀌고 <- 바이트입력
      StringBuilder builder = new StringBuilder();

      String line = null;
      while((line = in.readLine()) != null) {
        builder.append(line + "\n");
      }
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  
  public static void main(String[] args) {
    ex2();
  }
  
  
  
  
  
  
  
  
  
  
  

}
