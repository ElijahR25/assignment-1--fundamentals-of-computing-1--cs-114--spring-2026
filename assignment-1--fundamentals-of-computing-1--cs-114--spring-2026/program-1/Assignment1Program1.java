import java.util.Scanner;
import java.util.Random;
public class Assignment1Program1 {
  public static void main(String[] args) {
    intials();

    System.out.println("Program 1:");

    System.out.println("Please enter a 5-character string");
    Scanner scanner = new Scanner(System.in);
    String string  = scanner.next();
    String trimmedinput = string.substring(1, string.length() - 1);
    StringBuilder inversestr = new StringBuilder(trimmedinput).reverse();
    System.out.println(inversestr);

    System.out.println("Please enter a number in Fahrenheit");
    double tempF = scanner.nextDouble();
    double tempC = (tempF-32) * 5/9;
    System.out.println(tempC);
    scanner.close();

    System.out.println("Random number generated. Continuing...");
    Random num = new Random();
    int min = 32;
    int max = 16384;
    int randomNumber = num.nextInt((max - min) +1) + min;

    System.out.println("Your new string is " + tempC + inversestr + randomNumber);
  }
  public static void intials(){
    System.out.println("EEEEEEEEEEEEEE        RRRRRRRRRRRR"); 
    System.out.println("EEEEEEEEEEEEEE        RRR        RRR");
    System.out.println("EEEE                  RRR        RRR");
    System.out.println("EEEE                  RRR       RRR");
    System.out.println("EEEEEEEEEEEEEE        RRRRRRRRRRR");
    System.out.println("EEEEEEEEEEEEEE        RRR     RRRR");
    System.out.println("EEEE                  RRR       RRR");
    System.out.println("EEEE                  RRR        RRR"); 
    System.out.println("EEEEEEEEEEEEEE        RRR         RRR"); 
    System.out.println("EEEEEEEEEEEEEE        RRR          RRR"); 
  }
}
