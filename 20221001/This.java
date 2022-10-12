
/**
 * @descriptions: This
 * @author: 一只强
 * @date: 2022/10/12 19:46
 * @version: 1.0
 */
public class This {
    public static void main(String[] args) {
//        Dog dog1 = new Dog("大壮", 3);
//        System.out.println("dog1的hashCode=" + dog1.hashCode());
//        //dog1.info();
//        Dog dog2 = new Dog("大黄", 2);
//        System.out.println("dog2的hashCode=" + dog2.hashCode());
//        //dog2.info();

        //Test02 test = new Test02();
        //test.test02();

//        Test02 test = new Test02();
//        test.Test03();
        Person p1 = new Person("一只强", 20);
        Person p2 = new Person("两只强", 18);
        System.out.println(p1.compareTo(p2));
    }
}
/*
class Dog {
    String name;
    int age;

    //    public Dog(String dName, int dAge) {//构造器
//        name = dName;
//        age = dAge;
//    }
    //根据变量的作用域原则(就近原则)
    //构造器的name和age是局部变量,不是属性
    //==>引出this关键字来解决

    public Dog(String name, int age) {//构造器
        //this.name就是当前对象的属性name
        this.name = name;
        //this.age就是当前对象的属性age
        this.age = age;
        System.out.println("this.hashCode=" + this.hashCode());
    }

    public void info() {//成员方法,输出属性x信息
        System.out.println(name + " " + age);
    }
}
*/
/*
class Test02 {
    double price = 8.77;
    int num = 128;
    //this关键字用来访问本类的属性

    public void Test03() {
        //传统方式
        System.out.println("price" + price + "num" + num);
        //也可以用this访问属性
        System.out.println("price" + this.price + "num" + this.num);
    }

//    细节:访问构造器的语法:this(参数列表)
//   this不能在类定义的外部使用,只能在类的内部使用
//    注意只能在构造器中使用(即只能在构造器中访问另外一个构造器)
//    注意:访问构造器语法:this(参数列表);必须放置第一条语句


//    public Test02() {
//        //这里去访问Test(String name,int age)
//        this("一只强", 20);
//        System.out.println("Test()构造器");
//    }
//
//    public Test02(String name, int age) {
//        System.out.println("Test(String name, int age)构造器");
//    }
    //细节:访问成员方法个语法:this.方法名(参数列表)；

//    public void test01() {
//        System.out.println("test01()方法...");
//    }

//    public void test02() {
//        System.out.println("test02()方法...");
//        //调用本类的f1
//        //第一种方式
//        test01();
//        //第二种方式
//        this.test01();
//    }
}
*/

class Person {
    String name;
    int age;
    //构造器

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //compareTo比较方法

    public boolean compareTo(Person p) {
        //名字和年龄完全一样
        return this.name.equals(p.name) && this.age == p.age;
    }
}