class Increment_Decrement {
  public static void main(String[] args) {
    int x = 10;
    // Actual value of x
    System.out.println(x);
    // 11 then 11 and then 11
    int a = ++x;
    // 10 then 11 then 10
    int b = x++;
    // 11 then 11 then 11
    int c = x--;
    // 10 then 10 then 10
    int d = --x;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}

/*
 * Answers
 * 10
 * 11
 * 11
 * 12
 * 10
 */