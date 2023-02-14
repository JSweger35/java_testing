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
        int x = 0;
        int y = 0;
        System.out.print("Enter a bottom number:");
        String lowerNum = input.next();
        System.out.print(lowerNum);
        
        do {
            System.out.println("x: "+x);
            x++;
        } while(x < 10);
        
        while (y < 10){
            System.out.println("y: "+y);
            y++; 
        }
    }
}
