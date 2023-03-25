//The swap program is done by using third variable temp to copy the data
class Swap {
  public static void main(String[] args) {
    int a = 10, b = 20, temp = 0;
    System.out.println("The value of a before swapping: " + a);

    System.out.println("The value of a before swapping: " + b);

    temp = a;
    a = b;
    b = temp;

    System.out.println("The value of a after swapping: " + a);

    System.out.println("The value of a after swapping: " + b);
  }
}