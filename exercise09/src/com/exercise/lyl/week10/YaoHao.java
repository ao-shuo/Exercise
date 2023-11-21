package com.exercise.lyl.week10;
import java.util.Scanner;
public class YaoHao {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 定义二维数组大小为20*20
        int[][] array = new int[20][20];

        System.out.println("********** 摇号程序 **********");

        // 定义flag，用于控制是否继续摇号
        int flag = 1;

        while (flag == 1) {
            // 随机生成位置
            int row = (int) (Math.random() * 20);
            int col = (int) (Math.random() * 20);

            // 检查位置是否已经摇出
            if (array[row][col] == -1) {
                System.out.println("该位置已经摇出，请重新摇号。");
                continue;
            }

            // 输出位置的行和列
            System.out.println("\n随机位置的行：" + row + "，列：" + col);

            // 标记该位置为-1，表示已经摇出
            array[row][col] = -1;

            // 输出分隔线
            System.out.println("----------------------------");

            // 提示是否继续摇号
            System.out.println("是否继续摇号？（继续输入1，停止输入0）");
            flag = scanner.nextInt();

            // 判断是否继续进行while循环
            if (flag != 0 && flag != 1) {
                System.out.println("输入无效，程序结束。");
                break;
            }
        }

        System.out.println("********** 程序结束 **********");
        scanner.close();
    }
}
