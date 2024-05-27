package pkg02_random;

import java.security.SecureRandom;

public class randomEx {

  
  public static void ex1() {
    
    // 0.0 <= Math.random()             < 1.0
    // 0.0 <= Math.random() * 10        < 10.0
    // 0   <= (int)(Math.random() * 10) < 10          0 ~ 10까지의 랜덤 수 구하기
    int random = (int)(Math.random() * 10);
    System.out.println(random);
    
    // 일반화 한 난수 생성
    // (int)(Math.random() * 개수 + 초기값)
    
    int dice = (int)(Math.random() * 6 + 1);  // 주사위(1 ~ 6) 랜덤 숫자 구하기
    System.out.println(dice);
    
  }
  // **시큐어랜덤**  
  // (secureRandom을 사용하고 , pseudoRandom은 실무에서 사용하지않기 ->중복위험이있기때문에 알고만 있기)
  public static void ex2() {
    SecureRandom secureRandom= new SecureRandom();
    
    // 0.0 <= SecureRandom.nextDouble() < 1.0
    
    // Integer.Min_VALUE <= secureRandom.nextInt() <= Integer.MAX_VALUE
    //                 0 <= secureRandom.nestInt(10) <= 9          : 0부터 10개의 수 (즉 0~9까지)
    
    int dice = secureRandom.nextInt(6) + 1; 
    System.out.println(dice);
    
  }
  
  public static void main(String[] args) {
     ex1();
  }

}
