package calculator;
import java.util.*;

public class Main {
    public static int output;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter First Number : ");
            int firstValue = sc.nextInt();

            System.out.println("please select operator______");
            char userInput = sc.next().charAt(0);
            
            System.out.print("Enter Second value : ");
            int secondValue = sc.nextInt();

            switch(userInput){
                case '-' :
                    output = firstValue-secondValue;
                break;
                case '+' :
                    output = firstValue+secondValue;
                break;
                case '/' :
                    output = firstValue/secondValue;
                break;
                case '*' :
                    output = firstValue*secondValue;
                break;
                default :
                    System.out.println("Invalid Data !!!");
                continue;
            }
            System.out.println("Result : "+output);
        }
    }
}
