/**
 * @descriptions: Homework03
 * @author: 一只强
 * @date: 2022/10/13 19:39
 * @version: 1.0
 */
//public class Homework03 {
//    public static void main(String[] args) {
//        printStar(4,5);
//    }
//    public static void printStar(int row,int col) {
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

public class Homework03 {
    public static void main(String[] args) {
        System.out.println(isEqual((byte) 55, (byte) 66));
        System.out.println(isEqual((short) 55, (short) 66));
        System.out.println(isEqual(55, 66));
        System.out.println(isEqual((long)Math.pow(2,55),(long) Math.pow(2,66)));
    }

    public static boolean isEqual(byte a, byte b) {
        return a == b;
    }

    public static boolean isEqual(short a, short b) {
        return a == b;
    }

    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    public static boolean isEqual(long a, long b) {
        return a == b;
    }
}

//public class Homework03 {
//    public static void main(String[] args) {
//        System.out.println("矩形的面积为" + culateArea(20, 30));
//        System.out.println("三角形的面积为" + culateArea(4.5, 6.6));
//        System.out.println("圆的面积为" + String.format("%.2f", culateArea(3)));
//    }
//
//    public static int culateArea(int length, int width) {
//        return length * width;
//    }
//
//    public static double culateArea(double a, double b) {
//        return 0.5 * a * b;
//    }
//    public static double culateArea(int r) {
//        return (Math.PI)*r*r;
//    }
//
//}