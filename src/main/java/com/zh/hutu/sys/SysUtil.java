package com.zh.hutu.sys;

import cn.hutool.system.JvmInfo;
import cn.hutool.system.SystemUtil;
import cn.hutool.system.UserInfo;

/**
 * @author: yunfeng
 * @date: 2022/3/7 9:55 AM
 */

public class SysUtil {
    public static void main(String[] args) {
        JvmInfo jvmInfo = SystemUtil.getJvmInfo();
        System.out.println(jvmInfo);

        UserInfo userInfo = SystemUtil.getUserInfo();
        System.out.println(userInfo);
    }
}
