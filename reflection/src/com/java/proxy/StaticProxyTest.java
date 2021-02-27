package com.java.proxy;

/**
 *
 * 静态代理举例
 * @author Thinlk
 * @create 2020-11-28 4:08 PM
 **/
interface  ClothFactory{

    void produceCloth();

}

//代理类
class ProxyClothFactory implements ClothFactory {

    private ClothFactory factory; //用被代理类对象实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续的收尾工作");
    }
}

class NikeClothFactory implements ClothFactory {

    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}
public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类的对象
        ClothFactory nike = new NikeClothFactory();
        //创建代理类的对象
        ClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();
    }
}
