package com.lixin.template.improve_me;

//抽象类,表示豆浆制作的模板类
public abstract class SoyMilk {

    //模板方法make(),模板方法可以使用final修饰,不让子类去覆盖
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    //选原料
    void select() {
        System.out.println("第一步:选择好的新鲜黄豆");
    }

    //钩子方法:空实现
    void addCondiments() {
        //nothing
    }

    //浸泡
    void soak() {
        System.out.println("第三步:黄豆和配料开始浸泡,需要3小时");
    }

    //打碎
    void beat() {
        System.out.println("第四步:黄豆和配料放到豆浆机去打碎");
    }

}