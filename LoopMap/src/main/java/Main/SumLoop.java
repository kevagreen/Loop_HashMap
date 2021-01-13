package Main;
import static Main.LoopMap.userNumbers;
public class SumLoop {
    public static void main(String[] args) {
      new LoopMap();
      sumLoop();

    }
    public static void sumLoop(){
        Integer sum = 0;
        for(Integer number: userNumbers) {
            sum += number;
        }
        System.out.println("The sum of the numbers you entered: " + sum);
    }
}//end class
