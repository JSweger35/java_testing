import java.util.Scanner;
/**
 * Lesson 7 activites.
 * 
 * @author Jake Sweger
 * @version 1.0
 */
public class Lesson_7 {
    /**
     * main() reads Fahrenheit temperatures and 
     * displays their Celsius and Kelvin equivalents.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int x = 0;
        //int y = 0;
        System.out.print("Enter a number:");
        String lowerNum = input.next();
        System.out.print("Enter a higher number:");
        String higherNum = input.next();
        System.out.print("Lower Number: "+ lowerNum +"\n");
        System.out.print("Higher Number: "+ higherNum +"\n");
        int lowNum = Integer.parseInt(lowerNum);
        int highNum = Integer.parseInt(higherNum);
        int x = lowNum;
        do {
            System.out.println("x: "+x);
            x++;
        } while(x < 10);
        
        /*while (y < 10){
            System.out.println("y: "+y);
            y++; 
        }*/
    }
}
