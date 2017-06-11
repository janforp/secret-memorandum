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

    public static boolean isEmpty(Object object) {
        if (object == null) {
            return true;
        }
        if (object instanceof String) {
            String string = (String) object;
            if ("".equals(string.trim())) {
                return true;
            }
        }
        return false;
    }
}
