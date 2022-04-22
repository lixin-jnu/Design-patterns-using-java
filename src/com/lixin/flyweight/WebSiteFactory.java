package com.lixin.flyweight;

import java.util.HashMap;

//网站工厂类,根据需要返回压一个网站
public class WebSiteFactory {

    //Map集合:充当池的作用
    private HashMap<String, ConcreteWebSite> pools = new HashMap<>();

    //根据网站的类型,返回一个网站,如果没有就创建一个所需的网站,并放入到池中,然后返回
    public WebSite getWebSiteCategory(String type) {
        if (!pools.containsKey(type)) {
            //创建一个网站,并放入到池中
            pools.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pools.get(type);
    }

    //获取网站类型的数量(池中有多少个网站类型)
    public int getWebSiteCount() {
        return pools.size();
    }

}