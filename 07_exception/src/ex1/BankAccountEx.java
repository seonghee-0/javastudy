package ex1;

public class BankAccountEx {

  public static void main(String[] args) {
    
    try {
      // bankAccount 타입의 인스턴스 생성
      BankAccount bankAccount1 = new BankAccount(500, "0101010");
      BankAccount bankAccount2 = new BankAccount(200, "1010101");
      
      //bankAccount1.deposit(50);
      //bankAccount1.widthdrawal(50);
      bankAccount1.transfer(bankAccount2, 200);
      bankAccount1.inquiry();
      bankAccount2.inquiry();
      
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }

}
