package Test;

import java.util.Scanner;

public class MaxScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            //上课时间
            int time = input.nextInt();
            //可唤醒时间
            int wakeTime = input.nextInt();
            //每分钟的分
            int [] fenzhi = new int[time];
            for(int i = 0 ; i < time ; i++){
                fenzhi[i] = input.nextInt();
            }
            //每分钟的状态
            int [] isWaked = new int[time];
            int sum = 0;
            for(int j = 0 ; j < time ; j++){
                isWaked[j] = input.nextInt();
                sum += isWaked[j] * fenzhi[j];
            }
            //滑动窗口最大值
            int temp = 0;
            int max = 0;
            for(int i = 0 ; i <time ; i++){
                //添加0的分值
                if(isWaked[i] == 0){
                    temp += fenzhi[i];
                }
                //窗口形成 抛弃旧值
                if(i >= wakeTime && isWaked[ i - wakeTime] == 0){
                    temp -= fenzhi[i - wakeTime];
                }
                //总是更新为形成窗口中的最大值
                if(temp > max){
                    max = temp;
                }
            }
            System.out.println(max + sum);
    }
}
