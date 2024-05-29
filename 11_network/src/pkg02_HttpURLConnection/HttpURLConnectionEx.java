package pkg02_HttpURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HttpURLConnectionEx {

  public static void ex1() {
    
    String spec = "https://www.naver.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    try {
      
      url = URI.create(spec).toURL();
      con = (HttpURLConnection) url.openConnection(); // casting 해야함
      
      /*
       * HTTP Status (상태 코드)
       * 1. 200 : 정상코드
       * 2. 4XX : 요청의 문제 (클라이언트 오류) => 대표적 404 Not Found
       * 3. 500 : 서버의 문제
       */
      
      int status = con.getResponseCode();
      System.out.println(status == HttpURLConnection.HTTP_OK ? "정상" : "비정상");// 정상인지 확인 HTTP_OK => 200코드
      
      // 접속해제
      con.disconnect();
      
    } catch (MalformedURLException e) { // MalformedURLException : 형태가 잘못 된 url
      e.printStackTrace(); 
    } catch (IOException e) { 
      e.printStackTrace(); 
    } 
    
  }
  
  public static void ex2() {
    String spec = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
    URL url = null;
    HttpURLConnection con = null;
    
 try {
      
      url = URI.create(spec).toURL();
      con = (HttpURLConnection) url.openConnection(); // casting 해야함
      
      /*
       * Content-Type
       * 1. 문서 타입    : text/xxx  (text/html, text/javascript ..)
       * 2. 이미지 타입  : image/xxx
       * 3. 비디오 타입  : video/xxx
       * 4. 데이터 타입  : application/xxx
       */
      
      // 임시테스트
      //String contentType = con.getContentType();
      //System.out.println(contentType.startsWith("image/") ? "이미지" : "이미지 아님"); //contentType이 이미지인지 아닌지 구분
      //System.out.println(contentType);
      
      /* 요청 헤더 확인하기 */
      // 헤더 명시하기 
      String contentType = con.getRequestProperty("Content-Type");
      String contentLength = con.getRequestProperty("Content-Length");
      String userAgent = con.getRequestProperty("User-Agent");
      System.out.println(contentType);
      System.out.println(contentLength);
      System.out.println(userAgent);
      
      // 전체 헤더 확인하기
      for(Entry<String, List<String>> header : con.getRequestProperties().entrySet()) {
        System.out.println( header.getKey() + ":" + header.getValue() );
      }
      
      
    } catch (IOException e) { 
      e.printStackTrace(); 
    } 
    //접속해제
     con.disconnect();
} 
  public static void main(String[] args) {
    ex2();
  }

}
