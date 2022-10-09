import java.util.Arrays;

/**
 * @descriptions: Homework02
 * @author: 一只强
 * @date: 2022/10/8 16:30
 * @version: 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
//        int[] a = {57, 68, 34, 78, 46, 72};
//        System.out.println("排序前");
//        for (int i : a) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        Arrays.sort(a);
//        System.out.println("排序后");
//        for (int i : a) {
//            System.out.print(i + " ");
//        }
//        int[] a = {1, 2, 3, 4, 5};
//        int find = Arrays.binarySearch(a, 4);
//        System.out.println("数组中4的下标为" + find);
//        int[] par1 = {1, 2, 3, 4, 5};
//        int[] par2 = {3, 4, 5, 6, 7};
//        boolean flag = Arrays.equals(par1, par2);
//        System.out.println("两个数组比较结果:" + (flag ? "相等" : "不相等"));

//        int[] arr = {10, 7, 9, 2, 4, 5, 1, 3, 6, 8};
//                System.out.println("排序前");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        Arrays.sort(arr);
//        System.out.println("排序后");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//
//        int[] scr2 = {1, 2, 3, 4, 5, 6};
//        int[] test2 = Arrays.copyOfRange(scr2, 0, scr2.length);
//        for (int i : test2
//        ) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        int index = 0;
        int num = 12;
        int[] arr = {10, 11, 13, 14, 15};
        int[] arrNew = Arrays.copyOf(arr, arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {
                //找到元素要插入的位置
                index = i;
                break;
            }
        }
        //元素后移
        //index下标开始的元素后移一个位置
        if (arrNew.length - 1 - index >= 0) {
            System.arraycopy(arrNew, index, arrNew, index + 1, arrNew.length - 1 - index);
        }
        //for (int j = arrNew.length - 1; j > index; j--) {
        //index下标开始的元素后移一个位置
        //    arrNew[j] = arrNew[j - 1];
        //}
        //插入数据
        arrNew[index] = num;
        for (int i : arrNew
        ) {
            System.out.print(i + " ");
        }
    }
}
