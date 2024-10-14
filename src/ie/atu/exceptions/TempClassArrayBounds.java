package ie.atu.exceptions;
import java.util.Scanner;

public class TempClassArrayBounds {
    public static void main(String[] args) {
        int [] temperatures = {20, 22, 19, 23, 21, 18, 25};
        //String [] Days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number(1-7): ");
        int day = scanner.nextInt();
        
        try {
            String [] Days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            
            System.out.println("On "  + Days[day-1] +  " the temperature was " + temperatures[day-1] + " degrees");

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("not a day of the week");
            
        }finally{
            System.out.println("Thanks for participating");
        }
    }
}
