package com.prototype;

/**
 * Prototype设计模式的好处
 * 同一个类，改变一下属性值就可以新增一个“子类型”的时候，开销较小。
 * 无需很多个真正子类，类层次结构较简单。
 * messagebox1，messagebox2类型非常相似，都是打印一个内容和一个内容框，
 * 它们都源自MessageBox，只是装饰字符的属性有不同值而已。
 */
public class ManagerTest {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("messagebox1", new MessageBox('*'));
        manager.register("messagebox2", new MessageBox('/'));
        manager.register("underline1", new UnderLinePen('~'));
        manager.register("underline2", new UnderLinePen('#'));

        manager.create("messagebox1").use("你好");
        manager.create("messagebox2").use("你好");
        manager.create("underline1").use("设计模式");
        manager.create("underline2").use("design pattern");
    }
}
