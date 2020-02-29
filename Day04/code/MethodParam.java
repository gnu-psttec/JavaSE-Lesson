class MethodParam {
  public static void main(String[] args) {
    int a = 0;
    int b = 10;
    swap1(a, b);
    System.out.println("after swap: ");
    System.out.println("a = " + a + "\tb = " + b);
    System.out.println("==================================");
    int[] arr = { 1, 0, 3 };
    System.out.println("before array swap: ");
    printArray(arr);

    swap2(arr);
    System.out.println("after array item swaped: ");
    printArray(arr);

  }

  static void swap1(int a, int b) {
    System.out.println("before swap operate: ");
    System.out.println("a = " + a + "\tb = " + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("in swap method: ");
    System.out.println("a = " + a + "\tb = " + b);
  }

  /**
   * 交换数组中第1个和第三个元素的值
   */
  static void swap2(int[] arr) {
    int temp = arr[0];
    arr[0] = arr[2];
    arr[2] = temp;

  }

  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "] = " + arr[i]);
    }
  }

}