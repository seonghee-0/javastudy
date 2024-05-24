package ex1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  
  // field
  private List<Product> products; //선언만하였음 
  
  //constructor - 필드초기화
  public Cart() {
    products = new ArrayList<Product>(); // 필드 선언만했기때문에 생성을해줘야함
  }
 
  // getter / setter
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
  
//물건 담기
 public void addProduct(Product product) {
   products.add(product);
 }
 
 // 물건 빼기
 public void removeProduct(int index) {
   Product product = products.remove(index);
   System.out.println("뺀 물건 : " + product.getName());
 }
 
 // 물건 빼기
 public void removeProduct(Product product) {
   if(products.remove(product)) {
     System.out.println("뺀 물건 : " + product.getName());
   }
 }



}
