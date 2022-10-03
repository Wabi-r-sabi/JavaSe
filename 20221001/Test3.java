public class Test3 {
    public static void main(String[] args) {
//        int num = 9;
//        for (int i = 1; i <= num; i++) {  //i表示层数
//            if (i <= 5) {
//                //在输出*之前,输出对应空格
//                for (int k = 1; k <= 5 - i; k++) {
//                    System.out.print(" ");
//                }
//                //(2*i-1)控制打印每层*个数
//                for (int j = 1; j <= 2 * i - 1; j++) {
//                    System.out.print("*");
//                }
//                //每打印完一层*就换行
//                System.out.println();
//            } else {
//                //在输出*之前,输出对应空格
//                for (int k = 1; k <= i - 5; k++) {
//                    System.out.print(" ");
//                }
//                //2 * num - (2 * i - 1)控制打印每层*个数
//                for (int j = 1; j <= 2 * num - (2 * i - 1); j++) {
//                    System.out.print("*");
//                }
//                //每打印完一层*就换行
//                System.out.println();
//            }
//        }
        //        实验要求：
//        编写一个Java应用程序，实现下列功能：
//        1)程序随机分配给客户一个1—100之间的整数，自己查如何生成随机数
//        2)用户在输入自己的猜测；
//        3)程序返回提示信息，提示信息分别是：“猜大了”、“猜小了”和“猜对了”；
//        4)用户可根据提示信息再次输入猜测，直到提示信息是“猜对了”。
//拓展训练：
//        用户可以玩游戏多次，增加猜中的次数进行奖励，其他功能可自由拓展，丰富功能
//        Random r = new Random();
//        int count = 0;
//        int random = r.nextInt(100) + 1;
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入要猜的数字:");
//            int guess = sc.nextInt();
//            if (random > guess) {
//                System.out.println("猜小了");
//            } else if (random < guess) {
//                System.out.println("猜大了");
//            } else {
//                System.out.println("猜对了");
//                count++;
//                random = r.nextInt(100) + 1;
//            }
//            if (count == 2) {
//                System.out.println("奖励一架私人飞机");
//                break;
//            }
//        } while (true);
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
