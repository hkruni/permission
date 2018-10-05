package com.mmall.util;

import org.apache.commons.lang3.StringUtils;

public class LevelUtil {

    public final static String SEPARATOR = ".";//各个层级之间的分隔符

    public final static String ROOT = "0";



    // 0
    // 0.1
    // 0.1.2
    // 0.1.3
    // 0.4
    /**
     *
     * @param parentLevel 上一级部门level
     * @param parentId上一级部门id
     * @return
     */
    public static String calculateLevel(String parentLevel, int parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return ROOT;
        } else {
            return StringUtils.join(parentLevel, SEPARATOR, parentId);
        }
    }
}
