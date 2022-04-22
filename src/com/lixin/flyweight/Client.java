package com.lixin.flyweight;

public class Client {

    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();
        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));
        //客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("jack"));
        //客户要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("mary"));
        //客户要一个以博客形式发布的网站
        WebSite webSite4 = factory.getWebSiteCategory("博客");
        webSite4.use(new User("king"));
        System.out.println("网站类型=" + factory.getWebSiteCount());
        //享元模式在Integer中的应用(IntegerCache[-128,127])
		Integer _1 = Integer.valueOf(127);
		Integer _2 = Integer.valueOf(127);
		System.out.println(_1 == _2);//true
    }

}