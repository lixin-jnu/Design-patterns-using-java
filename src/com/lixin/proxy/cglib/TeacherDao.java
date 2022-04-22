package com.lixin.proxy.cglib;

//目标对象所对应的类不需要再继承接口
public class TeacherDao {

    public String teach() {
        System.out.println("老师授课中......");
        return "知识";
    }

}