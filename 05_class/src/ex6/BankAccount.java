package ex6;

public class BankAccount {

  // 계좌 잔액을 저장할 balance 필드 선언
  private long balance;
  
  // 계좌 번호를 저장할 accNo 필드 선언
  private String accNo;
  
  // 생성자
  public BankAccount(String paramAccNo, long paramBalance){
    System.out.println("BankAccount(String accNo, long blc) 생성자 호출");  
    accNo = paramAccNo;
    balance = paramBalance;        
  }
  
  
  // 입금 (마이너스 입금 방지)
  public void deposit(long money) {
    if(money <= 0 ) {
      System.out.println( money + "원 입금 불가!");
      return;
    }
    System.out.println( money + "원 입금 완료!");
    balance += money;
  }
  
  // 출금 (실제 출금액을 반환 / 마이너스 출금, 계좌 잔액보다 큰 출금 방지)
  public long withdrawal(long money) {
    if(money < 0 ) {
      System.out.println( money + "원 출금 불가!");
      return 0;
    }
    if(balance < money) {
      System.out.println("잔액부족!");
      return 0; // 출금 된 금액이 없기때문에 0 반환
    }
    System.out.println( money + "원 출금 완료!");
    balance -= money;
    return money;
  }
  
  // 계좌 정보 조회 (계좌번호 / 계좌잔액 출력)
  public void inquiry() {
    System.out.println("계좌번호 :" + accNo + ", 계좌잔액 : " + balance);
  }

  // 이체
  public void transfer(BankAccount otherAc, long money) {
    // 1. 내 통장 출금
    //long realWithdrawal = withdrawal(money); // realWithdrawal = 내 통장에서 빠져나간 돈
    // 2. 너 통장 입금
    //otherAc.deposit(money); 
    // 1. 2.번을 한번에 작성
    
    //위의 두줄을 더 짧게 한줄로 정리했을 때!
    otherAc.deposit(withdrawal(money));
    System.out.println(money + "원 이체 완료!");
    
  } 

  
  
}
