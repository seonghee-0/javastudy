package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class OpenApi {

  public static void main(String[] args) {

    /*
     * 내 인증키 :
     * v%2FeJIea5ZORxgTJ8GmtuGGQnexOMWNy4GMIzYz13fDbTOJvf39wI%2FyQAtnzFvfxkUyL%
     * 2BZBCox%2FAlTkEVFmBIhQ%3D%3D 요청 주소 :
     * http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath
     */
try {
  StringBuilder urlBuilder = new StringBuilder(
      "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath"); /* URL */
  urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
      + "=v%2FeJIea5ZORxgTJ8GmtuGGQnexOMWNy4GMIzYz13fDbTOJvf39wI%2FyQAtnzFvfxkUyL%2BZBCox%2FAlTkEVFmBIhQ%3D%3D"); /*
                                                                                                                   * Service
                                                                                                                   * Key
                                                                                                                   */
  urlBuilder
      .append("&" + URLEncoder.encode("searchYear", "UTF-8") + "=" + URLEncoder.encode("2022", "UTF-8")); /* 2022 */
  urlBuilder
      .append("&" + URLEncoder.encode("siDo", "UTF-8") + "=" + URLEncoder.encode("2300", "UTF-8")); /* 인천광역시 2300 */
  urlBuilder
      .append("&" + URLEncoder.encode("guGun", "UTF-8") + "=" + URLEncoder.encode("2304", "UTF-8")); /* 부평구 2304 */
  urlBuilder
      .append("&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /* 결과형식(json) */
  urlBuilder
      .append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /* 검색건수 10 */
  urlBuilder
      .append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지 번호 1 */

  URL url = URI.create(urlBuilder.toString()).toURL();
  HttpURLConnection conn = (HttpURLConnection) url.openConnection();

  conn.setRequestMethod("GET");
  conn.setRequestProperty("Content-type", "application/json");

  System.out.println("Response code: " + conn.getResponseCode());
  
  BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    
  conn.connect();
  
  if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
    throw new RuntimeException("접속 실패");
  }
  

  // 응답 결과
  StringBuilder sb = new StringBuilder();
  String line;
  while ((line = rd.readLine()) != null) {
    sb.append(line);
  }    

  rd.close();
  conn.disconnect();
  
  
  String result = sb.toString();
  System.out.println(result);
  
  
  JSONObject obj = new JSONObject(result);
  JSONArray items = obj.getJSONObject("items").getJSONArray("item");
  
  List<Accident> acs = new ArrayList<Accident>();
  
  for(int i = 0, length = items.length(); i < length; i++) {
    JSONObject item = items.getJSONObject(i);
    String occrrnc_dt  = item.getString("occrrnc_dt");
    int dth_dnv_cnt = item.getInt("dth_dnv_cnt");
   
    Accident ac = new Accident(occrrnc_dt, dth_dnv_cnt);
    acs.add(ac);
  }
  
  for(Accident ac : acs) {
    System.out.println( ac.getOccrrnc_dt() +"_" + ac.getDth_dnv_cnt());
  }

  } catch (IOException e) {
    e.printStackTrace();
  }

  }
}

