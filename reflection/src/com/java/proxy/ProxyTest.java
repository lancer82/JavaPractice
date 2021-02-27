package com.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * 动态代理的举例
 *
 * @author Thinlk
 * @create 2020-11-28 5:12 PM
 **/

interface Human {
    String getBelief();
    void eat(String food);
}
//被代理类
class Superman implements Human {

    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

/**
 * 要想实现动态代理，需要解决的问题？
 * 问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及对象
 * 问题二：当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法。
 */
class ProxyFactory {
    //调用此方法，返回一个代理类的对象，解决问题一
    public static Object getProxyInstance(Object obj) { //obj:被代理类的对象
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object obj; // 需要使用被代理类的对象进行赋值

    public void bind(Object obj) {
        this.obj = obj;
    }

    //通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invake()
    //将被代理类要执行的方法啊的功能就声明在invoke() 中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //上述方法的返回值作为当前类中的invoke()的返回值；
        return method.invoke(obj,args);
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        Superman superman = new Superman();
        //proxyInstance: 代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superman);
        String belief =  proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("四川麻辣烫");


        System.out.println("********************************");

        NikeClothFactory nikeClothFactory = new NikeClothFactory();

        ClothFactory clothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);

        clothFactory.produceCloth();
    }
}
