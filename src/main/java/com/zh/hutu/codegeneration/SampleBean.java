package com.zh.hutu.codegeneration;

import cn.hutool.extra.cglib.CglibUtil;
import lombok.Data;
import lombok.ToString;

import java.lang.reflect.Field;

/**
 * @author: yunfeng
 * @date: 2022/3/7 10:57 AM
 */

@ToString
@Data
public class SampleBean {
    public String value;

    public static void main(String[] args) throws NoSuchFieldException {
        SampleBean sampleBean = new SampleBean();
        sampleBean.value = "Hello";

        AnotherSampleBean anotherSampleBean = new AnotherSampleBean();
        Field value = anotherSampleBean.getClass().getDeclaredField("value");
        value.setAccessible(true);
        CglibUtil.copy(sampleBean, anotherSampleBean);
        CglibUtil.copy(sampleBean, anotherSampleBean);
        System.out.println(anotherSampleBean.value);
        AnotherSampleBean copy = CglibUtil.copy(sampleBean, AnotherSampleBean.class);
        System.out.println(copy);
    }
}

@ToString
@Data
class AnotherSampleBean{
    public String value;
}
