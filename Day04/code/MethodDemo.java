class MethodDemo {
  public static void main(String[] args) {
    System.out.println("hello world");
    int result = add(11111, 2298173);
    System.out.println("result = " + result);
    int res1 = factorial(2);
    int res2 = factorial(4);
    System.out.println("res1 = " + res1);
    System.out.println("res2 = " + res2);
  }

  // 求两个数的和
  static int add(int a, int b) {
    int c = a + b;
    return c;
  }

  static int factorial(int num) {
    int res = num;
    for (int i = num - 1; i > 1; i--) {
      res *= i;
    }
    return res;
  }
}