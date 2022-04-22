package com.lixin.flyweight;

//具体网站
public class ConcreteWebSite extends WebSite {

    //type:共享的部分(内部状态)
    private String type;//网站发布的形式(类型)

    //构造器
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {//User:不共享的部分(外部状态)
        System.out.println("网站的发布形式为:" + type + ",用户为:" + user.getName());
    }

}