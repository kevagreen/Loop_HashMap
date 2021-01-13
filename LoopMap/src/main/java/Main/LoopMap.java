package Main;

import java.util.*;


public class LoopMap {
   //variables
   private static Scanner userInput = new Scanner(System.in);
   public static List<Integer> userNumbers = new ArrayList<>();

   public static void main (String[] args) {
   getNumbers();
   sumNumbers();
   multiplyNumbers();
   largestNumber();
   smallestNumber();
   carDealership();
    }
    //Get input from user
    private static void getNumbers() {
        System.out.println("Hello Mate! I'll start by asking you for a series of numbers!");
        for (int numbers = 0; numbers < 5; numbers++) {
            System.out.println("Enter a number");
            userNumbers.add(userInput.nextInt());
        }
    }
    //Get the sum of the numbers entered
    private static void sumNumbers(){
        Integer sum = 0;
        for(Integer number: userNumbers) {
            sum += number;
        }
        System.out.println("The sum of the numbers you entered: " + sum);
    }
       //Get the product of the numbers entered
       private static void multiplyNumbers(){
           Integer product = 1;
           for(int number = 0; number < userNumbers.size(); number++) {
               product *= userNumbers.get(number);
           }
           System.out.println("The numbers you entered were multiplied and like magic...: " + product);
       }
       //Get the largest number entered
       private static void largestNumber(){
       System.out.println("The largest number entered: " + Collections.max(userNumbers));
       }
      //Get the smallest number entered
      private static void smallestNumber(){
       System.out.println("The smallest number entered: " + Collections.min(userNumbers));
   }
      //car dealer hash map: make is the key, model is the value
    private static void carDealership(){
        HashMap<String, String> cars = new HashMap<>();
        cars.put("Honda", "Civic");
        cars.put("GMC", "Acadia");
        cars.put("Chevrolet", "Tahoe");
        cars.put("Hyundai", "Sonata");
        cars.put("Nissan", "Sentra");
        System.out.println("Hello what ride would you like to take home today?");
        String myCar = userInput.next();
        System.out.println("Great choice! Let's see if we have a " + myCar);
        if(cars.containsKey(myCar)){
            System.out.println("Yes we have a " + myCar + " Let's go check it out!");
        }else{
            System.out.println("Sorry we don't have a " + myCar);
        }
    }

}//end class
