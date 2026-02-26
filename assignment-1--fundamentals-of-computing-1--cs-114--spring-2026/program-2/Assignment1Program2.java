import java.util.Scanner;
public class Assignment1Program2 {
  public static void main(String[] args) {
    System.out.println("Program 2:");

     Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert any base 10 number (any number)");
    int Base10number = scanner.nextInt();
    System.out.println("Please enter a base from 2 to 9");
    int Basenumber = scanner.nextInt();
    int temp = Base10number;
    int digit0 = temp % Basenumber;
    temp = temp / Basenumber;
    int digit1 = temp % Basenumber;
    temp = temp / Basenumber;
    int digit2 = temp % Basenumber;
    temp = temp / Basenumber;
    int digit3 = temp % Basenumber;
    System.out.println("Converted number:" + digit3 + digit2 + digit1 + digit0);
    scanner.close();

    int Maximumdigit = Basenumber - 1;
    int Maximumbase10 = (int)Math.pow(Basenumber, 4) - 1;
    System.out.println("The maximum, 4-digit, base" + Basenumber + " is:" + Maximumdigit + Maximumdigit + Maximumdigit + Maximumdigit + " which equals to " + Maximumbase10 + "in base 10");
  }
}
