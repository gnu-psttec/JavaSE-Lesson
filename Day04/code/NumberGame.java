import java.util.Scanner;

class NumberGame {
  public static void main(String[] args) {
    boolean flg = true;
    int aim = 18;
    Scanner sc = new Scanner(System.in);
    while (flg) {
      System.out.println("Please Enter the number:");
      int num = sc.nextInt();
      if (num == -1) {
        System.out.println("game over");
        break;
      } else {
        if (num > aim) {
          System.out.println("your guess is bigger");
        } else if (num < aim) {
          System.out.println("your guess is smaller");
        } else {
          System.out.println("bingo you are right");
          break;
        }
      }
    }
    sc.close();
  }
}