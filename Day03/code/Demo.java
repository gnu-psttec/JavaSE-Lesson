public class Demo {
  public static void main(String[] args) {
    // +
    // int a = 1;
    // int b = 2;
    // int c = a + b;

    /* ++ */
    int a = 1;
    a += 2; /* ==> a = a + 2 */
    /* a++ ==> a = a + 1 */
    // System.out.println("" + a); // tip: 将一个数值类型变更为字符串类型的最便捷方法：空字符串 “+” 数值类型
    // System.out.println("a++: " + a++);
    // System.out.println("after: a = " + a);
    // System.out.println("++a: " + (++a));

    /* + 运算符 */
    // System.out.println("hello world");
    // String name = "zzyyy";
    // System.out.println("hello " + name);

    // int x = 3510;
    // x = x / 1000 * 1000; // 整数之间做除法时，只保留整数部分而舍弃小数部分
    // System.out.println(x);
    // System.out.println("5+5=" + 5 + 5);

    // -
    // int a = 100;

    // 左操作数：左值
    // 右操作数
    // int b = 2;
    // int c = a - b;

    // *

    // 【/】

    // %

    // System.out.println("a - b = " + c);

    // 比较运算符: 最后的运算结果一定是boolean类型
    // int a = 100;
    // int b = 20;
    // boolean c = true;
    // boolean d = false;
    // System.out.println(c == d);

    /* 演示 instanceof */
    // boolean res = "Hello" instanceof String;
    // System.out.println(res);

    /* 三元运算符 */
    int d = 10;
    int b = 20;
    int c = d > b ? 100 : 0 
    // 往后：凡是当你需要通过比较得到某个的变量值的时候，请优先使用三元运算符（如果比较结果是互斥）
    // if (a > b) {
    // c = 100;
    // } else {
    // c = 0;
    // }

    System.out.println(c);
  }
}