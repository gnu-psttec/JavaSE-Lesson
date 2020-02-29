class JumpDemo {
  public static void main(String[] args) {
    int i = 3;
    // for (int j = 0; j < 10; j++) {
    // // break
    // if (i > 5) {
    // break;
    // }
    // i++;
    // }
    for (int j = 0; j < 10; j++) {
      // continue
      if (j < 5) {
        continue;
      }
      i++;
    }

    System.out.println(i);
  }
}
