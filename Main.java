/**
 * Takes an integer as a parameter and displays numbers that divide it evenly
 * @author Cole Girling
 */
public class Main {

  public static void factors(int number){
    //loops until i is equal to the number input
    for(int i = 1; i <= number; i++){
      //divides "number" and i and if there is no remainder will display i
      if(number % i == 0){
        System.out.println(i);
      }
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
   //calls the method and inserts the number into the method
   int number = 51;
   factors(number);
    
  }
}
