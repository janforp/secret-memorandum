package com.janita.secret.common.util;

import java.util.UUID;

/**
 * Created by Janita on 2017/6/11- 15:15
 * 该类是:
 */
public class CommonUtils {

    public static long currentTime() {
        return System.currentTimeMillis();
    }

    public static String produceUUID() {
        UUID uuid =  UUID.randomUUID();
        return uuid.toString();
    }
}
