
// Learn from
// https://www.youtube.com/watch?v=XLCka0noTY4

// Summary
// 1. Data types
//referenced vs primitive
//int, bool, float, double, char, String
//2. Priting in the console
//3. Functions / Methods and Properties

public class Car{
  //Object : Properties + Methods
  int maxSpeed = 100;
  int minSpeed = 0;
  double weight = 4079;
  boolean isTheCarOn = false;
  char condition = 'A';

  //Properties
  public void printVariables() {
    System.out.println(maxSpeed);
    System.out.println(minSpeed);
    System.out.println(weight);
    System.out.println(isTheCarOn);
    System.out.println(condition);
  }

  // changeCondition
  public void changeCondition(){
    condition = 'C';
  }
  public void upgradeMinSpeed(){
    minSpeed = maxSpeed;
    maxSpeed = maxSpeed+1;
  }
  //Methods
  public static void main(String[] args) {
      // TOD code application logic here
      System.out.println("Ferrari");
      Car ferrari = new Car();
      ferrari.printVariables();


      System.out.println("--------------");

      //Referenced Type
      System.out.println("Fake Ferrari");
      Car ferrari_fake = ferrari;
      ferrari_fake.changeCondition();
      ferrari_fake.changeCondition();
      ferrari_fake.upgradeMinSpeed();
      ferrari_fake.printVariables();

  }
}
