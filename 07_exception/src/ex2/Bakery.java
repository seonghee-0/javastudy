package ex2;

/**
 * 1가지 종류의 빵을 파는 빵집
 */
public class Bakery {

  // field
  public static final int PRICE = 1000;  // 빵 하나의 가격
  private int count;  // 판매할 빵의 개수
  private int money;  // 빵집이 가지고 있는 돈
  
  // constructor
  public Bakery(int count, int money) {
    super();
    this.count = count;
    this.money = money;
  }

  // getter / setter
  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  
  // method
  
  /**
   * 판매 메소드<br>
   * 고객(Customer)으로부터 구매할 빵의 개수와 돈을 전달 받아서 빵을 판매한다.<br>
   * @param count 고객이 구매하려는 빵의 개수
   * @param money 고객이 빵을 사려고 내는 돈
   * @return BreadChange 빵과 거스름돈
   * @throws RuntimeException 판매할 빵이 부족, 거스름돈이 부족, 고객이 돈을 안 냄, 고객이 낸 돈이 부족함
   */
  public BreadChange sell( int count, int money) throws RuntimeException{
    
    
    if(this.count < count  ) {
      throw new RuntimeException( "빵이 부족합니다.");
    }
    if(this.money < money - PRICE * count ) {
      throw new RuntimeException( "거스름돈이 부족합니다.");
    }
    
    if( money <= 0 ) {
      throw new RuntimeException( "돈을 지불하지 않았습니다.");
    }
    
    System.out.println("판매 완료!");
    
    return null;
  }
  
}