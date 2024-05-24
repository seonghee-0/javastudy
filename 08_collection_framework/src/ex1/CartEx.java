package ex1;

public class CartEx {

  public static void main(String[] args) {
    // 고객 선언
    Customer customer = null;
    
    try {
    
    // 5개 물건 만들기
    Product product1 = new Product("홈런볼", 1000);
    Product product2 = new Product("빼빼로", 1500);
    Product product3 = new Product("아이스크림", 2000);
    Product product4 = new Product("이클립스", 2500);
    Product product5 = new Product("껌", 500);
    
    // 고객 만들기
    customer = new Customer(5000);    
    
    // 고객 쇼핑 (카트에 물건 담기 / 물건 빼기)
    customer.addToCart(product1);
    customer.addToCart(product2);
    customer.addToCart(product3);
    customer.addToCart(product4);
    customer.addToCart(product5);
    //customer.removeFromCart(4);
    //customer.removeFromCart(product4);
    
    // 구매
    String receipt = customer.buy();
    if(receipt != null) {
      System.out.println(receipt);
    }
    
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("customer money : " + customer.getMoney());      
    }

  }
}

