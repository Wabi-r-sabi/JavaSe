/**
 * @descriptions: VarScope
 * @author: 一只强
 * @date: 2022/10/10 13:10
 * @version: 1.0
 */
public class VarScope {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.cry();
//        cat.eat();
        Person person = new Person();
        person.say();
        Test01 test = new Test01();
        test.test01();//第1种跨类访问对象属性的方式
        System.out.println(person.name);
        test.test02(person);//第2种跨类访问对象属性的方式
    }
}

/**
 * class Cat {
 * //全局变量(属性):作用域为整个类体 Cat类:cry eat等方法,
 * //局部变量
 * <p>
 * int age = 10;
 * //全局变量可以不赋值,直接使用默认值
 * <p>
 * double weight;
 * <p>
 * public void cry() {
 * //1.局部变量一般是指在成员方法中定义的变量
 * //2.n 和 name是局部变量,作用域在cry方法中
 * //局部变不可以不赋值,没有默认值
 * //int n = 10;
 * String name = "一只强";
 * System.out.println("在cry中使用属性age=" + age);
 * System.out.println("在cry中使用属性name=" + name);
 * }
 * <p>
 * public void eat() {
 * System.out.println("在eat中使用属性age=" + age);
 * System.out.println("在eat中使用属性weight=" + weight);
 * }
 * }
 */
class Person {
    //细节: 属性(全局变量)可以加修饰符(public proteted private)
    //      局部变量不能加修饰符

    private final int age = 52;
    String name = "jack";

    public void say() {
        //细节  属性和局部变量可以重名,访问时遵循就近原则
        String name = "king";
        System.out.println("say() name=" + name);
    }
}

class Test01 {
    public void test01() {
        Person person = new Person();
        System.out.println(person.name);//jack
    }

    public void test02(Person person) {
        System.out.println(person.name);//jack
    }
}