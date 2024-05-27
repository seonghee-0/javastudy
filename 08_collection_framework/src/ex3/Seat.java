package ex3;

public class Seat {
  
  private Person person; // 자리에 한사람씩 앉을 수 있기때문에 타입은 'Person' 타입
  
  public Seat() {
    
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

 
}
