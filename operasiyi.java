import java.util.Scanner;

public class operasiyi {

  public static void main(String[] args) {
    int x = 56;
    int y = 12;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter transaction number:");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    int a = in.nextInt();

    switch (a) {
    case 1:
      System.out.println(x + y);
      break;
    case 2:
      System.out.println(x - y);
      break;
    case 3:
      System.out.println(x * y);
      break;
    default:
      System.out.println("Unknown number");
      break;
    }
  }
}
