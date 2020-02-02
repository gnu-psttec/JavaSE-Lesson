public class Demo2 {
  public static void main(String[] args) {
    int score = 12;
    int b = 110;
    // if (score == 100) {
    // System.out.println("恭喜考了满分");
    // }
    // if (score > b) {
    // System.out.println("你考的不错");
    // } else {
    // System.out.println("你考的不好");
    // }

    // if (score >= 90) {
    // System.out.println("优");
    // } else if (score >= 80) {
    // System.out.println("良");
    // } else if (score >= 70) {
    // System.out.println("中");
    // } else if (score >= 60) {
    // System.out.println("合格");
    // } else {
    // System.out.println("不合格");
    // }

    /*
     * 模拟一个电商购物过程
     * 
     * 0: 未付款
     * 
     * 1: 已付款
     * 
     * 2: 已发货
     * 
     * 3: 已收货
     * 
     * 4: 已评价：reward
     */
    // 没有break的时候，不是语法错误，可能会遇见逻辑错误，【语义错误】
    // int status = 5;
    // switch (status) {
    // default:
    // System.out.println("mdzz");
    // break;
    // case 0:
    // System.out.println("未付款");
    // break; // 注意！！！⚠️
    // case 1:
    // System.out.println("已付款");
    // break; // 注意！！！⚠️
    // case 2:
    // System.out.println("已发货");
    // break; // 注意！！！⚠️
    // case 3:
    // System.out.println("已收货");
    // break; // 注意！！！⚠️
    // case 4:
    // System.out.println("已评价");
    // break; // 注意！！！⚠️

    /* while 语句 */
    // int count = 0;
    // int i = 0;
    // while (i < 10) {
    // System.out.println(count);
    // count += 2; // count = count + 2;
    // i++;
    // }

    /* for 循环 */
    // int count = 0;
    // for (int i = 0; i < 10; i++) {
    // System.out.println(count);
    // count += 2;
    // }

    // while (true) {
    // System.out.println("111");
    // }

    // for (;;) {
    // System.out.println("2222");
    // }

    // int count = 1;
    // for (int i = 0; i < 1000000; i++) {
    // count++; // count = count + 1;
    // System.out.println(count);
    // if (count > 10) {
    // break; // 跳出当前循环！！！
    // }
    // }
    // System.out.println("count: " + count);

    for (int i = 1; i <= 10; i++) {
      System.out.println("i = " + i);
      for (int j = 1; j < i; j++) {
        System.out.println("<<<< j = " + j);
      }
    }

  }
}