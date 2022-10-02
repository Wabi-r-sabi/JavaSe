public class Test2 {
    public static void main(String[] args) {
//        double a = 3;      //[1]定义double型变量a和b, 并赋初值
//        double b = 4;
//        double precision=0.000001;
//        double c = Math.sqrt(a * a + b * b);//[2]输出变量c的值
//        System.out.println("斜边c的长度为:" + c);
//        if ( a + b > c && a + c > b && b + c > a) {    //1．判断能否构成三角形；
//            System.out.println("可以构成三角形");
//            if (Math.abs(a-b)<precision && Math.abs(a-c)<precision) { //2．判断三角形类型，比如是否为直角三角形、等腰三角形、等边三角形等等；
//                System.out.println("可以构成等边三角形");
//            } else if (Math.abs(a-b)<precision || Math.abs(b-c)<precision ||Math.abs(a-c)<precision) {
//                System.out.println("可以构成等腰三角形");
//            } else if (Math.abs(a * a + b * b-c*c)<precision||Math.abs(a * a + c*c-b*b)<precision
//                    ||Math.abs(b * b + c * c-a*a)<precision) {
//                System.out.println("可以构成直角三角形");
//            }else{
//                System.out.println("可以构成普通三角形");
//            }
//        } else {
//            System.out.println("不能构成三角形");
//        }
//    }
        // TODO 自动生成的方法存根
//        float a=(float)3.25,b=(float)-2.5;
//        int c;
//        byte d;
//        c=(int)(a*b);
//        d=(byte)257;
//        System.out.println("c="+c);
//        System.out.println("d="+d);
//        int a1 = '中';
//        System.out.println(a1);
//        char a2 = '中';
//        System.out.println(a2);
//        char b = 65535;
//        System.out.println(b);
//        float c = 2.5f;
//        System.out.println(c);
//        boolean result = true;
//        System.out.println(result);
//        double d = 25;
//        float e = 2.0f;
//        e = d;  //java高精度赋值给低精度时编译失败,c语言会有精度缺失,不会编译失败
        // TODO 迭代算法程序填空
//
//        int count = 0;
//        for (int heigh = 8844430; heigh >= 1; heigh /= 2) {
//            count++;
//        }
//        System.out.println("需要折叠" + count + "次");
//        int i = 6;  //int i=0;
//        do {
//            i++;
//        } while (i < 6);
//        System.out.println("do while:" + i);
//        int j = 6;//int j=0;
//        while (j < 6) {
//            j++;
//        }
//        System.out.println("while:" + j);
//
//        for (int num = 10000; num <= 99999; num++) {
//            int a = num % 10000 % 1000 % 100 % 10;    //个位
//            int b = num / 10 % 1000 % 100 % 10;       //十位
//            int c = num / 100 % 100 % 10;             //百位
//            int d = num / 1000 % 10;                  //千位
//            int e = num / 10000;                      //万位
//            if (a == e && b == d && a + b + d + e == c) {
//                System.out.print(num+"  ");
//            }
//        }
//        for (int cock = 0; cock <= 20; cock++) {
//            for (int hen = 0; hen <= 33; hen++) {
//                int chicken = 100 - cock - hen;
//                if (hen + cock + chicken == 100 && 5 * cock + 3 * hen + chicken / 3 == 100) {
//                    System.out.println("cock=" + cock + "hen" + hen + "chicken" + chicken);
//                }
//            }
//        }
        //  实验八.小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天即5的倍数的话
        //她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱,请编程计算。
        int day = 0;
        for (float money = 2.5f; money <= 100; money += 2.5) {
            day++;
            if (day % 5 == 0) {
                money -= 6;
            }
        }
        System.out.println("需要" + day + "天");
    }
}
