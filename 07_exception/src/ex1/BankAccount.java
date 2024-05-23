package ex1;

public class BankAccount {

  /* field */
  private long balance;// 계좌 잔액을 저장할 balance 필드 선언
  
 
  private String accNo; // 계좌 번호를 저장할 accNo 필드 선언
  
  /* constructor */ 
  public BankAccount(long balance, String accNo) {
    super();
    this.balance = balance;
    this.accNo = accNo;
  }
  
  /* getter | setter */ 
  public long getBalance() {
    return balance;
  }
  
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  public String getAccNo() {
    return accNo;
  }
  
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  
  

  /* method */
  // 입금
  public void deposit(long money) throws RuntimeException{
    // 직접 예외 만들어서 던지기 (마이너스 입금)
    if(money <= 0 ) {
      throw new RuntimeException( money + "원 입금 불가!");
    }
    // 정상 처리 상황
    balance += money;
    System.out.println( money + "원 입금 완료!");
  }
  
  // 출금
  public long widthdrawal(long money) throws RuntimeException{
    if(money <= 0) {
      throw new RuntimeException( money + "원 출금 불가!");
    }
    if(money  > balance) {
      throw new RuntimeException("잔액부족!(현재 잔액:" + money + "원)");
    }
    // 정상 처리 상황
    balance -= money;
    System.out.println( money + "원 출금 완료!" + "(현재잔액 : " + balance +"원)");
    return money; 
  }

  // 이체 
  public void transfer(BankAccount other, long money) throws RuntimeException{
    other.deposit(widthdrawal(money));
  }
  
  // 계좌 정보 조회
  public void inquiry() {
    System.out.println("계좌번호 :" + accNo + ", 계좌잔액 : " + balance);
  }
  


  
  
}
