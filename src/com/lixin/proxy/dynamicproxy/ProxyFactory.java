package com.lixin.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    //ά��һ��Ŀ�����Object
    private Object target;

    //������,��target���г�ʼ��
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //��Ŀ���������һ���������
    public Object getProxyInstance() {
		/*
		 * public static Object newProxyInstance(ClassLoader loader,
         *                                       Class<?>[] interfaces,
         *                                       InvocationHandler h)
         * 1.ClassLoader loader:ָ����ǰĿ�����ʹ�õ��������,��ȡ�������ķ�ʽ�̶�;
         * 2.Class<?>[] interfaces:ָ����ǰĿ�����ʵ�ֵĽӿ�����,ʹ�÷��ͷ�ʽȷ������;
         * 3.InvocationHandler h:�¼�����,ִ��Ŀ�����ķ���ʱ,�ᴥ���¼�����������,��ѵ�ǰִ�е�Ŀ����󷽷���Ϊ��������;
		 */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                      target.getClass().getInterfaces(),
                                      new InvocationHandler() {
        	                              @Override
										  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        	                              	  System.out.println("JDK����ʼ~~");
        	                              	  //������Ƶ���Ŀ�����ķ���
											  Object returnVal = method.invoke(target, args);
											  System.out.println("JDK�����ύ~~");
											  return returnVal;
        	                              }
                                      });
    }

}