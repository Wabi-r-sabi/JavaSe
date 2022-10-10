/**
 * @descriptions: OverLoad
 * @author: 一只强
 * @date: 2022/10/9 20:19
 * @version: 1.0
 */
public class OverLoad {
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
//        System.out.println(mc.calculate(58, 77));
//        System.out.println(mc.calculate(58.3, 77));
//        System.out.println(mc.calculate(58, 77.9));
//        System.out.println(mc.calculate(58, 77, 86));
//        Methods methods = new Methods();
//        methods.me(28);
//        methods.me("一只强");
//        methods.me(88, 77);
//        System.out.println("两个整数中的最大值为" + methods.max(99, 111));
//        System.out.println("两个浮点数中的最大值为" + methods.max(132.8, 1879.6));
//        System.out.println("三个浮点数中的最大值为" + methods.max(44.7, 32.5, 98));

    }
}

/**
 * class MyCalculator {
 * //细节
 * //1)方法名必须相同
 * //2)形参列表:必须不同(形参类型或个数或顺序,至少有一个不同,参数名无要求)
 * //3)返回类型无要求
 * //下面的四个calculate方法构成了重载
 * //两个整数的和
 * <p>
 * public int calculate(int n1, int n2) {
 * return n1 + n2;
 * }
 * <p>
 * public double calculate(double n1, int n2) {
 * return n1 + n2;
 * }
 * <p>
 * public double calculate(int n1, double n2) {
 * return n1 + n2;
 * }
 * <p>
 * public double calculate(int n1, int n2, int n3) {
 * return n1 + n2 + n3;
 * }
 * }
 * <p>
 * class Methods {
 * //1.方法名  me
 * //2.形参   (int n)  (int n1,int n2)  (String str)
 * //3.void
 * <p>
 * public void me(int n) {
 * System.out.println("平方和为:" + (n * n));
 * }
 * <p>
 * public void me(int n1, int n2) {
 * System.out.println("相乘为:" + (n1 * n2));
 * }
 * <p>
 * public void me(String str) {
 * System.out.println("传入的字符串为:" + str);
 * }
 * //1.方法名  me
 * //2.形参   (int n1,int n2)  (double n1,double n2)  (double n1,double n2,double n3)
 * //3.void
 * <p>
 * public int max(int n1, int n2) {
 * return Math.max(n1, n2);
 * }
 * <p>
 * public double max(double n1, double n2) {
 * return Math.max(n1, n2);
 * }
 * <p>
 * public double max(double n1, double n2, double n3) {
 * return n3 > ( Math.max(n1, n2)) ? n3 : n1;
 * }
 * <p>
 * }
 */