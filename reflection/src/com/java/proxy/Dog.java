package com.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Dog {
    void info();
    void run();
}

class HuntingDog implements Dog {

    @Override
    public void info() {
        System.out.println("我是一只来自北方的猎狗");
    }

    @Override
    public void run() {
        System.out.println("我奔跑在旷野中");
    }
}

class DogUtil {
    void eatFood() {
        System.out.println("吃个骨头跑得快");
    }
    void sleep() {
        System.out.println("睡觉回复体力");
    }
}

class DogInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtil dogUtil = new DogUtil();
        dogUtil.eatFood();
        Object result = method.invoke(target,args);
        dogUtil.sleep();
        return result;
    }
}

class DogProxy {
    public static Object getDogProxyInstance(Object obj) {
        DogInvocationHandler dogInvocationHandler = new DogInvocationHandler();
        dogInvocationHandler.setTarget(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),dogInvocationHandler);
    }

}

class DogTest {
    public static void main(String[] args) {
        HuntingDog huntingDog = new HuntingDog();
        Dog dogProxy = (Dog) DogProxy.getDogProxyInstance(huntingDog);
        dogProxy.info();
        dogProxy.run();
    }
}