package pkg01_URL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class URLEx {

  public static void main(String[] args) {

    /* < URL 구성 >
     * 프로토콜://호스트:포트번호/서버내경로/?파라미터=값&파라미터=값#레퍼런스(참조위치)
     *     http://example.com:8000/index/list?
     */     
    
    String spec = "http://example.com:9090/blog/web/list?page=1&sort=DESC#footnote";
    
    URL url = null;
    
    try {
      url = URI.create(spec).toURL(); //Uri 를 만들어서 Url 로 변환해라 (uri 가 url 을 포함한다.) 
      System.out.println(url.getProtocol());            // 프로토콜
      System.out.println(url.getHost());                // 호스트
      System.out.println(url.getPort());                // 포트
      System.out.println("Path : " + url.getPath());    // 경로
      System.out.println("Query : "+ url.getQuery());   // 파라미터
      System.out.println("File : " + url.getFile());    // 파일 : 경로 + 파라미터
      System.out.println(url.getRef());                 // 레퍼런스
      
      URLConnection con = url.openConnection();

      // url 로 분석을 해서 connection 접속을 알아내고, 그 접속을 가지고 stream 을 생성하는 것
      
    } catch (MalformedURLException e) { // MalformedURLException : 형태가 잘못 된 url
      e.printStackTrace(); 
    } catch (IOException e) { // MalformedURLException : 형태가 잘못 된 url
      e.printStackTrace(); 
    } 
        
  }
}
