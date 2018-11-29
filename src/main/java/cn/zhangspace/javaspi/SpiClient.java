package cn.zhangspace.javaspi;

import cn.zhangspace.javaspi.spidemo.HelloInterface;

import java.util.ServiceLoader;

public class SpiClient {

    public static void main(String[] args) {
        ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);
        for (HelloInterface d : loaders) {
            d.sayHello();
        }
    }
}
