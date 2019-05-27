package com.imton.reptile.demo.utils;

import java.util.UUID;

/**
 * @ClassName UUidTools
 * @Description TODO
 * @Author Mr.X
 * @Date 2019/5/22 16:03
 * @Version 1.0
 **/
public class UUidTools {

    public static String getuuid(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}
