public class MethodExercise {
    public static void main(String[] args) {
        //Aa a = new Aa();
//        if (a.isOdd(7489)) {
//            System.out.println("是奇数");
//        } else {
//            System.out.println("是偶数");
//        }
        //a.print(5, 6, '$');
//        int num1 = 10;
//        int num2 = 20;
//        a.swap(num1, num2);
//        System.out.println("main中 num1=" + num1 + "num2=" + num2);
//        Bb b = new Bb();
//        int[] arr = {1, 2, 3};
//        b.test100(arr);
//        System.out.println("main输出  arr数组");
//        for (int i = 0; i < arr.length; i++) {//遍历数组
//            System.out.print(arr[i] + "\t");
//        }
//        Bb b = new Bb();
//        Person p = new Person();
//        p.name = "jack";
//        p.age = 20;
//        b.test200(p);
//        System.out.println("main中p.age=" + p.age + "\n" + "p.name=" + p.name);
    }
}

/**
 * 编写类Aa,有一个方法：判断一个数是奇数odd还是偶数,返回boolean
 * class Aa {
 * //思路
 * // 1：方法的返回类型 boolean
 * // 2: 方法的名字  isOdd
 * // 3: 方法的形参  (int num)
 * // 4: 方法体      判断
 * //    public boolean isOdd(int num) {
 * //        return num % 2 != 0;
 * //    }
 * //根据行,列,字符打印对应行数和列数的字符
 * //比如:行:4,列:4,字符$
 * //思路
 * // 1：方法的返回类型 void
 * // 2: 方法的名字  print
 * // 3: 方法的形参  (int row,int col,char c)
 * // 4: 方法体     循环
 * //    public void print(int row, int col, char c) {
 * //        for (int i = 0; i < row; i++) {
 * //            for (int j = 0; j < col; j++) {   //输出每一行
 * //                System.out.print(c);
 * //            }
 * //            System.out.println();     //换行
 * //        }
 * //    }
 * <p>
 * }
 * class Aa {
 * public void swap(int num1, int num2) {
 * int temp = num1;
 * num1 = num2;
 * num2 = temp;
 * System.out.println("swap中 num1=" + num1 + "num2=" + num2);
 * }
 * }
 * class Aa {
 * public void swap(int num1, int num2) {
 * int temp = num1;
 * num1 = num2;
 * num2 = temp;
 * System.out.println("swap中 num1=" + num1 + "num2=" + num2);
 * }
 * }
 * class Aa {
 * public void swap(int num1, int num2) {
 * int temp = num1;
 * num1 = num2;
 * num2 = temp;
 * System.out.println("swap中 num1=" + num1 + "num2=" + num2);
 * }
 * }
 * <p>
 * class Aa {
 * public void swap(int num1, int num2) {
 * int temp = num1;
 * num1 = num2;
 * num2 = temp;
 * System.out.println("swap中 num1=" + num1 + "num2=" + num2);
 * }
 * }
 * <p>
 * class Person {
 * String name;
 * int age;
 * }
 * <p>
 * class Bb {
 * public void test100(int[] arr) {
 * arr[1] = 99;
 * System.out.println("test100输出  arr数组");
 * for (int i = 0; i < arr.length; i++) {//遍历数组
 * System.out.print(arr[i] + "\t");
 * }
 * System.out.println();
 * }
 * public void test200(Person p) {
 * p.name = "bob"; //修改对象属性
 * p.age = 200;
 * }
 * }
 */