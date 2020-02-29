class ArrayOperate {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 23, 441, 5, 12, 32, 21 };
    // printArray(arr);
    int idx = search(arr, 11);
    System.out.println("idx: " + idx);
  }

  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "] = " + arr[i]);
    }
  }

  static int search(int[] arr, int item) {
    for (int i = 0; i < arr.length; i++) {
      if (item == arr[i]) {
        return i;
      }
    }
    return -1;
  }

  static int max(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }
}