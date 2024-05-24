package pkg02_generic_type;

public class Box<T> {
  /*
   *  generic type 제네릭타입
   * 1. 일반화 되어 있는 타입을 의미.
   * 2. 인스턴스 생성 시점(new)에 어떤 타입을 사용할 것인지 정확하게 결정한다. (타입의 구체화)
   * 3. 오직 참조타입만 사용할 수 있다. (제네릭 타입으로 전달할 수 있는 타입은 reference(참조) 타입이 유일하다.)
   * primitive 필요한 경우 해당 타입의 wrapper class 를 사용해야한다.   
   */

 // 관례상 대문자사용, 의미있는단어 약자를사용
 
  private T data;

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
