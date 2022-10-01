public class Method {
    public static void main(String[] args) {
//        Person a=new Person();
//        a.age=10;
//        a.name="小明";
//        Person b;
//        b=a;
//        System.out.println(b.name);
//        b.age=200;
//        b=null;
//        System.out.println(a.age);
//        System.out.println(b.age);
//        Person p = new Person();
//        p.speak();//调用
//        p.cal01();
//        p.cal02(100);
//        p.cal02(200);
//        int returnSum = p.getSum(10, 20);
//        System.out.println(returnSum);
//        int[][] map = {{0, 1, 1}, {1, 1, 1}, {1, 1, 3}};
//        MyTools tool = new MyTools();
//        tool.printArr(map);
//        Aa a = new Aa();
//        int[] res = a.getSumAndSub(5, 9);
//        System.out.println("sum=" + res[0]);
//        System.out.println("sub=" + res[1]);
//        Cat cat = new Cat();
//        cat.name="小白";
//        cat.age=20;
//        cat.color="白色";
//        cat.weight=10;
//       // cat.master={3};
//        //访问属性
//        System.out.println("这只猫的信息:"+cat.name+'\t'+cat.age+'\t'
//                +cat.color+'\t'+cat.weight);
        //创建Person对象
        //p1是对象名
        //new Person()创建的对象空间(数据)才是真正的对象
       //  Person p1 = new Person();//创建对象
        //对象属性默认值,遵守数组规则
    }
}

/**
 * class Person {
 * //  String name;
 * //  int age;
 * <p>
 * public void speak() {
 * System.out.println("一只强");
 * }
 * <p>
 * public void cal01() {
 * int sum = 0;
 * for (int i = 1; i <= 1000; i++) {
 * sum += i;
 * }
 * System.out.println("sum=" + sum);
 * }
 * <p>
 * public void cal02(int n) {
 * int sum = 0;
 * for (int i = 1; i <= n; i++) {
 * sum += i;
 * }
 * System.out.println("sum=" + sum);
 * }
 * <p>
 * public int getSum(int a, int b) {
 * return a + b;
 * }
 * }
 * <p>
 * class MyTools {
 * public void printArr(int[][] map) {
 * for (int i = 0; i < map.length; i++) {
 * for (int j = 0; j < map[i].length; j++) {
 * System.out.print(map[i][j] + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 * class Aa {
 * public int[] getSumAndSub(int n1, int n2) {
 * int[] resArr = new int[2];
 * resArr[0] = n1 + n2;
 * resArr[1] = n1 - n2;
 * return resArr;
 * }
 * }
 * 定义一个猫类Cat -> 自定义的数据类型
 * <p>
 * class Cat {
 * String name;//属性,成员变量,字段 field
 * int age;//年龄
 * String color;//颜色
 * double weight;
 * //  String[] master;//属性可以是基本数据类型,也可以是引用类型(对象,数组)
 * }

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;
}
 */

