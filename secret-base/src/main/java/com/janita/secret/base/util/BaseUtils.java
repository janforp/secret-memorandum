package com.janita.secret.base.util;

import java.util.Random;

/**
 * Created by Janita on 2017/6/11- 21:38
 * 该类是:
 */
public class BaseUtils {

    public static String getRandomVerifyCode() {
        String[] numbers = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String code = "";
        for (int i = 0; i< 4; i++) {
            int index = new Random(11).nextInt();
            code = code + numbers[index];
        }
        return code;
    }
}
