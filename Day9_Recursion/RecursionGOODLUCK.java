public class RecursionGOODLUCK{

  // f(f(f(a))) ----- a = 20
  // f(a) = 5 + a
  // f(20) = 5 + 20 = 2

  // f(f(f(20))) ------  f(f(25))

  // f(25) = 5 + 25 - 30
  // f(f(f(20))) ------  f(f(25)) ------  f(30)

  // f(39) = 5 + 3- = 35

  // f(f(f(20))) ------  f(f(25)) ------  f(30) ------- 35

  // 5+4+3+2+1; 7+6+5+4+3+2+1; 1; 2+1

  //3 + 2 + 1
  public static int Summation(int n){
    //Base Case: WE ARE AT THE END
    if (n<= 0){
      return 0; // additive identity property
    }
    //Recursive Case: KEEP GOING
    else {
      //3 + Summation(2)
      //3 + 2 + Summation(1)
      //3 + 2 + 1 + Summation(0)
      //3 + 2 + 1 + 0 = 6
      return n + Summation(n-1);
    }
  }

  //5! = > 5 * 4 *3 *2 * 1
  public static int Factorial (int n){
    // Base Case:
    if (n <=1 ) {
      return 1;
    }
    // Recursive Case:
    else {
      // 4 * Factorial (3)
      // 4 * 3 * Factorial (2)
      // 4 * 3 * 2 * Factorial (1)
      // 4 * 3 * 2 * 1 = 24
      return n * Factorial (n-1);
    }
  }
  // 5^3 = 5 * 5 * 5
  // 5^3 = 5 * 5^2 = 5
  public static int Exponentiation(int n, int p){
    //Base case:
    if (p<=0){//mult identity
      return 1;
    }
    else {
      // 5 * exponentiation(5, 2)
      // 5 * 5 * exponentiation(5, 1)
      // 5 * 5 * 5 * exponentiation(5, 0)
      // 5 * 5 * 5 * 1
      return n * Exponentiation(n , p-1);
    }
  }

  public static void main(String[] args){
    System.out.println(Summation(3));
    System.out.println(Factorial (5));
    System.out.println(Factorial (4));
    System.out.println(Exponentiation(5,3));

  }

}
