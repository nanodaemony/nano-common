package com.nano.common.util;

import com.github.yitter.idgen.YitIdHelper;

public class IdUtils {

    /** 获取短的雪花算法ID */
    public static long genId() {
        return YitIdHelper.nextId();
    }

}
