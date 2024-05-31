package openapi;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * @NoArgsConstructor
 * public Book(){ }
 */ 
/* 
 * @AllArgsConstructor
 * public Book(String title, String isbn){
 * this.title = title;
 * this.isbn = isbn;
 * }
 */
/*
 * @Setter
 * @Getter
 * @ToString 
 */
/*
 * 사용 시 주의사항
 * 1. lombok 은 설치 된 후 사용해야 한다.
 * 2. 설치 이후 기존 lombok 코드를 모두 지우고 다시 만들어야 한다.
 * 3. 필드명이 mNo, bNo, rNo 처럼 첫 글자만 소문자이고 두번째 글자부터 대문자인 경우 문제가 발생함
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
  private String title;
  private String isbn;
}
