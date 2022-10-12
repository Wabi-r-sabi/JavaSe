/**
 * @descriptions: Constructor
 * @author: 一只强
 * @date: 2022/10/11 20:34
 * @version: 1.0
 */
public class Constructor {
    public static void main(String[] args) {
//        Person person = new Person("一只强", 20);
//        System.out.println(person.name + " " + +person.age);
//        Dog dog1 = new Dog();//使用的是默认的无参构造器

        Preson p1 = new Preson();//无参构造器
        System.out.println("name=" + p1.name + " " + "age=" + p1.age);//输出name=null age=18
        Preson p2 = new Preson("一只强", 20);
        System.out.println("name=" + p2.name + " " + "age=" + p2.age);//输出name=一只强 age=18
    }
}
//在创建人类对象时,就直接指定这个对象的年龄和姓名

/**
 * class Person {
 * String name;
 * int age;
 * //1.构造器没有返回值,也不能写void
 * //2.构造器的名称和类Person一样
 * //3.(String pName,int pAge)是构造器的形参列表,规则和成员方法一样
 * <p>
 * public Person(String pName, int pAge) {
 * System.out.println("构造器被调用,完成对象的初始化");
 * name = pName;
 * age = pAge;
 * }
 * }
 * <p>
 * class Dog {
 * //如果程序员没有定义构造器,系统会自动给类生成一个默认无参构造器(也叫默认构造器)
 * //使用javap指令 反编译
 * //
 * //   默认构造器
 * //   Dog() {
 * <p>
 * // }
 * //
 * //一旦定义了自己的构造器,默认的构造器就覆盖了,就不能使用默认的无参构造器
 * //除非显式的定义一下
 * <p>
 * public Dog(String dName) {
 * //...
 * }
 * Dog(){//显式定义无参构造器
 * <p>
 * }
 * }
 */
class Preson {
    String name;//默认值为null
    int age;//默认值为0
    //第一个无参构造器:利用构造器设置所有人的age属性初始值都为18

    public Preson() {
        age = 18;
    }
    //第二个带pName和pAge两个参数的构造器

    public Preson(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
}
