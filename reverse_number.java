import java.util.Scanner;

class Reverse_Number {
  public static void main(String[] args) {
    int r, rev = 0, ori;
    System.out.println("Enter the number which you want to reverse");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    ori = n;
    while (n > 0) {
      r = n % 10;
      rev = rev * 10 + r;
      n = n / 10;

    }
    System.out.println("Reverse of entered number is:" + rev);
  }
}

/*
 * Enter the number which you want to reverse
 * 123
 * Reverse of entered number is:321
 */