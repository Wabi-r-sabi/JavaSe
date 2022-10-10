/**
 * @descriptions: VarParameter
 * @author: 一只强
 * @date: 2022/10/10 9:59
 * @version: 1.0
 */
public class VarParameter {
    public static void main(String[] args) {
        //Methods methods = new Methods();
        //System.out.println(methods.sum(22, 44, 77, 99, 66, 55));
        //System.out.println(methods.showScore("一只强", 99.88, 96.5, 94.7, 99.6));
    }
}
/**
 * class Methods {
 * public int me(int n1, int n2, int n3) {
 * return n1 + n2 + n3;
 * }
 * <p>
 * public int me(int n1, int n2, int n3, int n4, int n5) {
 * return n1 + n2 + n3 + n3 + n4 + n5;
 * }
 * //上面两个方法名称相同,功能相同,参数个数不同->使用可变参数优化
 * //1.int...表示接受的是可变参数,类型是int，即可以接收多个int(0-n)
 * //2.使用可变参数时,可以当数组来使用,即nums可以当作数组
 * //3.遍历nums求和即可
 * <p>
 * public int sum(int... nums) {
 * System.out.println("接收的参数个数=" + nums.length);
 * int res = 0;
 * for (int num : nums) {
 * res += num;
 * }
 * return res;
 * }
 * <p>
 * public String showScore(String name, double... scores) {
 * double totalScore = 0;
 * for (double score : scores) {
 * totalScore += score;
 * }
 * return name + "有" + scores.length + "门课的成绩" + "\t" +
 * "总分=" + String.format("%.2f", totalScore);
 * }
 * }
 */