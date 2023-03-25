class Swapbytwovariable {
  public static void main(String[] args) {
    int a = 10, b = 20;
    System.out.println("Elements before swapping: " + a);
    System.out.println("Elements before swapping: " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("Elements after swapping: " + a);
    System.out.println("Elements after swapping: " + b);

  }
}