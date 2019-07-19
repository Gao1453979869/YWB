package com.ywb.common.util;

import java.util.Random;

public class Random_Util {
    // 根据传入的位数，生成制定长度的随机数字
    public static int cresteNum(int len){
        Random random = new Random();
        int num= (int) Math.pow(10,len-1);
        return random.nextInt((int)(Math.pow(10,len)-num))+num;
    }
}
