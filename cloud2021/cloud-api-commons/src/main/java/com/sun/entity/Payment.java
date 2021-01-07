package com.sun.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
//它是lombok中的注解,作用在类上;
//        使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor
//注解在类上，为类提供一个无参的构造方法。
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
