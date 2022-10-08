/**
 * @descriptions: MiGong
 * @author: 一只强
 * @date: 2022/10/8 15:40
 * @version: 1.0
 */
public class MiGong {
    public static void main(String[] args) {
        //思路
        //1.先创建迷宫,用二维数组表示  int[][] map = new int[7][8] 8行7列
        //2.先规定map数组值,0表示可以走,1表示不能走
        int[][] map = new int[8][7];
        //将最上面一行和最下面一行全部赋为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //将最右边一列和最左边一列全部赋为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //输出地图
        System.out.println("=====当前地图情况为=====  ");
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[] i : map) {
            for (int j : i
            ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        Cc c = new Cc();
        //使用findWay
        c.findWay(map, 1, 1);
        System.out.println("\n=====找路的情况如下======");
        for (int[] i : map) {
            for (int j : i
            ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class Cc {
    //使用递归回溯的思想解决老鼠出迷宫
    //1.findWay方法就是专门找出迷宫的路径
    //2.如果找到,就返回true,否则返回false
    //3.map就是二维数组,表示迷宫
    //4.i,j就是老鼠的位置,初始化位置为(1,1)
    //5.因为是递归线路,首先规定map数组的各个值含义
    // 0表示可以走  1表示障碍物  2表示通路  3表示死路
    //6.当map[6][5]=2表示成功,否则继续
    //7.策略:下->右->上->左->

    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {//说明已经找到
            return true;
        } else {
            if (map[i][j] == 0) {//当前位置在初始位置
                //假定可以走通
                map[i][j] = 2;
                //使用策略测试,来确定该位置是否可以走通
                //下->右->上->左 
                if (findWay(map, i + 1, j)) {//下
                    return true;
                } else if (findWay(map, i, j + 1)) {//右
                    return true;
                } else if (findWay(map, i - 1, j)) {//上
                    return true;
                } else if (findWay(map, i, j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {//map[i][j]=1,2,3
                return false;
            }
        }
    }
}