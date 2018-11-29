package cn.zhangspace.javaspi.spidemo;

public class TextHello implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("Text Hello.");
    }
}
