package com.lixin.proxy.dynamicproxy;

import java.util.Arrays;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("¿œ ¶ ⁄øŒ÷–......");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello, " + name);
    }

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        System.out.println(Arrays.toString(teacherDao.getClass().getInterfaces()));
        System.out.println(teacherDao.getClass().getClassLoader());
    }

}