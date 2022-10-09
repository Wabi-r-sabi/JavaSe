
public class Homework01 {
    public static void main(String[] args) {
//        byte age = 18;
//        short num = 20;
//        int length = 50;
//        char gender = '男';
//        float salary = 28.8f;
//        double balance = 11.3;
//        boolean flag = false;
//        String name = "人名";
//        System.out.println(age);
//        System.out.println(num);
//        System.out.println(length);
//        System.out.println(gender);
//        System.out.println(salary);
//        System.out.println(balance);
//        System.out.println(flag);
//        System.out.println(name);
//        System.out.println("byte max is:" + Byte.MAX_VALUE);
//        System.out.println("byte min is:" + Byte.MIN_VALUE);
//        System.out.println("short max is:" + Short.MAX_VALUE);
//        System.out.println("byte min is:" + Short.MIN_VALUE);
//        System.out.println("byte max is:" + Integer.MAX_VALUE);
//        System.out.println("byte min is:" + Integer.MIN_VALUE);
//        System.out.println("byte max is:" + Long.MAX_VALUE);
//        System.out.println("byte min is:" + Long.MIN_VALUE);
//        System.out.println("byte max is:" + Float.MAX_VALUE);
//        System.out.println("byte min is:" + Float.MIN_VALUE);
//        System.out.println("byte max is:" + Double.MAX_VALUE);
//        System.out.println("byte min is:" + Double.MIN_VALUE);
//        int year = 2014;
//        int month = 8;
//        int day = 12;
//        double price = 293.5;
//        String time = "18:49";
//        String name = "马琦";
//        String seat = "10车095号";
//        String shift = "T382";            //班次
//        String terminal = "上海";         //终点站
//        String initialStation = "昆明";   //初始站
//        String ticketNumber = "898367s55";
//        String idNumber = "22240319841002048";
//        System.out.println(ticketNumber + "\n" + initialStation + "\t" + "->" + "\t" + shift + "\t"
//                + terminal + "\n" + year + "年" + "0" + month + "月" + day + "日" + "\t" + time + "开"
//                + "\n" + "￥" + price + "元" + "\t" + seat + "\n" + name + "\n" + idNumber);
//        int weight1 = 180;
//        int weight2 = 200;
//        String result = weight1 == weight2 ? "相同" : "不同";
//        System.out.println(result);
//        int height1 = 150;
//        int height2 = 210;
//        int height3 = 165;
//        int max = height3 > (height1 > height2 ? height1 : height2) ? height3 : height2;
//        System.out.println("最高身高为" + max);
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入第一个整数");
//        int num1 = input.nextInt();
//        System.out.println(num1);
//        System.out.println("请输入二个整数");
//        byte num2 = input.nextByte();
//        System.out.println(num2);
//        System.out.println("请输入一个浮点数");
//        double num3 = input.nextDouble();
//        System.out.println(num3);
//        System.out.println("请输入一个字符");
//        char ch = input.next().charAt(0);
//        System.out.println(ch);
//        System.out.println("请输入一个字符串");
//        String name = input.next();
//        System.out.println(name);
//        System.out.println("请输入一个布尔值");
//        boolean flag = input.nextBoolean();
//        System.out.println(flag);
        //        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入成绩(0-100)");
//        int score = sc.nextInt();
//        if (score >= 90 && score <= 100) {
//            System.out.println("奖励车子");
//        } else if (score >= 80) {
//            System.out.println("奖励手机");
//        } else if (score >= 70) {
//            System.out.println("奖励玩具");
//        } else if (score >= 60) {
//            System.out.println("奖励试卷");
//        } else {
//            System.out.println("挨揍");
//        }
//        int day = 4;
//        day = (day + 10) % 7;//用整数值0-6表示星期日-星期六
//        if (day == 0) {
//            System.out.println("10天后为星期天");
//        } else {
//            System.out.println("10天后为星期" + day);
//        }
//        int num = 78;
//        System.out.println("请判断" + num + "是否为韩信数");
//        if (num % 3 == 2 && num % 5 == 3 && num % 7 == 2) {
//            System.out.println(num + "是韩信数");
//        } else {
//            System.out.println(num + "不是韩信数");
//        }
//
//        int score = 0;
//        Scanner sc = new Scanner(System.in);
//        for (int num = 0; num < 3; ) {
//            System.out.println("1:Java属于以下哪种语言");
//            System.out.println("A:机器语言");
//            System.out.println("B:汇编语言");
//            System.out.println("C:高级语言");
//            System.out.println("D:以上都不对");
//            System.out.print("请输入你的选择:");
//            char input = sc.next().charAt(0);
//            switch (input) {
//                case 'A':
//                case 'B':
//                case 'D':
//                    System.out.println("回答错误");
//                    break;
//                case 'C':
//                    System.out.println("回答正确");
//                    score++;
//                    break;
//                default:
//                    break;
//            }
//            num++;
//            System.out.println("2.编译Java Application 源程序文件将产生相应的字节码文件，这些字节码文件的扩展名为");
//            System.out.println("A:java");
//            System.out.println("B:class");
//            System.out.println("C:html");
//            System.out.println("D:exe");
//            System.out.print("请输入你的选择:");
//            input = sc.next().charAt(0);
//            switch (input) {
//                case 'A':
//                case 'C':
//                case 'D':
//                    System.out.println("回答错误");
//                    break;
//                case 'B':
//                    System.out.println("回答正确");
//                    score++;
//                    break;
//                default:
//                    break;
//            }
//            num++;
//            System.out.println("3:下列关于虚拟机说法错误的是");
//            System.out.println("A:虚拟机可以用硬件实现");
//            System.out.println("B:虚拟机可以用软件实现");
//            System.out.println("C:字节码是虚拟机的机器码");
//            System.out.println("D:虚拟机把代码程序与个操作系统和硬件分开");
//            System.out.print("请输入你的选择:");
//            input = sc.next().charAt(0);
//            switch (input) {
//                case 'B':
//                case 'C':
//                case 'D':
//                    System.out.println("回答错误");
//                    break;
//                case 'A':
//                    System.out.println("回答正确");
//                    score++;
//                    break;
//                default:
//                    break;
//            }
//            num++;
//        }
//        System.out.println("总分为" + score * 10);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入星期数:");
//        String day = sc.next();
//        switch(day){
//            case "星期一":
//                System.out.println("俯卧撑500次");
//                break;
//            case "星期二":
//                System.out.println("引起向上500次");
//                break;
//            case "星期三":
//                System.out.println("长跑20公里");
//                break;
//            case "星期四":
//                System.out.println("跳绳1000次");
//                break;
//            case "星期五":
//                System.out.println("倒立两小时");
//                break;
//            case "星期六":
//                System.out.println("重复某天运动即可");
//                break;
//            case "星期天":
//                System.out.println("休息");
//                break;
//            default:
//                break;
//        }
    }
}
