package pkg03_method_return;

public class Subtractor {
  int minus(int number1, int number2) {
    return number1 - number2; 
    // System.out.println(); 오류남 !! 
    // 이유 => return 이 존재하면 그 뒤에 아무것도 올 수 없다.. return 앞엔 가능  
   
  }
  
}
