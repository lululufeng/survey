package com.luxf.utils;

import com.google.common.collect.Maps;
import com.luxf.entity.Admin;
import org.checkerframework.checker.units.qual.A;
import org.springframework.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Timber
 * @date : 2020/9/30
 * @description:
 */

public class BeanMapUtils {
    public static <T> Map<String, Object> beanToMap(T bean){
        Map<String, Object> map = Maps.newHashMap();
        if (bean != null){
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()){
                map.put(key+"", beanMap.get(key));
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setName("sdad");
        admin.setPassword("sd22222ad");
        Map<String, Object> map = beanToMap(admin);
        System.out.println(map);
    }
}
